package com.alexandrestefani.variaveis

class Condicionais {
}

fun main() {


    // Experimentos lógicos
    println("\n\n************* TESTE LOGICO *************\n")
    var a = 2
    var b = 3
    var c = 1.5
    val z ="número"

    var conclusoes = when{
        a < b && a < c -> "1° $z é menor"
        b < a -> "2° $z é o menor"
        else -> "3° $z é o menor"

    }

    var conclusoes2 = when{
        a > b && a > c -> "1° $z é o maior"
        b > a -> "2° $z é o maior"
        else -> "3° $z é o maior"
    }
    println("Entre os numeros ( $a ; $b ; $c ) \npodemos dizer que  $conclusoes e que $conclusoes2")
    println("\n\n************** TESTE LOGIN **************\n")


    // teste de login
    var nome = "Alexandre"
    var sobrenome = "Stefani"
    var chave = "Alexandre Stefani"

    when{
        chave == nome + " " + sobrenome -> println("Bem-vindo $chave!")
        else -> println("Login não encontrado")
    }

    println("\n*****************************************\n")

}