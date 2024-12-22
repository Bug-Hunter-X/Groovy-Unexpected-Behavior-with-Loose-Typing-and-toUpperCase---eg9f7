```groovy
def myMethod(String str) {
  if (str == null) {
    return "Null String"
  } else if (str.isEmpty()) {
    return "Empty String"
  } else if (str instanceof String) {
    return str.toUpperCase()
  } else {
    return "Invalid Input: Not a String"
  }
}

assert myMethod(null) == "Null String"
assert myMethod("") == "Empty String"
assert myMethod("hello") == "HELLO"
assert myMethod(["a", "b"]) == "Invalid Input: Not a String" 
```