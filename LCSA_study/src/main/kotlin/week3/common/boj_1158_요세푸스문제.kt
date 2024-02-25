package week3.common

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val linkList = LinkedList<Int>()

    for (i in 1..n) {
        linkList.add(i)
    }

    var index = 0
    var output = "<"

    while (linkList.isNotEmpty()) {
        index = (index + k - 1) % linkList.size
        output += if (linkList.size > 1) "${linkList.removeAt(index)}, " else "${linkList.removeAt(index)}"
    }

    output += ">"
    bw.write(output)
    bw.flush()
    bw.close()
}
