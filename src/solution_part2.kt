// Q1 -> Integr
// Q2 -> you are adult

// Q3
fun main() {

    val player1 = " Salem "
    val healthPoint1 = 30
    val player2 = " Muhammad "
    val healthPoint2 = 70

    if (healthPoint1 < 90 && healthPoint1 > 50 && healthPoint1 <= 100 && healthPoint1 > 0) {
        println(" $player1's health is fine ")
    }else if ( healthPoint1 <50)
        println(" $player1's health is awful " )
    else println(" error: the range is from 0 to 100")

    if (healthPoint2 < 90 && healthPoint2 > 50 && healthPoint2 <= 100 && healthPoint2 > 0) {
        println(" $player2's health is fine ")
    }else if ( healthPoint2 <50)
        println(" $player2's health is awful " )
    else println(" error: the range is from 0 to 100")

}