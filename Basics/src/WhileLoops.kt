//using while loops
fun main(){

    var i = 10
    println("Starting value of i = $i")
    while (i > 0){
        println("value of i = $i")
        i--
    }
    println("Final value of i = $i")

    do{
        i++
        if(i == 99) continue
        println("value of i = $i")
    } while(i <= 100)

    //breaking with labels
    var number = 0;
    outer@ while(number < 10){
        number++
        println(number)

        for(i in 0..10){
            if(i == 5) break@outer
            println("value of i = $i")
        }
    }

    while(number < 100){
        println(if(isEven(number)) "$number is even" else "$number is odd")
        number++
    }
}

fun isEven(number : Int): Boolean = number % 2 == 0