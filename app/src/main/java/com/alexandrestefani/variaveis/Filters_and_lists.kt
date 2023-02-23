package com.alexandrestefani.variaveis

class Filters_and_lists {
}

fun main() {

    val listanumeros: List<Int> = listOf(1,2,3,4,5)

    val novalista = listanumeros.filter{(it%2)==0}
    println("Lista numeros pares:")
    novalista.forEach{println(it)}

    val listaimpares = listanumeros.filterNot{(it%2)==0}
    println("\nLista numeros impares:")
    listaimpares.forEach{println(it)}

    //Testes com Map para fazer modificações na lista
    val listanova2 = listanumeros.map{it*10.0}
    println("\nListanumeros multiplicada por 10.0:")
    listanova2.forEach{println(it)}

    val listanomes= listOf("Vanessa", "Carla","Pedro","Ricardo","Felipe")
    //for(i in 0.. listanomes.size-1){println(listanomes.get(i))}

    val listanomes2 = listanomes.map{"Seja muito bem-vindo $it"}
    println("\nLista de Participantes")
    listanomes2.forEach{println(it)}

    // Testes com a função ZIP para juntar listas

    val zipteste = listanomes.zip(listanumeros){nomes,num -> "$nomes - $num"}
    println("\ntestes com funcao Zip")
    zipteste.forEach{println(it)}   // forEach jeito fácil de printar


    // Testes com associate: With e by

    val testassociatewith = listanomes.associateWith { it.length }
    println(testassociatewith)
    val testassociateby = listanomes.associateBy { it.length } //retorna apenas o último registro com o mesmo tamanho
    println(testassociateby)


    // Testes de mais de um operador juntos

    val novosnomes =
        listanomes.map{
           "$it, voce está bem ?"
        }.zip(listanumeros){texto, num -> "$texto, voce é a pessoa numero: $num"
        }.forEach{println(it)}














}