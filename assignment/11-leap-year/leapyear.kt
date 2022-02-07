import java.util.Scanner

fun main() {
    var scanner = Scanner(System.`in`)
    println("enter a year")
    var year = scanner.nextInt()

    if(year%4==0) println("year is a leap year")
    else println("year $year is not a leap year")


}