fun main() {
    var sum =0
    var counter =0
    val numArray = arrayOf(1,2,3,4,5,6,7,8)

    for (number in numArray) {
        sum+=number
        counter++
    }
    var average = (sum.toFloat()/counter)
    println(average)
} 