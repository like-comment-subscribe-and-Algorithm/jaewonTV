package week2.commom

// boj_1790_종이의개수

var arr : MutableList<List<Int>> = mutableListOf()
var n : Int = 0
var counts = intArrayOf(0,0,0)

fun input() {
    n = readln().toInt()
    // 리스트 입력 ex) [[1,3],[3,5]...]
    repeat(n) {
        arr.add(readln().split(" ").map { it.toInt() })
    }
}

fun checkArray(x : Int,y : Int,size : Int) {
    val value = arr[0][0]
    var flag = false

    for(i in x..<x+size) {
        for (j in y..<y+size) {
            if(value != arr[i][j]) {
                flag =true
                if( i%3==0 && j%3==0 && size>3) {
                    checkArray(i,j,size/3)
                }
            }
        }
    }

    if (flag == false)
        counts[value+1]++
}

fun main() {

    input()

    checkArray(0,0,9)
    println(counts[0])

}