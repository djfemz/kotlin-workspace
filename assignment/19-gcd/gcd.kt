import java.util.Scanner

fun main() {
    var input = Scanner(System.`in`)
    println("enter first number")
    var firstNumber = input.nextInt()
    println("enter second number")
    var secondNumber = input.nextInt()

    // val list: MutableList<Int> = mutableListOf(1, 2, 3)  
    val list1: MutableList<Int> = mutableListOf(1)
    val list2: MutableList<Int> = mutableListOf(1)

    var hcf = 1

    for(i in 1..firstNumber){
        if (firstNumber%i==0){   
          list1.add(i)
        }
    }

    for (j in 1..secondNumber) {
        if(secondNumber%j==0) list2.add(j)
    }

    println(list1)
    println(list2)

    for (k in list1) {
        for (l in list2) {
            if(k==l) hcf*=k
        }
    }
    println("HCF is $hcf")
}