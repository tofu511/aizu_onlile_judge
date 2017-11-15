// AOJに提出する際はオブジェクト名をMainにすること(MainにしないとRunTime Errorになる)
object InsertionSort {
  def main(args: Array[String]): Unit = {
    val scanner = new java.util.Scanner(System.in)
    val size = scanner.nextInt()
    var arr = Array.empty[Int]
    
    for(i <- (0 until size)) {
       arr = arr :+ scanner.next().toInt // 配列の末尾に要素を追加する場合は:+を使う
    }

    insertionSort(arr,size)
    
    scanner.close()
  }

  def insertionSort(a: Array[Int], n: Int) = {
    var arr = a
    for(i <- (0 until n)) {
      var v = a(i)
      var j = i - 1

      while (j >= 0 && a(j) > v) {
        arr(j + 1) = arr(j)
        j = j - 1
      }
      arr(j+1) = v
      
      println(arr.mkString(" "))
    }
  }
}