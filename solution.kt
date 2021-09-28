fun main(){

    /*Write a kotlin program that has two players with there healthPoints and
    let the program check if the healthPoint is less than 90 out 100 print the player's health is fine
    and if the healthPoint is less than 50 print the player's health is awful.*/

    val player1name="shahad"
    val player1healthPoint=89

    val player2name="rahaf"
    val player2healthPoint=33


    if(player1healthPoint in 50..100) println("$player1name's health is fine")
    else if (player1healthPoint<50) println("$player1name's health is awful")
    else println("Wrong Reading of player health")

    if(player2healthPoint in 50..100) println("$player2name's health is fine")
    else if (player2healthPoint<50) println("$player2name's health is awful")
    else println("Wrong Reading of player health")

}
