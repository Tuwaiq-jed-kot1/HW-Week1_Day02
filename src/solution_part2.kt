
fun main() {
 var healthpoints:Int = 90
 var healthpoints2:Int= 50
 val player1 : String ="ahmmed"
 val player2: String="mohammd"

 when(healthpoints) {
  in 90..100-> println("the player heath is great  $healthpoints")
  in 50..89 -> println(" the player heath is fine $healthpoints  ")
  else -> println("the player $player1 heath is awful $healthpoints  ")
 }

 when(healthpoints2) {
  in 90..100 -> println("the player heath is great  $healthpoints2")
  in 50..89 -> println(" the player heath is fine $healthpoints2  ")
  else -> println("the player $player2 heath is awful $healthpoints2  ")
 }
}


