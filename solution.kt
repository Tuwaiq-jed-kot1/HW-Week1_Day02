//part 1
//`var age:int = 19`
//the output

//you are adult
//part 2
fun main() {
    var player1HealthPoints=83
    var player2HealthPoints=46

    if (player1HealthPoints < 90 && player1HealthPoints > 50)
        println("the player1 health is good")
    else if (player1HealthPoints > 90 && player1HealthPoints <50) {
        println("the player1 health id awful")
    }
    if (player2HealthPoints < 90 && player2HealthPoints > 50)
        println("the player2 health is good")
    else if (player2HealthPoints < 90 && player2HealthPoints <50 ){
        println("the player2 health id awful")
    }
}