// Traditional usage 
var max = a 
if (a < b) max = b

// With else 
var max: Int
if (a > b) {
    max = a
} else {
    max = b
}

// Kotlin is Non 3 Section operators.
val max = if (a > b) {
    print("Choose a")
    a
} else {
    print("Choose b")
    b
}