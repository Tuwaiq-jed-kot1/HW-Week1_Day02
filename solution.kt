//partI
//q1

/*the statement is wrong, there is no type known as "int" in kotlin
so it result an error and kotlin see it as "Unresolved reference"*/




//q2

/*error: unresolved reference: int
var age:int = 19*/




//partII
//q1

fun main() {
    val player1: String = "khaled"
    val player2: String = "ahmed"

    var healthPoint1: Int = 91
    var healthPoint2: Int = 52

    when (healthPoint1) {

        in 90..100 -> println(player1 + "  health is fine")
        in 51..89 -> println(player1 + "  health is good")
        in 1..50 -> println(player1 + "  health is awful")
        0 -> println(player1 + "  died")
        else -> println("out of range")


    }

    if (healthPoint2 in 90..100) {
        println(player2 + "  health is fine")
    } else if (healthPoint2 > 50 && healthPoint2 < 90){
        println("$player2  health is good")
    } else if (healthPoint2 <= 50 && healthPoint2 >= 1){
        println(player2 + "  health is awfel")
    }else if (healthPoint2 == 0){
        println(player2 + "  died")
    }else {
        println("helth point out of rage")
    }


}
