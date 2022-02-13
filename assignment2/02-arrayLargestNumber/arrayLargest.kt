fun main(args: Array<String>) {
    val numArray = arrayOf(12, 2, 4, 6, 77, 3, 2, 1, 9, 7, 25, 56, 23, 48)
    var max = findMaximumElementInArray(numArray)
    println(max)
}

fun findMaximumElementInArray(numbers:Array<Int>) : Int {
    var maximumNumber = 0
    for (number in numbers){
        if (number>maximumNumber){
            maximumNumber=number
        }
    }
    return maximumNumber
} 