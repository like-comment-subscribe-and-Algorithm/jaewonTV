package week1.commom

var timeTable : MutableList<List<Int>> = mutableListOf()

fun input() {
    val n = readln().toInt()

    // 리스트 입력 ex) [[1,3],[3,5]...]
    for (i in 1..n) {
        val mTime = readln().split(" ").map { it.toInt() }
        timeTable.add(mTime)
    }
}
fun main() {

    // 예제 입력
    input()

    // 종료시간 기준으로 오름차순 정렬하고 종료시간이 같다면 시작시간 오름차순 정렬
    val timeTable = timeTable.sortedWith(compareBy({ it[1] }, { it[0] }))

    // 종료시간 초기값
    var end = -1

    // 갯수 Count
    var count= 0

    // 정렬된 시간 종료시간이 빠른 시간 기준으로 greedy 적용
    for (mTime in timeTable) {
        if (end <= mTime[0]) {
            end = mTime[1]
            count++
        }
    }

    println(count)
}