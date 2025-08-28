import kotlin.math.pow

fun main(){
    val result = Calculator.sum(10, 4)
    val area = Calculator.area(23.434f)
    println(result)
    println(area)
}

// this is how you declare static functions and variables
class Calculator(){
    // all static properties are declared inside the companion object code block
    companion object{
        val pi = 3.14f
        fun sum(a: Int, b: Int) = a + b
        fun area(radius: Float) = pi * radius.pow(2)
    }
}