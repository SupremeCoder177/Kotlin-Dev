fun main(){
    val human1 = Human("Alex", "Jones", 22)
    val human2 = Human("Ben")
    val human3 = Human("Michael", "Jackson")

    println()

    println("Human1 stats")
    println("Name : ${human1.name}")
    println("Lastname : ${human1.lastName}")
    println("Age : ${human1.age}")

    println()

    println("Human2 stats")
    println("Name : ${human2.name}")
    println("Lastname : ${human2.lastName}")
    println("Age : ${human2.age}")

    println()

    println("Human3 stats")
    println("Name : ${human3.name}")
    println("Lastname : ${human3.lastName}")
    println("Age : ${human3.age}")
}


// this is the primary constructor
class Human(var name: String, var lastName: String, var age: Int){

    // the secondary constructor needs to call the primary constructor
    // because ultimately the primary constructor declares the variables

    //this is a secondary constructor
    constructor(name: String): this(name, "LastName", 0){
        println("The first secondary constructor was called.")
    }

    //another secondary constructor
    constructor(name: String, lastName: String): this(name, lastName, 0) {
        println("The second secondary constructor was called.")
    }
}

