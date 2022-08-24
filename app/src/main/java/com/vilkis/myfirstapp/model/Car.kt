package com.vilkis.myfirstapp.model

class Car (
    var doors: Int,
    id: Int,
    plate: String,
    color: String,
    year: String,
    brand: String):
    Vehicle(id, plate, color, year, brand) {

    override fun accelerate() {
        super.accelerate()
        println("Se pisa el pedal del acelerador")
    }
}