//Kotlin Argument ver.
val hoge = 2
when (hoge) {
    0 -> {
        println("0")
    }
    1, 2 -> {
        println("1, 2")
    }
    else -> {
        println("else")
    }
}

//Kotlin Non Argument ver.
val hoge = 2
when {
    hoge == 0 -> {
        println("0")
    }
    hoge == 1 || hoge == 2 -> {
        println("1, 2")
    }
    else -> {
        println("else")
    }
}

// Kotlin using or Don't ||
val hoge = 2
when (hoge) {
    0 -> {
        println("0")
    }
    1 or 2 -> {
        println("1, 2")
    }
    else -> {
        println("else")
    }
}

// Kotlin using Boolean
val foo = false
val bar = true
when {
    foo -> {
        println("foo")
    }
    foo || bar -> {
        println("foo, bar")
    }
    else -> {
        println("else")
    }
}

// Kotlin using Enum
val value = Hoge.GHI
when (value) {
    Hoge.ABC -> {
        println("ABC")
    }
    Hoge.DEF, Hoge.GHI -> {
        println("DEF, GHI")
    }
    else -> {
        println("else")
    }
}

// Kotlin using and. OK : &&. and  
val foo = true
val bar = true
when {
    bar && foo -> {
        println("foo and bar")
    }
    bar -> {
        println("bar")
    }
    else -> {
        println("else")
    }
}