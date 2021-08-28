package com.gateway

import com.controller.Producto
import org.springframework.stereotype.Repository
import java.util.*
import java.util.function.Predicate
import java.util.stream.Collector
import java.util.stream.Collectors


@Repository
class ProductoGatewayImpl : ProductoGateway{

    val productos = ArrayList<Producto>();

    override fun crearProducto(producto: Producto) {
        productos.add(producto);
    }

    override fun obtenerProductos(): List<Producto> =
        productos

    override fun borrarProducto(idProducto: String) {
        val producto = productos.stream().filter { x -> x.id.contains(idProducto)}.collect(Collectors.toList());
        productos.remove(producto)
    }

}