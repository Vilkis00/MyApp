package com.vilkis.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vilkis.myfirstapp.model.Bike
import com.vilkis.myfirstapp.model.Car
import com.vilkis.myfirstapp.model.Vehicle
import myfirstapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Llamados de funciones
        //variablesAndConstants()
        //dataTypes()
        //ifStatement()

        val car = Car(4, 1, "001", "Rojo", "1998", "Mazda")
        car.doors = 3
        car.year = "1999"
        val bike = Bike(true, 2, "002", "Negro", "2000", "Suzuki")

        test(car)
        test(bike)
    }

    private fun test(vehicle: Vehicle) {
        vehicle.accelerate()
        println(vehicle.year)
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
}