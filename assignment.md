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
>Answe 1: integer
### Question 2 - What is the output of this code:
###  `var age:int = 19`
     if(age < 18 ) {
    print("you are not adult") 
    }else {
    print("you are adult")
    }
>Answe 2: the output is:  you are adult


## Part II - writing code.
---
### Write a kotlin program that has two `players` with there
`healthPoints` and let the program check if the healthPoint is less than 90 out 100 print `the player's health is fine`
and if the healthPoint is less than 50 print `the player's health is awful `.

fun main() {
    var healthPointsPlayer1 = 49
    var healthPointsPlayer2 = 70

    val checkingHealthPoint: (Int) -> String = { healthPoints ->
        "player's health is ${
            when {
                (healthPoints < 50) -> "awful"
                (healthPoints < 90) -> "fine"
                else -> " "
            }
        }
    }
    println(checkingHealthPoint(healthPointsPlayer1))
    println(checkingHealthPoint(healthPointsPlayer2))
} 