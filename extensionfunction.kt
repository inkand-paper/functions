What is Extension function?
A way to add new functions to existing types (like String, Int, etc.) without changing them.

📦 Syntax:
fun String.shout(): String {
    return this.uppercase() + "!"
}
println("hello".shout()) // HELLO! -> output

here -> String is a built-in class in Kotlin 
we can create our own class and use it too!
-------------------------------------------------------------

  
****How to create an extension function for your own class?
  
Step 1: Create your own class
class Dog(val name: String) {
    fun bark() = "Woof!"
}


Step 2: Add an extension function to Dog
fun Dog.greet() = "Hello, my name is $name"


Step 3: Use it
val dog = Dog("Buddy")
println(dog.bark())   // Output: Woof!  (normal function)
println(dog.greet())  // Output: Hello, my name is Buddy  (extension function)

we will learn more about class later on!!


🧠 Real Life:
Like teaching a toy robot a new trick it never had before.

