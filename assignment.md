# Kotlin I Assignment  I Variables and Conditionals
---
The Kotlin assignment has three components:
- short answer questions.
- writing code.

- ...
> Note: You must save your solution as `solution.kt`.

## Part I - short answer questions.
---
### what is the type of this Variable `var age:int = 19`:
Intger
### What is the output of this code:
###  `var age:int = 19`
     if(age < 18 ) {
    print("you are not adult") 
    }else {
    print("you are adult")
    }
        you are adult                


## Part II - writing code.
---
### Write a kotlin program that has two `players` with there `healthPoints` and let the program check if the healthPoint is less than 90 out 100 print `the player's health is fine` and if the healthPoint is less than 50 print `the player's health is awful `. 
fun main() {
//part||
var player1: Int = 40
var player2: Int = -1


fun checkHealth(points: Int) {
when (points) {
in 50..100 -> println("the player's health is fine")
in 0..49 -> println("the player's health is awful")
else -> println("out of range")
}
}

checkHealth(player1)
checkHealth(player2)
}

