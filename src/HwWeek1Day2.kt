fun main(){
    var age:Int = 19
    var playerHealthPoints : Int = 91

    if(age < 18 ) {
        println("you are not adult")
    }else {
        println("you are adult")
    }

    checkPlayerHealth(playerHealthPoints)
}

fun checkPlayerHealth(healthPoints : Int){
    if(healthPoints > 90 ) {
        println("the player's health is fine")
    }else {
        println("the player's health is awful")
    }
}