package org.example

class Calculatorbasic(): CalculatorMetod {
    private val history = mutableListOf<String>()

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
                    saveToHistory("$inputNumbers1 + $inputNumbers2 = $resultAnswer1")
                    "Ответ: $resultAnswer1"}
                2 -> {
                    println("Введите числа")
                    val inputNumbers1 = readln().toFloat()
                    val inputNumbers2 = readln().toFloat()
                    val resultAnswer2 = (inputNumbers1 - inputNumbers2).toInt()
                    saveToHistory("$inputNumbers1 - $inputNumbers2 = $resultAnswer2")
                    "Ответ: $resultAnswer2"}
                3 -> {
                    println("Введите числа")
                    val inputNumbers1 = readln().toFloat()
                    val inputNumbers2 = readln().toFloat()
                    val resultAnswer3 = (inputNumbers1 * inputNumbers2).toInt()
                    saveToHistory("$inputNumbers1 * $inputNumbers2 = $resultAnswer3")
                    "Ответ: $resultAnswer3"}
                4 -> {
                    println("Введите числа")
                    val inputNumbers1 = readln().toDouble()
                    val inputNumbers2 = readln().toDouble()
                    val resultAnswer4 = divisionToZero(inputNumbers1, inputNumbers2)
                    "Ответ: $resultAnswer4"}
                5 -> {
                    showHistory()

                    ""}
                6 -> {break}
                else -> {"Не существующие значение" }
            }
            println(conclusionBasicAccounts)
            Thread.sleep(1000)

        }

    }


    override fun saveToHistory(express: String) {
            history.add(express)
    }

    override fun showHistory() {
        if ( history.isEmpty() ) {
            println("История пуста!")
        }else {
            history.forEach { println(it) }
        }
    }

    override fun divisionToZero(a: Double, b: Double): String{
       return if (b == 0.0 || a == 0.0 )  "Делить на ноль нельзя!" else  "${a / b}"

}







}
const val versionCalculator = "V.0.0.0.10"