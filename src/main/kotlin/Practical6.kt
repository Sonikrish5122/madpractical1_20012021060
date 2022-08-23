import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)

    print("Enter a first number: ")
    val num1 = reader.nextInt()

    print("Enter a Second number: ")
    val num2 = reader.nextInt()

    val addition = num1+num2
    val subtraction = num1-num2
    val multiplication = num1*num2
    val division = num1/num2

    println("Addition of $num1 and $num2 is : $addition")
    println("Subtraction of $num1 and $num2 is : $subtraction")
    println("Multiplication of $num1 and $num2 is : $multiplication")
    println("Division of $num1 and $num2 is : $division")
}