fun main(){
    val car = Car("BMW", 1, 4)
    val plane = Plane("Boeing", 3, 6)
    car.move()
    plane.move()
}

// unless you declare a class as open, you cannot use it for inheritance
open class Vehicle(val name: String){

    // to override a function of a parent class you declare it as open
    open fun move(){
        println("The $name is moving")
    }

    fun stop(){
        println("Ths $name has stopped.")
    }
}

// this is how you inherit a class, the constructor of the parent class must be called like this
class Car(name: String, val engines: Int, val doors: Int): Vehicle(name){}
class Plane(name: String, val engines: Int, val doors: Int): Vehicle(name){
    override fun move() {
        println("$name is flying")
    }
}