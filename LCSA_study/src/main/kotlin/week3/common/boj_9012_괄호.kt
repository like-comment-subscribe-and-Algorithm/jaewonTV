package week3.common

fun main() {
    val N = readLine()!!.toInt()
    for (i in 0 until N) {
        val vps = readLine()!!.trim()
        val S = mutableListOf<Char>()
        var flag = true

        for (k in vps) {
            if (S.isNotEmpty()) {
                if (k == ')') {
                    S.removeAt(S.lastIndex)
                } else {
                    S.add(k)
                }
            } else {
                if (k == ')') {
                    flag = false
                    break
                } else {
                    S.add(k)
                }
            }
        }

        if (flag && S.isEmpty()) {
            println("YES")
        } else {
            println("NO")
        }
    }
}
