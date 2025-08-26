fun main() {
    val names = arrayOf("John", "Stephen", "Megan")
    val miscellaneous = arrayOf(1, 2, 3, "String", "Something", 1.23f)
    println("First element : ${names[0]}")
    println("The size of the array is ${names.size}")

    names[0] = "Alex"
    println("New first element ${names[0]}")

    println("All the names:")
    for(name in names){
        println(name)
    }

    //a for in loop for an array
    println("Length of miscellaneous array ${miscellaneous.size}")
    for(element in miscellaneous){
        print("Current element $element")
        if(element is String){
            print(" is a string.")
        }
        if(element is Int){
            print(" is an integer.")
        }
        if(element is Float){
            print(" is a float.")
        }
        println()
    }
    val maxVal = findMinAndMax(arrayOf(1, 2, 3, 4, 5), true)
    val minVal = findMinAndMax(arrayOf(1 , 2, 3, 4, 5), false)
    println("Max val = $maxVal")
    println("Min val = $minVal")
}

fun findMinAndMax(numbers: Array<Int>, findMax: Boolean): Int{
    var output = numbers[0]
    for(number in numbers){
        if(findMax && number > output) output = number
        if(!findMax && number < output) output = number
    }
    return output
}