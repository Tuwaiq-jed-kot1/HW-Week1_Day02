//Q1
//Integer
//Q2
//you are adult
//Q3
fun main() {
    val player:Int=40
    val player2:Int=-1
    checkHealth(player)
    checkHealth(player2)
}
fun checkHealth(point:Int){
    when(point){
        in 50..100 -> println("the player is fine")
        in 0..49-> println("the player is awful")
        else-> println("out of range")


    }
}
