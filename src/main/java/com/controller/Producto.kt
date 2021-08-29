package com.controller

import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "producto")
data class Producto(
        @Id
        var id: String,
        var nombre: String,
        var sku: String,
        var descripcion: String,
        var precio: Float,
        var descuento: Boolean)
