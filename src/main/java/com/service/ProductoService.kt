package com.service

import com.controller.Producto

interface ProductoService {
    fun crearProducto(producto: Producto);
    fun obtenerProductos(): List<Producto>
    fun borrarProducto(idProducto: String);
    fun actualizarProduct(productId:String, producto: Producto)
}