fun main(){
    val car = Cars("Tesla", "Black")
    val plane = Planes("Boeing", "White")

    println(car)
    println(plane)

    car.start()
    plane.start()
    car.stop()
    plane.stop()
}


// interfaces are like abstract classes, we only implement them in other classes
interface Engine{
    fun start()
    fun stop()
}

data class Cars(val name: String, val color: String) : Engine{
    override fun start() {
        println("The engine of the car is starting")
    }

    override fun stop() {
        println("The engine of the car has stopped")
    }
}

data class Planes(val name: String, val color: String): Engine{
    override fun start() {
        println("The engine of the plane is starting")
    }

    override fun stop() {
        println("The engine of the plane is stopped")
    }

}