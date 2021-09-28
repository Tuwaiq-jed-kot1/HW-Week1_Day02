fun main() {

    val playerOne = "Ahmed"
    val playerTwo = "Flan"
    val playerThree = "Sami"
    val playerOneHP = 100
    val playerTwoHP = 50
    val playerThreeHP = 101

    println("       ### Players' Health Points Checking System (using if statements) ###")
    // Checking player one's HP:
    if (playerOneHP in 90..100)
        println("Player $playerOne's health is great.")
    else if (playerOneHP in 50..89)
        println("Player $playerOne's health is fine.")
    else if (playerOneHP in 0..49)
        println("Player $playerOne's health is awful.")
    else
        println("ERROR: Player $playerOne's health is not in known range")


    // Checking player two's HP:
    if (playerTwoHP in 90..100)
        println("Player $playerTwo's health is great.")
    else if (playerTwoHP in 50..89)
        println("Player $playerTwo's health is fine.")
    else if (playerTwoHP in 0..49)
        println("Player $playerTwo's health is awful.")
    else
        println("ERROR: Player $playerTwo's health is not in known range")


    // Checking player three's HP:
    if (playerThreeHP in 90..100)
        print("Player $playerThree's health is great.")
    else if (playerThreeHP in 50..89)
        print("Player $playerThree's health is fine.")
    else if (playerThreeHP in 0..49)
        print("Player $playerThree's health is awful.")
    else
        print("ERROR: Player $playerThree's health is not in known range")

    println("\n      ### End Of Above Piece Of (If statement) Code ###\n")


    println("       ### Players' Health Points Checking System (using WHEN statements) ###")
    // Checking player one's HP:
    when (playerOneHP) {
        in 90..100 -> println("Player $playerOne's health is great.")
        in 50..90 -> println("Player $playerOne's health is fine.")
        in 0..49 -> println("Player $playerOne's health is awful.")
        else -> println("ERROR: Player $playerOne's health is not in known range")
    }

    // Checking player two's HP:
    when (playerTwoHP) {
        in 90..100 -> println("Player $playerTwo's health is great.")
        in 50..90 -> println("Player $playerTwo's health is fine.")
        in 0..49 -> println("Player $playerTwo's health is awful.")
        else -> println("ERROR: Player $playerTwo's health is not in known range")
    }

    // Checking player three's HP:
    when (playerThreeHP) {
        in 90..100 -> println("Player $playerThree's health is great.")
        in 50..90 -> println("Player $playerThree's health is fine.")
        in 0..49 -> println("Player $playerThree's health is awful.")
        else -> println("ERROR: Player $playerThree's health is not in known range")
    }
    println("      ### End Of Above Piece Of (WHEN statement) Code ###")
}