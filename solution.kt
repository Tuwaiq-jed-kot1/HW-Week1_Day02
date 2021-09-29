fun main() {
//-----------------------    ## Part I-short answer questions.-----------------------------
    /* ---
     ### what is the type of this Variable `var age:int = 19`:
     ### integer
     ###
     ### What is the output of this code:
     ###  `var age:int = 19`*/
    /* if (age < 18) {
         print("you are not adult")
     } else {
         print("you are adult")
     }*/
    //the output is:  you are adult


//-------------------------## Part II - writing code.-------------------------------------
    /*### Write a kotlin program that has two `players` with there `healthPoints` and let the
       program check if the healthPoint is less than 90 out 100 print `the player's health
       is fine` and if the healthPoint is less than 50 print `the player's health is awful `. */

    var healthPointsPlayer1 = 49
    var healthPointsPlayer2 = 70

    val checkingHealthPoint: (Int) -> String = { healthPoints ->
        "player's health is ${
            when {
                (healthPoints < 50) -> "awful"
                (healthPoints < 90) -> "fine"
                else -> " "
            }
        }"
    }
    println(checkingHealthPoint(healthPointsPlayer1))
    println(checkingHealthPoint(healthPointsPlayer2))


}