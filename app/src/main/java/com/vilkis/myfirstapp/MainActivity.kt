package com.vilkis.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vilkis.myfirstapp.model.*
import myfirstapp.R
import java.util.*
import kotlin.collections.ArrayList
import kotlin.concurrent.thread

typealias MyMapList = MutableMap<Int, ArrayList<String>>
typealias MyFun = (Int, String, MyMapList) -> Boolean
typealias MyNestedClass = Test.NestedClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Llamados de funciones
        //variablesAndConstants()
        //dataTypes()
        //ifStatement()

        //nullSafety()
        //inheritance()
        //nestedAndInnerClass()
        //enumClass()
        //dataClasses()
        //typeAliases()
        //destructuringDeclarations()
        //extensions()
        //lambdas()
    }

    /*
    Variables y constantes
     */
    private fun variablesAndConstants() {
        //Variables
        var myFirstVariable = "Hola Vilkis"
        println(myFirstVariable)

        var myFirstNumber = 1
        println(myFirstNumber)

        myFirstVariable = "Bienvenido Vilkis"
        println(myFirstVariable)

        var mySecondVariable = "Segunda variable"
        println(mySecondVariable)

        mySecondVariable = myFirstVariable
        println(mySecondVariable)

        myFirstVariable = "Ya cenaste?"
        println(myFirstVariable)

        //Constantes
        val myFirstConstant = "Te está gustando Kotlin?"
        println(myFirstConstant)

        val mySecondConstant = myFirstVariable
        println(mySecondConstant)
    }

    /*
    Tipos de datos
     */
    private fun dataTypes() {
        //String
        val myString: String = "Hola Vilkis"
        val myString2 = "Bienvenido Vilkis"
        val myString3 = "$myString $myString2"
        println(myString3)

        //Enteros (Byte, Short, Int, Long)
        val myInt: Int = 1
        val myInt2 = 2
        val myInt3 = myInt + myInt2
        println(myInt3)

        //Decimales (Float, Double)
        val myDouble: Double = 1.5
        val myDouble2 = 2.6
        val myDouble3 = 1
        val myDouble4 = myDouble + myDouble2 + myDouble3
        println(myDouble4)

        //Boolean (Bool)
        val myBool: Boolean = true
        val myBool2 = false
        println(myBool == myBool2)
        println(myBool && myBool2)
    }

    /*
    Sentencia if
     */
    private fun ifStatement() {
        val myNumber = 60

        /*
        Operadores condicionales
        > mayor que
        < menor que
        >= mayor o igual que
        <= menor o igual que
        == igualdad
        != desigualdad
         */

        /*
        Operadores lógicos
        && y
        || o
        ! no
         */

        // !(in = myNumber > 5 && myNumber <= 10)
        if (myNumber !in 6..10 || myNumber == 53) {
            println("$myNumber es menor o igual que 10 y mayor que 5 o es igual a 53")

        } else if (myNumber != 60) {
            println("$myNumber es igual a 60")

        } else {
            println("$myNumber es mayor que 10 o menor o igual 5 y no es igual a 53")
        }
    }

    /*
    Null safety
     */
    private fun nullSafety() {
        var variable: String? = "Daniel"
        println(variable)

        variable = null
        println(variable)

        val bool = true
        //variable = bool ? "Morales" : null
        variable = if (bool) "Morales" else null

        variable?.let {
            println(it)
        } ?: run {
            println("El valor es nulo")
        }
    }

    /*
    Herencia y polimorfismo
     */
    private fun inheritance() {
        val car = Car(4, 1, "001", "Rojo", "1998", "Mazda")
        val bike = Bike(true, 2, "002", "Negro", "2000", "Suzuki")

        var vehicle: Vehicle = car
        vehicle.accelerate()

        vehicle = bike
        vehicle.accelerate()
    }

    /*
    Clases anidadas e internas
     */
    private fun nestedAndInnerClass() {
        val nestedClass = Test.NestedClass()
        println(nestedClass.nested)

        val innerClass = Test().InnerClass()
        println(innerClass.inner)
    }

    /*
    Enum class
     */
    private fun enumClass() {
        println(Test.Companion.Testing.HOLA.texto)
    }

    /*
    Data classes: clases enfocadas principalmente a trabajar datos
     */
    private fun dataClasses() {
        val vilkis = Worker("Daniel Morales", 24, "Desarrollador")
        vilkis.lastWork = "Practicante"

        val constructorVacio = Worker()

        //equals & hashCode
        println(if (vilkis == constructorVacio) "Son iguales" else "No son iguales")

        //toString
        println(vilkis.toString())

        //copy
        val vilkis2 = vilkis.copy(age = 25)

        //componentN
        val (name, age) = vilkis
        println(name)
        println(age)
    }

    /*
    Type aliases: alias para tipos de datos, la idea es facilitar el uso de tipos complejos
     */
    private var myMap: MyMapList = mutableMapOf()

    private fun typeAliases() {
        val myNewMap: MyMapList = mutableMapOf()
        myNewMap[1] = arrayListOf("Daniel", "Morales")
        myNewMap[2] = arrayListOf("Vilkis")

        myMap = myNewMap

        val nestedClass = MyNestedClass()
        println(nestedClass.nested)
    }

    /*
    Destructuring declarations
     */
    private fun destructuringDeclarations() {
        val (name, age, work) = Worker("Daniel Morales", 24, "Desarrollador")
        println("$name, $age, $work")

        val vilkis = Worker("Daniel Morales", 24, "Desarrollador")
        println("${vilkis.component1()}, ${vilkis.component2()}, ${vilkis.component3()}")

        val (name2, age2, work2) = myWorker()
        println("$name2, $age2, $work2")

        val myMap = mapOf(1 to "Daniel", 2 to "Morales", 3 to "Restrepo")
        for (element in myMap) {
            println("${element.key}, ${element.value}")
            println("${element.component1()}, ${element.component2()}")
        }

        for ((id, text) in myMap) {
            println("$id, $text")
        }

        val (name3, _, work3) = Worker("Daniel Morales", 24, "Desarrollador")
        println("$name3, $work3")
    }

    private fun myWorker(): Worker {
        return Worker("Daniel Morales", 24, "Desarrollador")
    }

    /*
    Extensiones
     */
    private fun extensions() {
        val myDate = Date()
        println(myDate.customFormat())
        println(myDate.formatSize)

        var myDateNullable: Date? = null
        println(myDateNullable.customFormat())
        println(myDateNullable.formatSize)
    }

    private fun lambdas() {
        val myIntList = arrayListOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val myFilterIntList = myIntList.filter { myInt ->
            println(myInt)

            if (myInt == 1) {
                return@filter true
            }
            myInt > 5
        }
        println(myFilterIntList)

        val mySumFun = fun(x: Int, y: Int): Int = x + y
        val myMultFun = fun(x: Int, y: Int): Int = x * y

        myAsyncFun("Daniel") { println(it) }

        println(myOperateFun(5, 10, mySumFun))
        println(myOperateFun(5, 10, myMultFun))
        println(myOperateFun(5, 10) { x, y -> x - y })
    }

    private fun myOperateFun(x: Int, y: Int, myFun: (Int, Int) -> Int): Int {
        return myFun(x, y)
    }

    private fun myAsyncFun(name: String, hello: (String) -> Unit) {
        val myNewString = "Hello $name!"
        thread {
            Thread.sleep(5000)
            hello(myNewString)
        }
    }
}