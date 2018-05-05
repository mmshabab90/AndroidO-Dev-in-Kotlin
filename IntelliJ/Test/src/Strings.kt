fun main(args: Array<String>) {
    //escaped string = we can use escaped characters with it
    val str = "May the \t force \n be with you!\b"
    println(str)
    //raw string
    val rawCrawl = """|A long time ago....
        |in a galaxy
        |far, far, away...
        |sBum Bum Bum Bumpara Bumpara!!!""".trimMargin()
    println(rawCrawl)

    //Alternative to the above
    val rawCrawl2 = """>A long time ago....
        >in a galaxy
        >far, far, away...
        >sBum Bum Bum Bumpara Bumpara!!!""".trimMargin(">")
    println(rawCrawl2)

//    for (char in str){
//        println(char)
//    }

    //string comparision
    val contentEquals = str.contentEquals("May the force be with you!")
    println(contentEquals)

    val contains = str.contains("Force", false)
    println(contains)

    val upperCase = str.toUpperCase()
    val lowerCase = str.toLowerCase()

    println(upperCase)
    println(lowerCase)

    val num = 6
    val stringNum = num.toString()
    println("This number: " + stringNum + " is actually a string")

    val subSequence = str.subSequence(4, 13)
    println(subSequence)

    //string templates
    val luke = "Luke Skywalker"
    val lighhtSaberColor = "Blue"
    val vehicle = "Landspeeder"
    val age = 1000000

    println("$luke has a $lighhtSaberColor lightsaber and drives a $vehicle and now looks like $age years old")
    println("Luke's full name is $luke and has ${luke.length} characters in his name")
}