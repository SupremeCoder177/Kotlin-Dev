
fun main(args: Array<String>){
    println("Using for loops")
    //using for loops

    // .. is the
    // range operator, it includes the upper limit too
    println("Using the .. operator")
    for(i in 1..10){
        println("value of i = $i")
    }

    println("Using the 'until' operator")
    for(i in 1 until 10){
        println("value of i = $i")
    }

    //looping backwards
    println("looping backwards")
    for(i in 10 downTo 1){
        println("value of i = $i")
    }

    //adding step size
    println("adjusting step size")
    for(i in 1 until 10 step 2){
        println("value of i = $i")
    }
}