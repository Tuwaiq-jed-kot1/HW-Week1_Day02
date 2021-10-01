## Part I - short answer questions.
---
### what is the type of this Variable `var age:int = 19`: ---> Integer
###
###
### What is the output of this code:  "you are adult"
###  `var age:int = 19`
if(age < 18 ) {
    print("you are not adult")
}else {
    print("you are adult")
}
/////////////////////////////////

// part 2
// two players with different points to cover the two cases
fun main (){
val healthpointPlayer1 = 40
val healthpointPlayer2=90
println(" first player result: ${heathPoint(healthpointPlayer1)}")
println(" second player result: ${heathPoint(healthpointPlayer2)}")
}

fun heathPoint(healthpoint:Int):String{
    return when (healthpoint) {
        in 0..49 -> "the player's health is awful"
        in 50..100 -> "the player's health is fine"
        else -> "invalid input"
    }
}