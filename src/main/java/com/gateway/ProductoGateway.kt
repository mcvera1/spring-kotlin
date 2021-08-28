package com.gateway

import com.controller.Producto

interface ProductoGateway {
    fun crearProducto(producto: Producto);
    fun obtenerProductos(): List<Producto>
    fun borrarProducto(idProducto: String);
    fun actualizarProduct(productId:String, producto: Producto);
}