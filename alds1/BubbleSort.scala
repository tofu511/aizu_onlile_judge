// AOJに提出する際はオブジェクト名をMainにすること(MainにしないとRunTime Errorになる)
object BubbleSort {
	def main(args: Array[String]): Unit = {
		val scanner = new java.util.Scanner(System.in)
		val size = scanner.nextInt()
		var arr = Array.empty[Int]

		for(i <- 0 until size) {
			arr = arr :+ scanner.next().toInt
 		}

		bubbleSort(arr, size)

		scanner.close()
	}

	def bubbleSort(a: Array[Int], n: Int): Unit = {
		var flag = 1
		var sortCount = 0
		while(flag == 1) {
			flag = 0
			for(i <- (n - 1 until 0 by - 1)) { // マイナスにループさせる場合 by - 1 をつける
				if(a(i-1) > a(i)) {
					var tmp = a(i - 1)
					a(i - 1) = a(i)
					a(i) = tmp
					sortCount += 1
					flag = 1
				}
			}
		}
		println(a.mkString(" "))
		println(sortCount)
	} 
}