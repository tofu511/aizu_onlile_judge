// AOJに提出する際はオブジェクト名をMainにしないとRunTime Errorになる
object StableSort {
	def main(args: Array[String]): Unit = {
		val scanner = new java.util.Scanner(System.in)
		val length = scanner.nextInt()
		var inputArray1 = new Array[String](length)
		var inputArray2 = new Array[String](length)

		for(i <- 0 until length) {
			inputArray1(i) = scanner.next()
			inputArray2(i) = inputArray1(i)
		}

		var bOutput = bubbleSort(inputArray1, length)
		println(bOutput.mkString(" "))
		println("Stable") // ちゃんと実装されていればBubblesortは常に安定的なソートになる

		var sOutput = selectionSort(inputArray2, length)
		println(sOutput.mkString(" "))
		if(isStable(bOutput, sOutput, length)) println("Stable")
		else println("Not stable")

		scanner.close()
	}


	def bubbleSort(inputArray: Array[String], length: Int): Array[String] = {
		var cards = inputArray
		for(i <- 0 until length; j <- length - 1 until 0 by - 1) {
			if(cards(j).slice(1,2) < cards(j - 1).slice(1,2)) { // 比較演算子に=を入れると不安定なソートになるので注意
				val tmp = cards(j)
				cards(j) = cards(j - 1)
				cards(j - 1) = tmp
			}
		}
		cards
	}

	def selectionSort(inputArray: Array[String], length: Int): Array[String] = {
		var cards = inputArray
		for(i <- 0 until length) {
			var minj = i
			for(j <- i until length) {
				if(cards(j).slice(1,2) < cards(minj).slice(1,2)) {
					minj = j
				}
			}
			val tmp = cards(i)
			cards(i) = cards(minj)
			cards(minj) = tmp
		}
		cards
		
	}

	def isStable(bOutput: Array[String], sOutput: Array[String], length: Int): Boolean = {
		for(i <- 0 until length) {
			if(bOutput(i) != sOutput(i)) return false
		}
		true
	}
}