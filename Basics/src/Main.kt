//you need to provide the return type of function
fun add(a: Int, b: Int): Int{
    return a + b
}

//if a function returns nothing we specify Unit or nothing
// vararg makes an input parameter into an array
fun greet(greeting:String, vararg names:String): Unit{
    //this is for-in loop
    for (name:String in names){
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
}