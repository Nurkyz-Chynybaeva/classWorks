class Factorial {
}

fun main(){
    do {
        println("введите число")
        val f = readLine()!!.toInt()
        println(factorial(f))
        println("продолжить? y- yes, any- no")
        val y = readLine()!!
    }
   while (y == "y")

}

fun factorial(n: Int): Double= if (n < 2) 1.0 else n * factorial(n - 1)
