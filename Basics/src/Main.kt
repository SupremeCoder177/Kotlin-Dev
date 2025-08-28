import kotlin.math.pow

//you need to provide the return type of function
fun add(a: Int, b: Int): Int{
    return a + b
}

fun sub(a: Int, b:Int): Int{
    return a - b
}

fun mul(a: Int, b: Int): Int{
    return a * b
}

fun div(a: Int, b: Int): Float{
    return if(b != 0) (a / b).toFloat() else 0f
}

//if a function returns nothing we specify Unit or nothing
// vararg makes an input parameter into an array
fun greet(greeting:String, vararg names:String): Unit{
    //this is for-in loop
    for (name in names){
        println("$greeting $name")
    }
}

// every kotlin program begins from the main function (like in C/C++)
fun main(){
    println("Hello World")

    //you can declare variables in two ways

    //using var you can declare mutable variables
    var name:String = "Batman"

    // this is how you use string template formatting
    println("I am $name")
    name = "Bruce Wayne";
    println("But my real name is $name")

    // the second way to declare variables is using val,
    // variables declared with val are constants
    val age:Number = 20
    println("I am $age years old")

    // and yes you can declare variables without specifying the type
    // is inferred as runtime
    val temp1 = 20
    val temp2 = 10
    println("Temp1 = $temp1, Temp2 = $temp2")
    println("Temp1 + Temp2 = ${add(temp1, temp2)}")
    greet("Hello", "John", "Jane", "Kate")

    val pi: Float = 3.14f
    val radius: Double = 12.452554
    println("PI = $pi, radius = $radius")
    println("Area of circle = ${pi * radius.pow(2.0)}")

    something(str1 = "Hello")
    something(str1 = "Hello", str2 = "World")
}


//how to set default values for parameters
fun something(str1 : String, str2 : String = ""){
    println("$str1  $str2")
}