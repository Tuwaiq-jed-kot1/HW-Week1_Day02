
fun main(){
    var player1="Nadia"
    var player2="Maha"
    var healthPointplaer1=90
    var healthPointplaer2=30

    when (healthPointplaer1){
        in 0..49 ->"the player's health is awful"
        in 50..90->"the player's health is fine"
        else -> "Unclear"
    }

    when (healthPointplaer2){
        in 0..49 ->"the player's health is awful"
        in 50..90->"the player's health is fine"
        else -> "Unclear"
    }

    println("the point health $player1 is $healthPointplaer1")
    println("the point health $player2 is $healthPointplaer2")


}