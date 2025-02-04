```groovy
def myMethod(String str) {
  if (str == null) {
    return "Null String"
  } else if (str.length() == 0) {
    return "Empty String"
  } else {
    return str.toUpperCase()
  }
}

println myMethod(null) //Output: Null String
println myMethod("") //Output: Empty String
println myMethod("hello") //Output: HELLO

//The unexpected behavior is when the method receives a String object with only white spaces.
println myMethod("   ") //Output: ""
```