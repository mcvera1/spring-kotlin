package com.controller

import com.service.CarritoService
import org.springframework.web.bind.annotation.RestController

@RestController
class CarritoController(private val carritoService: CarritoService) {
}