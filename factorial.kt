fun factorial(num: Int): Int {
    return if (num <= 1) 1
    else num * factorial(num - 1)
}

fun main() {
    print("Enter a number: ")
    val number = readLine()!!.toInt()
    println("The factorial of $number is: ${factorial(number)}")
}



