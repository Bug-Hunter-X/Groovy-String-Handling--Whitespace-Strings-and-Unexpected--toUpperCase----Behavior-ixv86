```groovy
def myMethod(String str) {
  if (str == null) {
    return "Null String"
  } else if (str.trim().length() == 0) {
    return "Empty String"
  } else {
    return str.trim().toUpperCase()
  }
}

println myMethod(null) //Output: Null String
println myMethod("") //Output: Empty String
println myMethod("hello") //Output: HELLO
println myMethod("   ") //Output:    
```