fun main() {
 //part||
 var player1: Int = 40
 var player2: Int = -1


 fun checkHealth(points: Int) {
  when (points) {
   in 50..100 -> println("the player's health is fine")
   in 0..49 -> println("the player's health is awful")
   else -> println("out of range")
  }
 }

 checkHealth(player1)
 checkHealth(player2)
}
