package com.vilkis.myfirstapp.model

class Test(
    private var id: Int,
    private var nullTestVar: String? = null,
    private var text: String) {

    companion object {
        var prueba = "AH"

        enum class Testing(val texto: String) {
            HOLA("Hola"), ADIOS("Adiós")
        }
    }

    constructor() : this(0, null, "")

    private fun nothing() {
        for (i in 0..id)
            println(text)

        for (i in 10 downTo 0) {
            println()
        }
    }

    fun something() {
        nothing()
    }

    class NestedClass {
        var nested = 0
    }

    inner class InnerClass {
        var inner = 0
    }
}