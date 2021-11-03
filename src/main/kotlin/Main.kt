fun main(args: Array<String>) {
    println("Digite um numero de 1 a 12 para descobrir o mês: ")

    val numero = readLine()!!.toInt()

    when (numero) {
        1 -> println("o numero é referente ao mês de janeiro")
        2 -> println("o numero é referente ao mês de fevereiro")
        3 -> println("o numero é referente ao mês de março")
        4 -> println("o numero é referente ao mês de abril")
        5 -> println("o numero é referente ao mês de maio")
        6 -> println("o numero é referente ao mês de junho")
        7 -> println("o numero é referente ao mês de julho")
        8 -> println("o numero é referente ao mês de agosto")
        9 -> println("o numero é referente ao mês de setembro")
        10 -> println("o numero é referente ao mês de outubro")
        11 -> println("o numero é referente ao mês de novembro")
        12 -> println("o numero é referente ao mês de dezembro")
        else ->println("numero inválido")
    }
}