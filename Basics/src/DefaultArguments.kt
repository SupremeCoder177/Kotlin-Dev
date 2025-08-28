fun main(){
    val hero1 = Hero("Batman", age = 20)
    val hero2 = Hero("Green", "Lantern", 30)

    println("Hero1:")
    println("FirstName : ${hero1.firstName}")
    println("LastName : ${hero1.lastName}")
    println("Age: ${hero1.age}")

    hero1.favMovie = "Interstellar"
    hero2.favMovie = "Gravity"

    println()

    println("Hero2:")
    println("FirstName : ${hero2.firstName}")
    println("LastName : ${hero2.lastName}")
    println("Age: ${hero2.age}")
}

// you can do this with secondary constructors too but this is more concise
class Hero(var firstName: String, var lastName: String = "LastName", var age: Int = 0){

    // lateinit = initialize later, when you declare a property as lateinit you are supposed to initialize the
    //            property later otherwise a NullPointerException is thrown
    lateinit var favMovie: String
}
