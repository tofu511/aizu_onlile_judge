// AOJに提出する際はオブジェクト名をMainにしないとRunTime Errorになる
object Main {
    def main(args: Array[String]): Unit = {
        val scanner = new java.util.Scanner(System.in)
        val length = scanner.nextInt()
        var inputArray = Array.empty[Int]
 
        for(i <- 0 until length) {
            inputArray = inputArray :+ scanner.next().toInt
        }
 
        bubbleSort(inputArray, length)
 
        scanner.close()
 
    }
 
    def bubbleSort(a: Array[Int], n: Int): Unit = {
        var sortCount = 0
        for(i <- n until 0 by - 1; j <- n - 1 until 0 by - 1) { // マイナスにループさせる場合 by - 1 をつける
            if(a(j - 1) > a(j)) {
                val tmp = a(j)
                a(j) = a(j - 1)
                a(j - 1) = tmp
                sortCount += 1
            }
        }
 
        println(a.mkString(" "))
        println(sortCount)
    }
}