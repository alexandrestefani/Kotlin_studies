package com.alexandrestefani.variaveis

class Operadores {
}

fun main() {
    var a: Int = 10
    var b: Int = 5
    var resultadosome: Double
    resultadosome= a.toDouble() + b.toDouble()
    val template = "A soma da de $a + $b = $resultadosome"

    val nome= "Alexandre"
    val template2 ="Meu nome é $nome, meu nome tem ${nome.length} letras"
    println(template)
    println(template2)


}