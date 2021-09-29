# Kotlin I Assignment  I Variables and Conditionals
---
The Kotlin assignment has three components:
- short answer questions.
- writing code.

- ...
> Note: You must save your solution as `solution_part2.kt` for Part II.

## Part I - short answer questions.
---
### Question 1 - what is the type of this Variable `var age:int = 19`:
>Answe 1:

the type is int (that mean only number)
### Question 2 - What is the output of this code:
###  `var age:int = 19`
     if(age < 18 ) {
    print("you are not adult") 
    }else {
    print("you are adult")
    }
>Answe 2:
output is  you are adult , because 19 is bigger than 18
the condtion will going to the scond option

## Part II - writing code.
---
### Write a kotlin program that has two `players` with there `healthPoints` and let the program check if the healthPoint is less than 90 out 100 print `the player's health is fine` and if the healthPoint is less than 50 print `the player's health is awful `.

fun main() {
var healthpoints:Int = 90
var healthpoints2:Int= 50
val player1 : String ="ahmmed"
val player2: String="mohammd"

    when(healthpoints) {
        in 90..100-> println("the player heath is great  $healthpoints")
        in 50..89 -> println(" the player heath is fine $healthpoints  ")
        else -> println("the player $player1 heath is awful $healthpoints  ")
    }

    when(healthpoints2) {
        in 90..100 -> println("the player heath is great  $healthpoints2")
        in 50..89 -> println(" the player heath is fine $healthpoints2  ")
        else -> println("the player $player2 heath is awful $healthpoints2  ")
    }
}


