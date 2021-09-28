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
###
###Integer
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



        var player1:Int=50
        var player2:Int=48



        println(" Please choose (when) or (if) to solve the quation :")

        var answer:String?= readLine()

        println(answer)


        if (answer!=null){


            if (answer=="when"){

                //when
                when(player2){


                    in 50..90-> println("player2's health is fine.")

                    in 0..49 -> println(" player2's health is awful.")

                    else-> println(" healthPoint player2's  $player2.")

                }

            }else if (answer=="if"){




                //if conditional
                if (player1 <= 100 && player1 >= 49){

                    print("player1's health is fine.")
                }else if (player1<50 && 0<=player1){

                    println(" player's health is awful.")
                }else{

                    println(" healthPoint player1's  $player1.")

                }


            }else{

                println("please enter true name")
            }
        }else{
            println("The value is null!!")
        }

    }



