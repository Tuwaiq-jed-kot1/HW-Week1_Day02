fun main(){
 // two players with different points to cover the two cases
 val healthpointPlayer1 = 40
 val healthpointPlayer2=90
 println("the first player result: ${heathPoint(healthpointPlayer1)}")
 println("the second player result: ${heathPoint(healthpointPlayer2)}")
}

fun heathPoint(healthpoint:Int):String{
 return when (healthpoint) {
  in 0..49 -> "the player's health is awful"
  in 50..100 -> "the player's health is fine"
  else -> "invalid input"
 }

}