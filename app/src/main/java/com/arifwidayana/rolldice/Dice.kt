package com.arifwidayana.rolldice

/*fun main() {
    val myFirstDice = Dice(6).roll()
    val luckyNumber = 4

    when (myFirstDice) {
        luckyNumber -> println("You win!")
        1 -> println("So sorry! You rolled a 1. Try again!")
        2 -> println("Sadly, you rolled a 2. Try again!")
        3 -> println("Unfortunately, you rolled a 3. Try again!")
        5 -> println("Don't cry! You rolled a 5. Try again!")
        else -> println("Apologies! You rolled a 6. Try again!")
    }
}*/

class Dice (private val numSides: Int) {
    fun roll(): Int{
        return (1..numSides).random()
    }
}