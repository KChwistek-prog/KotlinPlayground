package sorting

fun main(args: Array<String>) {
    val array = intArrayOf(6,1,7,2,8,3,9,4,10,5)
    println("Unsorted array:      ${array.contentToString()}")
    println("Bubble sorted array: ${bubbleSort(array).contentToString()}")
}

fun bubbleSort(arr: IntArray):IntArray{
    for (i in arr.indices){
        for (j in arr.indices){
            val a = arr[i]
            val b = arr[j]
            if (a<b){
                arr[i] = b
                arr[j] = a
            }
        }
    }
    return arr
}