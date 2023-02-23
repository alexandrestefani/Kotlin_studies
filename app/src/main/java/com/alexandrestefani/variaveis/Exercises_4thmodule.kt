package com.alexandrestefani.variaveis

class Exercises_4thmodule {
}

fun main() {
    // Exercício 1: Criar uma função que receba 2 numeros inteiros de parametros e retorne o resultado da soma.
    // Exercício 2: Crie uma função compacta que receba 2 numeros inteiros de parametros e retorne o resultado da multiplicação deles
    // Crie uma função calculadora que recebe dois numeros inteiros de parametros e um terceiro parametro do tipo função. Essa função deve receber 2 inteiros de função e retornar um inteiro
    //    a) teste a função passando 2 inteiros e a função soma.
    //    b) teste essa função passando os mesmos numeros inteiros do teste anterior mas passando a função multiplicação dessa vez.

    //Exercicio 1:
    mysome(6,3)
    calculadora1(6,3,::mysome)
    //Exercício 2:
    val multiplicar: (Int, Int) -> Unit = {valor1, valor2 -> println(valor1*valor2)}
    multiplicar(6,3)
    calculadora1(6,3,multiplicar)

    //Exercicio 3: Crie uma lista com numeros inteiros de 1 a 99, utilizando filtro criar uma lista
    //com os numeros pares contidos nela.
    //Exercicio 4: crie uma lista de Strings com 4 nomes: utilizando map incluir "Ola " na frente dos nomes
    //percorra a lista usando forEach e imprima todos os resultados.

    val array3: IntArray = IntArray(99) {i-> (i+1)}
    val numerospares = array3.filter{it%2==0}
    print(numerospares)
    println("\n")
    val nomeslista = listOf("Alex","Paulo","Felipe","Fernando")
    val saudacaoenome = nomeslista.map{"Ola $it"}
    saudacaoenome.forEach{println(it)}
}
fun mysome (a:Int, b:Int)= println(a+b)
fun calculadora1(val1: Int, val2:Int, ope:(Int, Int)->Unit){
    ope(val1,val2) }
