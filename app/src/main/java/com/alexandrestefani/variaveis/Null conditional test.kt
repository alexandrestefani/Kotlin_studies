package com.alexandrestefani.variaveis

class Testes_condicoes_null {
}

fun main() {
    var primeiro_valor : Int? = null
    var segundo_valor: Int = 2
    var resulado = (primeiro_valor ?:1) + segundo_valor
    println(resulado)


}