fun main() {
    val playerOne= "Ahmad"
    val playerOneHealth= 99
    val playerTwo= "Khalid"
    val playerTwoHealth= 33
    checkHealth(playerOne, playerOneHealth)
    checkHealth(playerTwo, playerTwoHealth)
}
fun checkHealth(name: String ,healthPoint:Int) {
    when (healthPoint) {
        in 50..100 -> println("the player $name is fine")
        in 0..49 -> println("the player $name  is awful")
        else -> println("out of range")
    }
}