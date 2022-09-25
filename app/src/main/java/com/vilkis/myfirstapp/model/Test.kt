package com.vilkis.myfirstapp.model

class Test(
    private var id: Int,
    private var nullTestVar: String? = null,
    private var text: String): Interface {

    companion object {
        var prueba = "AH"

        enum class Testing(val texto: String) {
            HOLA("Hola"), ADIOS("Adiós")
        }
    }

    constructor() : this(0, null, "")

    override var variable: String?
        get() = null
        set(value) {}

    override fun getString(): String {
        TODO("Not yet implemented")
    }

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