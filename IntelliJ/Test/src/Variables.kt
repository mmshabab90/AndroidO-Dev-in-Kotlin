fun main(args: Array<String>) {
    //var is mutable meaning it's value can be changed
    //val is immutable meaning it's value can't be changed
    val name = "Shabab"
    var isAwesome = true
    println("Is " + name + " awesome? The answer is : " + isAwesome)

    var a = 60
    var b = 9
    println(a + b)

    val doubleNum = 123.45  //64bit numbers; can hold much bigger number than float
    val floatNum = 123.45f  //32 bit number

    //explicit type setting
    val longNum: Long = 12345678969L  //64bit number

    //Type conversion
    val aDouble = a.toDouble()
    val bString = b.toString()

    //declaring variable without setting value
    var hero: String
    hero = "Iron Man"
    hero = "Batman"
    println(hero)
}