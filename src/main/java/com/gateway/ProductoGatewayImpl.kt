package com.gateway

import com.controller.Producto
import org.springframework.stereotype.Repository
import java.util.*

@Repository
class ProductoGatewayImpl(private val productoRepositorio: ProductoRepositorio) : ProductoGateway{

    override fun crearProducto(producto: Producto) {
        if (producto.descuento) {
            val productos = Producto(UUID.randomUUID().toString(), producto.nombre, producto.sku, producto.descripcion, producto.precio/2, true);
            productoRepositorio.save(productos);
        } else {
            productoRepositorio.save(producto);
        }


    }

    override fun obtenerProductos(): List<Producto> =
            productoRepositorio.findAll();

    override fun borrarProducto(idProducto: String) {
        productoRepositorio.deleteById(idProducto);
    }

    override fun actualizarProduct(productId:String, producto: Producto) {
        if(productoRepositorio.existsById(productId)) {
            if (producto.descuento) {
                val productos = Producto(productId, producto.nombre, producto.sku, producto.descripcion, producto.precio/2, producto.descuento);
                productoRepositorio.save(producto);
            } else {
                productoRepositorio.save(producto);
            }
        }

    }

}