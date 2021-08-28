package com.controller

import java.util.*

data class Producto(var id: String = UUID.randomUUID().toString(), var nombre: String, var sku: String, var descripcion: String, var precio: Float, var descuento: Boolean)
