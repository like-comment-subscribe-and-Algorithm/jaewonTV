package chapter2

val firstLine = readln().split(" ").map { it.toInt() }
val numberSize = firstLine[0]
val input_sum = firstLine[1]

val numbers  = readln().split(" ").map { it.toInt() }

var count = 0

fun subsetSum(index : Int, currentSum : Int)  {

    // index를 넘는다면 재귀함수 종료
    if (index >= numberSize) {
        return
    }

    val newSum = currentSum + numbers[index]

    // 입력한 합과 같은지 체크
    if (currentSum + numbers[index] == input_sum) {
        count++
    }

    // 현재 index를 더하는 재귀함수
    subsetSum(index+1,newSum)

    // 현재 index를 더하지 않는 재귀함수
    subsetSum(index+1,currentSum)
}

fun main(args: Array<String>) {

    subsetSum(0,0)

    println(count)
}