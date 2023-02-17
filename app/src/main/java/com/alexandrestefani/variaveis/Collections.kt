package com.alexandrestefani.variaveis

class Collections {
}

fun main() {
    //testes com Array
    println("----Array testes----------------------\n\n")
    var array2: Array<Int> = Array(5) {i -> (i+1)}
    var array3: IntArray = IntArray(5) {i-> (i+1)}

    array2[4]=5
    array2.set(0,1000)
    array2.set(1, 100)
    var tamanhoarray2: Int = array2.size


    println("a segunda posição no array3 tem o seguinte conteúdo: ${array3[1]}")
    println("a primeira posição no array2 tem o seguinte conteúdo: ${array2[0]}")
    println("a segunda posição no array2 tem o seguinte conteúdo: ${array2.get(1)}")
    println("o tamanho do Array2 é $tamanhoarray2")
    println("Array2 conteúdo:\n ${array2[0]}\n ${array2[1]}\n ${array2[2]}\n ${array2[3]}\n ${array2[4]}")


    //testes com list
    println("\n\n-----List testes---------------------\n")

    var mutableList: MutableList<String> = mutableListOf()
    mutableList.add("Natalia")
    println(mutableList.get(0))
    mutableList.add("Vivian")
    println(mutableList[1])
    mutableList.set(1,"Jose")
    println(mutableList[1])
    mutableList.add("Vivian 2")
    mutableList.add("Ingrid")
    println(mutableList.get(2))
    println(mutableList[3])
    mutableList.removeAt(1)
    println(mutableList[1])


    //testes com Map
    println("\n\n-----Map testes---------------------\n")

    var mutableMap: MutableMap<String,String> = mutableMapOf()

    println(mutableMap.contains("Alexandre"))
    mutableMap.put("Alexandre","desenvolvedor")
    mutableMap.put("Vivian","analista")
    mutableMap.put("Ingrid","atriz")
    println(mutableMap.values)
    println(mutableMap.keys)









}