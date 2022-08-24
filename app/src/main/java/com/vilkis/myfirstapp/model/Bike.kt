package com.vilkis.myfirstapp.model

class Bike (
    var drift: Boolean,
    id: Int,
    plate: String,
    color: String,
    year: String,
    brand: String):
    Vehicle(id, plate, color, year, brand) {

    override fun accelerate() {
        println("Se gira el acelerador")
    }
}