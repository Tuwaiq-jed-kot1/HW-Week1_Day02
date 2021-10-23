 // Question 1 - what is the type of this Variable var age:int = 19
// Integer

 // Question 2 - What is the output of this code:
 /*var age:int = 19
 if(age < 18 ) {
  print("you are not adult")
 }else {
  print("you are adult") */
  // the output is you are adult

 fun main(){
     println("Enter player health ")
     var healthPoint = readLine()?.toInt()
     if (healthPoint != null) {
         if (healthPoint == 100) {
             println("the player's health is fine")
         }else{
             println("the player's health is awful ")
         }
     }

 }