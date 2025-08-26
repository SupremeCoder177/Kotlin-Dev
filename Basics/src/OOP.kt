fun main(){
    val car1 = Car("Tesla", "Cyber", "Grey", 4)

    car1.move()
    car1.getName()
    car1.getModel()
    car1.getColor()
    car1.getDoors()
    car1.stop()
    car1.getDescription()
}


// You specify the initializing parameters in the class declaration there is no constructor
// the code in the class which is not inside a function is basically the constructor here
// you can assign the parameters as properties by adding var or val before them
class Car(var name: String, var model: String, var color: String, var doors: Int) {
    var running = false

    fun move(){
        println("The car is moving")
        this.running = true
    }

    fun stop(){
        println("The car has stopped")
        this.running = false
    }

    fun getDoors(){
        println("This car has ${this.doors} doors.")
    }

    fun getName(){
        println("The name of the car is ${this.name}")
    }

    fun getColor(){
        println("The color of the car is ${this.color}")
    }

    fun getModel(){
        println("The model of the card is ${this.model}")
    }

    fun getDescription(){
        println("The ${this.name} ${this.model} of color ${this.color} has ${this.doors} doors and is currently ${if(this.running) "running" else "not running"}")
    }
}