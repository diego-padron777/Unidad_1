package edu.example.leccion1
fun main(){
    step1()
    step2()
}

fun step1(){
    println(1+1)
    println(53-3)
    println(50/10)
    println(1.0/2.0)
    println(2.0*3.5)
    println(6*50)
    println(6.0*50.0)
    println(6.0*50)
    println(2.times(3))
    println(3.5.plus(4))
    println(2.4.div(2))

}

fun step2() {
    val i: Int = 6
    val b1 = i.toByte()
    println(b1)

    val b2: Byte = 1 // OK, literals are checked statically

    val i4: Int = b2.toInt() // OK!
    println(i4)

    val i5: String = b2.toString()
    println(i5)

    val i6: Double = b2.toDouble()
    println(i6)

    val oneMillion = 1_000_000
    println(oneMillion)
    val socialSecurityNumber = 999_99_9999L
    println(socialSecurityNumber)
    val hexBytes = 0xFF_EC_DE_5E
    println(hexBytes)
    val bytes = 0b11010010_01101001_10010100_10010010
    println(bytes)
}