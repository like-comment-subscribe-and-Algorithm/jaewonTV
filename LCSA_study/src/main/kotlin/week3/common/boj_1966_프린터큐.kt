package week3.common

import java.util.*

data class Document(val index: Int, val priority: Int)

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val N = br.readLine().toInt()
    var output = ""

    repeat(N) {
        val (n, m) = br.readLine().split(" ").map { it.toInt() }
        val priorities = br.readLine().split(" ").map { it.toInt() }
        val queue: Queue<Document> = LinkedList<Document>()

        priorities.forEachIndexed { index, priority ->
            queue.add(Document(index, priority))
        }

        var printCount = 0

        while (true) {
            val cDocument = queue.poll()
            if (queue.any { it.priority > cDocument.priority }) {
                queue.add(cDocument)
            } else {
                printCount++
                if (cDocument.index == m) {
                    output += "$printCount\n"
                    break
                }
            }
        }
    }

    bw.write(output)
    bw.flush()
    bw.close()
}