//## Part II - writing code.
//Write a kotlin program that has two players with there healthPoints and let the program check
//if the healthPoint is less than 90 out 100 print the player's
//health is fine and if the healthPoint is less than 50 print the player's health is awful.

fun main(){
    var _1stPlayerHealthPoints = 50
    var _2ndPlayerHealthPoints = 95

    if (_1stPlayerHealthPoints in 50..100){
        println("Player's health is fine")
    }else if(_1stPlayerHealthPoints in 0..49){
        println("Player's health is awful")
    }else{
        println("value is out of range")
    }
}