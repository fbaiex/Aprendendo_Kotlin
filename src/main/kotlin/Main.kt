fun main() {
    println("Bem vindo ao Byte Bank")

    var i = 0

    while(i < 5){
        val titular = "Alexa $i"
        val numeroConta = 1000 + i
        var saldoConta = i + 10.0


        println("Titular: $titular")
        println("Número da conta $numeroConta")
        println("Saldo da conta $saldoConta")
        println(i)
        println()
        i++
    }

//    for (i in 5 downTo 1) {
//
//        val titular = "Alexa $i"
//        val numeroConta = 1000 + i
//        var saldoConta = i + 10.0
//
//
//        println("Titular: $titular")
//        println("Número da conta $numeroConta")
//        println("Saldo da conta $saldoConta")
//        println(i)
//        println()
//    }

//    testaCondicoes(saldoConta)

}

fun testaCondicoes(saldoConta: Double) {

    if (saldoConta > 0.0) {
        println("Conta está com saldo positivo")
    } else if (saldoConta == 0.0) {
        println("Sua conta está zerada")
    } else {
        println("Conta é negativa")
    }

    when {
        saldoConta > 0.0 -> println("Conta está com saldo positivo")

        saldoConta == 0.0 -> println("Sua conta está zerada")

        else -> println("Conta é negativa")

    }
}