fun main() {
    val player1 = "Player 1"
    val player2 = "Player 2"
    var player1HealthPoints: Int = 95
    var player2HealthPoints: Int = 42
    checkHealthStatus(player1HealthPoints, player1)
    checkHealthStatus(player2HealthPoints, player2)
}

fun checkHealthStatus(healthPoint: Int, name: String) {
    when (healthPoint) {
        in 1..49 -> println("$name health is awful")
        in 50..100 -> println("$name health is fine")
        0 -> println("$name is dead")
        else -> {
            println("$name has incorrect health points")
        }
    }
}


,jn