package edu.example.leccion1

fun main(){
    step1()
    step2()
}

private fun step1(){
    // var rocks: Int = null -> error: null can not be a value of a non-null type Int
    var marbles: Int? = null
}

private fun step2(){
    var fishFoodTreats = 6
    if (fishFoodTreats != null) {
        fishFoodTreats = fishFoodTreats.dec()
    }

    fishFoodTreats = fishFoodTreats?.dec() ?: 0
}