
fun main(args: Array<String>) {
    var numbers = arrayOf(2,13,24,35)
    var size = numberOfIntegers(numbers)
    var mean = calculateMeanOfNumbers(numbers)
    var squareOfNumbersMinusMean = subTractMeanFromNumbersAndSquareResult(numbers, mean, size)
    var variance = calculateVariance(squareOfNumbersMinusMean)
    var standardDeviation = standardDeviation(variance)
    println(standardDeviation)
}

fun numberOfIntegers(numbers:Array<Int>): Int{
    var count =0
    for (num in numbers) {
        count++
    }
    return count
}

fun calculateMeanOfNumbers(numbers:Array<Int>):Double{
    var sum=0.0
    var count=0
    for(number in numbers){
        sum+=number
        count++
    }
    return sum/count
} 

fun subTractMeanFromNumbersAndSquareResult(numbers:Array<Int>, mean:Double, size:Int) : DoubleArray{
    var count =0
    var nums = DoubleArray(size){0.0}
    
    for (number in numbers) {
       var meanFromNumber = number-mean
       nums[count] = meanFromNumber*meanFromNumber
       count++
    }
    return nums
}

fun calculateVariance(numbers:DoubleArray) :Double {
    var sum =0.0
    var count =0
    for (number in numbers){
        sum+=number
        count++
    }
    return sum/count
} 

fun standardDeviation(variance:Double) :Double {
    return Math.sqrt(variance)
} 