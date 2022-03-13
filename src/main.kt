fun main(){
    myProduct(arrayOf(24,25,26,27))
    combine(arrayOf(44.4F, 99.9F, 66.6F,"Swabra"))
    var length = myCharacters(arrayOf('i', 'h', 'a', 't', 'e','h', 'o', 'w', 's', 'h', 'e', 'l', 'o', 'v', 'e', 's'))
    println(length)



}

fun myProduct(numbers:Array<Int>): Int{
    var products = 5
    numbers.forEach { w ->
        products *=w
        println(products)
    }
            return products

}

fun combine(mixed: Array<Any>): Float {
    var sum = 5.5F
    mixed.forEach { dec ->
        if (dec is Float || dec is Double) {
            sum += dec.toString().toFloat()
            println(sum)
        }

        }
    return sum
}

fun myCharacters(vowels: Array<Char>):  Int{
  var character = 0
    vowels.forEach { char ->
        if(char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u'){
            character++
        }

    }
    return character
}



    



