// AOJに提出する際はオブジェクト名をMainにすること(MainにしないとRunTime Errorになる)
object SelectionSort {
	def main(args: Array[String]): Unit = {
		val scanner = new java.util.Scanner(System.in)
		val size = scanner.nextInt()
		var arr = Array.empty[Int]

		for(i <- 0 until size) {
			arr = arr :+ scanner.next().toInt
		}

		selectionSort(arr, size)

		scanner.close()
	}

	def selectionSort(a: Array[Int], n: Int): Unit = {
		var sortCount = 0
		for(i <- 0 until n) {
			var minj = i

			for(j <- i until n) {
				if(a(j) < a(minj)) {
					// 未ソート部分で一番小さい値の位置を特定する
					minj = j
				}
			}

			val tmp = a(i)
			a(i) = a(minj)
			a(minj) = tmp
			
			// iとminjが一致しない(iが未ソート部分で最小の要素でない)場合は値の入れ替えが起きるのでカウントアップ
			if(i != minj) {
				sortCount += 1
			}
		}

		println(a.mkString(" "))
		println(sortCount)
	}
}