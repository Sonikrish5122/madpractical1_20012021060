
//tailrec  Method
fun main(args: Array<String>) {
    print("Enter number: ")
    val number: Int = Integer.valueOf(readLine())
    val factorial = fact(number)
    println("Factorial of by tail recursion Method $number = $factorial")

}

tailrec fun fact(n: Int, temp: Int = 1): Int {
    return if (n == 1){
        temp
    } else {
        fact(n-1, temp*n)
    }
}