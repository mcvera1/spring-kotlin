package com.service

import com.gateway.CarritoGateway
import org.springframework.stereotype.Service

@Service
class CarritoServiceImpl(private val carritoGateway: CarritoGateway) : CarritoService{
}