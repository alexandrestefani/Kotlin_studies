package com.alexandrestefani.variaveis

class `Repeating loop` {
}

fun main() {
    for (i in 0..100 step 15){
        println(i)
    }
    for (i in 100 downTo 10 step 30){
        println("$i + 1 = ${i+1}")
    }

    var lista_cafe: Array<String> = Array(10){""}
    lista_cafe[0]="cafe"
    lista_cafe[1]="leite"
    lista_cafe[2]="bolo"
    lista_cafe[3]="pao"
    lista_cafe[4]="queijo"
    lista_cafe[5]="geleia"
    lista_cafe[6]="presunto"
    lista_cafe[7]="manteiga"
    lista_cafe[8]="ovos"
    lista_cafe[9]="suco de laranja"

    for (i in lista_cafe.indices){
        println(lista_cafe[i])
    }

    for (item in lista_cafe) print("$item |")
    println("\n")
    var array1 = IntArray(10){0}
    var array2 = IntArray(10){0}

    for (j in 0..array1.size-1){
        array1[j]=j
        array2[j]=j+5
        println("Discreta em 1 ${array1[j]}, cresce em 5 ${array2[j]}")
    }
    print(array1[0])
    var mutableList: MutableList<Int> = mutableListOf()
    //lista números divisíveis por 5
    println("\n-----lista numeros dividos por 3 até 10")
    var cont = 0
    while (cont <10){
        if (cont % 3 ==0){
            println(cont)
            mutableList.add(cont)

        }

        cont++
    }

    println("\n-----somatório dos numeros divididos por 3 até 10 ")
    var resultado = 0
    for (a in 0..mutableList.size -1){
        resultado = resultado +mutableList[a]

    }
    println("Resultado do metodo for: $resultado")
    var resultado2 = 0
    var b =0
    while(b < mutableList.size){
        resultado2 = resultado2 +mutableList[b]
        b++
    }
    println("Resultado do metodo while: $resultado2")


}