package com.gateway

import com.controller.Producto
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductoRepositorio : JpaRepository<Producto, String> {
}