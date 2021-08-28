package com.controller

import com.service.ProductoService
import org.springframework.web.bind.annotation.*

@RestController
class ProductoController(private val productoService: ProductoService) {

    @GetMapping("/productos")
    fun obtenerProductos(): List<Producto> =  productoService.obtenerProductos()

    @PostMapping("/producto")
    fun crearProducto(@RequestBody producto: Producto) {
        productoService.crearProducto(producto);
    }

    @DeleteMapping("/producto/{id}")
    fun borrarProducto( @PathVariable("id") id: String) {
        productoService.borrarProducto(id);
    }

    @PostMapping("/producto/{id}")
    fun borrarProducto( @PathVariable("id") id: String, @RequestBody producto: Producto) {
        productoService.actualizarProduct(id, producto);
    }
}