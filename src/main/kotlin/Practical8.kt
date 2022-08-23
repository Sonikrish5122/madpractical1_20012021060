import java.util.*

fun sorting(arr:Array<Int>){
    val len = arr.size
    var temp = 0
    for (i in 0..len-1){
        for (j in i..len-1){
            if (arr[i]> arr[j]){
                temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }
    }
}
fun main()
{

    val arr= arrayOf(10,90,60,80,100)
    sorting(arr)
    for(i in arr){
        println(i)
    }
    println("Original array by array of array : ${Arrays.toString(arr)}")
    arr.sort()
    println("Sorted array : ${Arrays.toString(arr)}")
    println("contentToString ${arr.contentToString()}")
    // declaring an array using arrayOf<Int>
    val arr1 = arrayOf<Int>(10, 20, 30, 40, 50)
    for (i in 0..arr1.size-1)
    {
        println(" array using arrayOf<Int>"+arr1[i])
    }
}