package com.alexandrestefani.variaveis

class Extensions {
}
// testes sobre extencao de funcoes  - tests about extension of function
fun main() {

    var numero=7

    // testes com infix - tests about infix function
    println(numero.Divisor_por_3())
    val contagem = 5.0 myMult 2.0
    println(contagem)


    // retorna se o número é primo pela extension function - function that retourn if is prime number.
    println(numero.ehprimo())

}

// Extensão de
fun Int.Divisor_por_3(): Boolean {
    return this% 3 == 0
}
fun Int.ehprimo(): Boolean {
    var cont:Int = 0
    for(i in 1..this){
        if((this % i) ==0){cont=cont+1}
    }
    return cont ==2
}
// Função do tipo infix serve sempre para atuar com 2 termos.
infix fun Double.myMult (number: Double): Double{
    return this*number
}

