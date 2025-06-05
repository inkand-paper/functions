What is Higher order function??
A function that takes another function as a parameter.





📦 Syntax:
fun operate(a: Int, b: Int, task: (Int, Int) -> Int): Int {
    return task(a, b)
}
inside main function ----->         val result = operate(3, 5) { x, y -> x * y }
                                    println(result) // 15





🧠 Real Life:
Like a manager who says, “Tell me how to combine these two workers’ results.”
