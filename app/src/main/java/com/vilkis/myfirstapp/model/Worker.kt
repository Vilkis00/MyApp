package com.vilkis.myfirstapp.model

data class Worker(
    val name: String = "",
    val age: Int = 0,
    val work: String = ""
) {
    var lastWork = ""
}
