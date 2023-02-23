package com.alexandrestefani.variaveis

class HighOrderFunction {
}

fun main() {
    val sumaquadr : (Double,Double) -> Unit = {val1, val2 -> println("A soma dos quadrados é ${(val1*val1)+(val2*val2)}")}
    val quadradsum = {val1: Double,val2:Double -> println("A soma dos quadrados é ${(val1*val1)+(val2*val2)}") }

    val div2: (Int) -> Double = {(it*1.0)/2}
    println(div2(5))


    primeirafuncaoSuperior("hello","are you ok?",::concatTexts)
    operationsmat(5.0,6.0,::summat)
    operationsmat(5.0,6.0,::multmat)
    operationsmat(5.0,6.0,:: subtmat)
    operationsmat(5.0,6.0,:: divmat)
    operationsmat(5.0,6.0,sumaquadr)
    operationsmat(5.0,6.0,quadradsum)
    operationsmat(5.0,6.0,{a: Double,b: Double -> println("O resto da visisão $a com $b é igual a ${a%b}")})
    operationsmat(5.0,6.0,{
        r: Double, t:Double ->
        println("O primeiro valor ($r), ")
        println("dividido pelo quadrado de $t é igual :")
        println(r/(t*t))

    })



}





fun concatTexts(val1: String, val2: String) = println(val1+" "+val2)


fun primeirafuncaoSuperior (text1: String, text2: String, operaration: (String, String)->Unit){
    operaration (text1,text2)
}
fun operationsmat (first: Double, second: Double, operation2:(Double,Double)->Unit){
    operation2(first, second)
}
fun summat (val1: Double, val2: Double) = println("Soma: ${val1+val2}")
fun multmat (val1: Double, val2: Double) = println("Multiplicacao: ${val1*val2}")
fun subtmat (val1: Double, val2: Double) = println("Subtraçao: ${val2-val1}")
fun divmat (val1: Double, val2: Double) = println("Divisao: ${val1/val2}")
