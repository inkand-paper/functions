Lambda function strucuture: val functionName: (InputType) -> OutputType = { parameterName: InputType -> operation }


What is it?
A mini unnamed function stored in a variable or passed as an input.

📦 Syntax:
val double = { x: Int -> x * 2 }
println(double(4)) // 8
// here  we didnt gave the input and output type this is also accepted in kotlin!!


🧠 Real Life:
Like giving someone a tiny job: "Here's a paper, double the number."
