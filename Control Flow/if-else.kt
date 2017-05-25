// Kotlin
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

// Java
//if
int max = 10;
if( max < 20 ) max = 20;

// else
int max = 10;
if( max < 20 ){
    max = 20;
}
else {
    max = max;
}

//3 Section operator.
int hoge = 20;
int fuga = 40;
int max  = ( hoge < huga ) ? println( hoge ) : println( fuga );
    
