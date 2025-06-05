What is vararg (variable arguments)?
When you don’t know how many arguments someone will pass.



📦 Syntax:
//for addition
fun sumAll(vararg nums: Int): Int {
    return nums.sum()
}

inside mainfunction,, val result = sumAll(1,2,3) //output 6

//for other operation we will learn later!!!


🧠 Real Life:
Like a shopping cart: you can add 1 item, or 50 items.
