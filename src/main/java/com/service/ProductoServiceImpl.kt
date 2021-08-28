package com.service

import com.controller.Producto
import com.gateway.ProductoGateway
import org.springframework.stereotype.Service

@Service
class ProductoServiceImpl(private val productoGateway: ProductoGateway) : ProductoService {
    override fun crearProducto(producto: Producto) {
        productoGateway.crearProducto(producto);
    }

    override fun obtenerProductos(): List<Producto> =
        productoGateway.obtenerProductos();

    override fun borrarProducto(idProducto: String){
        productoGateway.borrarProducto(idProducto);
    }

}