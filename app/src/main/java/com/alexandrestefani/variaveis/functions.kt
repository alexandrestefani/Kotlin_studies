package com.alexandrestefani.variaveis

class functions {
}

fun main() {
    primeirafuncao()

    segundafuncao("Felipe")

    var resultadodivisao = terceirafuncao(10.0,5.0)
    println(resultadodivisao)

    var resto = resto(8,4)
    println(resto)


}
fun primeirafuncao(){
    println("testando a primeria funcao")
}
fun segundafuncao(nome:String, cidade: String = "São Paulo"){
    println("Olha, $nome seja bem-vindo!\nEstamos felizes que veio de tão longe, $cidade, para nos ver!")
}
fun terceirafuncao(a: Double,b: Double): Double{
    var resultado = a / b
    return resultado
}
fun resto(a: Int,b: Int) = a % b

