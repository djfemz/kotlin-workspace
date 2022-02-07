fun main() {
    var alph = 'e'
    var vowels =charArrayOf('a', 'e', 'i', 'o', 'u')

   abc@ for (i in vowels) {
        if(alph==i){
            println("vowel")
            break@abc
        }
        println("consonant")           
    }
    
}