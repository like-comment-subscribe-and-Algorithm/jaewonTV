package week2.commom

// boj_2512_예산

fun calcBudget(mid : Int,n : Int,arr : List<Int>) : Int {
    var sum = 0

    for (i in 0..<n) {
        if (mid<arr[i])
            sum += mid
        else
            sum += arr[i]
    }
    return sum
}

fun main() {
    val n = readln().toInt()
    val arr : List<Int> = readln().split(" ").map { it.toInt() }.sorted()
    var total : Int = readln().toInt()

    var left : Int = 0
    var right = arr[n-1]
    var max = 0

    if (arr.sum() < total) {
        println(arr.max())
    } else {
        while (left <= right) {
            val mid = (left+right)/2
            val result = calcBudget(mid,n,arr)

            if (total >=result) {
                max = mid
                left = mid +1
            }
            else{
                right = mid -1
            }
        }

        println(max)
    }
}