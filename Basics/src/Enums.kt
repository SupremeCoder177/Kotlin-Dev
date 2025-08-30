fun main(){
    val direction = Direction.EAST
    println(direction.printData())
}

enum class Direction(var direction: String, var distance: Int){
    NORTH("north", 10),
    SOUTH("south", 20),
    EAST("east", 30),
    WEST("west", 40);

    fun printData(){
        println("The direction is $direction and the distance is $distance")
    }
}
