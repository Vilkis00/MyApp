package com.vilkis.myfirstapp.model

open class Vehicle (
    var id: Int,
    var plate: String,
    var color: String,
    var year: String,
    var brand: String) {

    open fun accelerate() {
        println("Función base de aceleración")
    }
}