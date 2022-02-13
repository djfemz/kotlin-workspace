fun main(args: Array<String>) {
    var arr1 = intArrayOf(1,2,3,4,5)
    var arr2 = intArrayOf(4,5,6,7,8)
    val concat = concatenate(arr1, arr2)
    println(concat.contentToString())
}

fun concatenate(arr1: IntArray, arr2: IntArray) : IntArray{
    return arr1+arr2
}