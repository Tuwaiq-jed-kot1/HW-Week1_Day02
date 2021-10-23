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
### Int
###
### What is the output of this code:
###  `var age:int = 19`
     if(age < 18 ) {
    print("you are not adult") 
    }else {
    print("you are adult")
    }
                        
### you are adult

## Part II - writing code.
---
### Write a kotlin program that has two `players` with there `healthPoints` and let the program check if the healthPoint is less than 90 out 100 print `the player's health is fine` and if the healthPoint is less than 50 print `the player's health is awful `. 

###fun main(){
    //------------------Part1----------------//
    //Question 1 - what is the type of this Variable var age:int = 19:
    //Answer: Int


    //Question2 -  What is the output of this code:
        var age = 19
        var playerHealthPoints = 100

        if(age < 18 ) {
            println("you are not adult")
        }else {
            println("you are adult")
        }
    //Answer: you are adult


    //------------------Part2----------------//


        checkPlayerHealth(playerHealthPoints)
    }

    fun checkPlayerHealth(healthPoints : Int){
        if(healthPoints < 90 ) {
            println("the player's health is awful")
        }else {
            println("the player's health is fine")
        }
    }
