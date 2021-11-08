/*
### Question 1 - what is the type of this Variable `var age:int = 19`:
>Answe 1: Int // integer >> number


### Question 2 - What is the output of this code:
###  `var age:int = 19`
if(age < 18 ) {
 print("you are not adult")
}else {
 print("you are adult")
}
>Answe 2: you are adult
*/
 //patr 2

fun main(){
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