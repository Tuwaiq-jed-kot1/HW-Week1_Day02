fun main() {
    print("Enter the healthPoint number:- ")
    var healthPoints =readLine()?.toInt()
    var player =when (healthPoints){
        in 90..100 -> "the player's health is fine"
        in 51..89 -> "the player's health need help"
        in 0..50 -> "the player's health is awful"
        else ->"let the number between 0 And 100"
    }
    println(player)
}