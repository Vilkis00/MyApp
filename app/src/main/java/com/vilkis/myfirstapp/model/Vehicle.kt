package com.vilkis.myfirstapp.model

open class Vehicle (
    var id: Int,
    var plate: String,
    var color: String,
    var year: String,
    var brand: String): AbstractClass() {

    open fun accelerate() {
        println("Función base de aceleración")
    }

    override fun getInt(): Int {
        TODO("Not yet implemented")
    }

    override fun getIt() {
        TODO("Not yet implemented")
    }
}