## Part I - short answer questions.
---
### what is the type of this Variable `var age:int = 19`:
###integer
###
### What is the output of this code:
###  `var age:int = 19`
if(age < 18 ) {
    print("you are not adult")
}else {
    print("you are adult")
}

###you are adult

## Part II - writing code.
---
### Write a kotlin program that has two `players` with there `healthPoints` and let the program check if the healthPoint is less than 90 out 100 print `the player's health is fine` and if the healthPoint is less than 50 print `the player's health is awful `.

fun main(){
    var p1HealthPoints = 40
    var p2HealthPoints = 88

    if(p1HealthPoints <= 90 && p1HealthPoints > 50)
        println("The player 1 health is fine")
    else if(p1HealthPoints < 90 && p1HealthPoints < 50){
        println("The player 1 health is awful")
    }

    if(p2HealthPoints <= 90 && p2HealthPoints > 50)
        println("The player 2 health is fine")
    else if(p2HealthPoints < 90 && p2HealthPoints < 50){
        println("The player 2 health is awful")
    }
}