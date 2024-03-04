package week2.commom

// boj_1904_01타일

fun main() {

    val n = readln().toInt()

    var memo = IntArray(1000001) { 0 }

    memo[1] = 1
    memo[2] = 2

    for(i in 3..n) {
        memo[i] = (memo[i-1] + memo[i-2])%15746
    }

    println(memo[n])
}