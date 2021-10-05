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
### intger
###
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


fun main(){
var player1HealthPoints = 42
var player2HealthPoints = 85

    if(player1HealthPoints <= 90 && player1HealthPoints > 50)
        println("The player1 health is fine")
    else if(player1HealthPoints < 90 && player1HealthPoints < 50){
        println("The player1 health is awful")
    }

    if(player2HealthPoints <= 90 && player2HealthPoints > 50)
        println("The player2 health is fine")
    else if(player2HealthPoints < 90 && player2HealthPoints < 50){
        println("The player2 health is awful")
    }
}

