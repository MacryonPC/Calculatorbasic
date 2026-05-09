package org.example

class Calculatorbasic(): Calculator_metod {


   val checkfalse = false

    override fun menuCalculator(){
        val drawMenu ="""
            ============== CALCULATOR $versionCalculator ==============
            1) +
            2) -
            3) *
            4) /
            5) history
            6) Exit
        """.trimIndent()
        println(drawMenu)
    }

    override fun basicFunctionality() {
        while (!checkfalse) {
            menuCalculator()
            println("Выберите опцию")
            val inputOptionMenu = readln().toInt()
            val  conclusionBasicAccounts = when (inputOptionMenu){
                1 -> {
                    println("Введите числа")
                    val inputNumbers1 = readln().toFloat()
                    val inputNumbers2 = readln().toFloat()
                    val resultAnswer1 = (inputNumbers1 + inputNumbers2).toInt()
                    "Ответ: $resultAnswer1"}
                2 -> {
                    println("Введите числа")
                    val inputNumbers1 = readln().toFloat()
                    val inputNumbers2 = readln().toFloat()
                    val resultAnswer2 = (inputNumbers1 - inputNumbers2).toInt()
                    "Ответ: $resultAnswer2"}
                3 -> {
                    println("Введите числа")
                    val inputNumbers1 = readln().toFloat()
                    val inputNumbers2 = readln().toFloat()
                    val resultAnswer3 = (inputNumbers1 * inputNumbers2).toInt()
                    "Ответ: $resultAnswer3"}
                4 -> {
                    println("Введите числа")
                    val inputNumbers1 = readln().toFloat()
                    val inputNumbers2 = readln().toFloat()
                    "Ответ: ${(inputNumbers1 / inputNumbers2)}"}
                5 -> {"пока в разработке!!!"}
                6 -> {break}
                else -> {"Не существующие значение" }
            }
            println(conclusionBasicAccounts)
            Thread.sleep(1000)

        }

    }





}
const val versionCalculator = "V.0.0.0.8"