import java.util.Scanner

fun main() {
    var count =0
    val scanner = Scanner(System.`in`)
    println("enter string of text")

    var text = scanner.next()
    println("enter character to search for in {$text}")
    var character = scanner.next().single()
    for (t in text) {
        if (t==character){
            count=count+1
        }
    }

    println(count)
}