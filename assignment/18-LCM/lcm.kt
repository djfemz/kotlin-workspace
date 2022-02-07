import java.util.Scanner

fun main() {
    var input = Scanner(System.`in`)
    println("enter first number")
    var firstNumber = input.nextInt()
    println("enter second number")
    var secondNumber = input.nextInt()

    var higherBound = firstNumber*secondNumber

    var lcm =0

    loop@ for(i in firstNumber..higherBound){
        if (i%firstNumber==0 && i%secondNumber==0){
            println("LCM is: $i" ) 
            break@loop
            // lcm=i
        }
    }
}