package com.ditgrau.androidmaster

//variables
fun main(){

    //NUMERICAS

        //integer
    val age3:Int = 30
        //long, para valores superiores a 2,147,483,647 o inferiores al mismo num en negativo
    val example:Long = 30
        //Float
    val floatExample:Float = 30.5f //hay que poner la 'f'
        //Double
    val doubleExample:Double = 3245.87687 //tiene que llevar '.'

    //ALFANUMERICAS

        //Char
    val charExample1:Char = 'e'
    val charExample2:Char = '2'
    val charExample3:Char = '@'
        //String
    val stringExample:String = "Ditgrau"

    //Booleans
    val booleanExample:Boolean = true
    val booleanExample2:Boolean = false

    println(stringExample) //println hace salto de linea

    val age:Int = 30
    var age2:Int = 28

    age2=33
    println(age2)

    //FUNCIONES ARITMETICAS

    //igual para sumar, restar, multiplicar*, dividir/ y el módulo%
    println(age+age2)
}
