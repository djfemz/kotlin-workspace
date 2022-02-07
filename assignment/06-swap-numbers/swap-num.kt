fun main() {
    var firstNumber = 10
    var secondNumber =15

    println("first number is:  $firstNumber")
    println("second number is: $secondNumber")

    var temp = firstNumber
    firstNumber=secondNumber
    secondNumber=temp

    println("after swap first number is:  $firstNumber")
    println("after swap second number is: $secondNumber")

}