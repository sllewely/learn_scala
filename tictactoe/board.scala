

// Tictactoe board
// Sarah Llewelyn 2016

class Board {
  private val board_state = Array(Array(0, 0, 0), Array(0, 0, 0), Array(0, 0, 0))


  
  def move(x: Int, y: Int, player: Int): Unit = {
    // check if legal move
    if (valueAt(x, y) > 0) {
      // raise error for illegal move
    } else {
      setBoardMove(x, y, player)
    }
  }

  private def setBoardMove(x: Int, y: Int, player: Int): Unit = {
    board_state(x)(y) = player
  }

  def isVictorious: Boolean = {
    // perhaps cheaper to use a coordinates object and sets
    // brute force for now
    valueAt(0, 0) == valueAt(0, 1) && valueAt(0, 1) == valueAt(0, 2) && valueAt(0, 2) != 0 ||
    valueAt(1, 0) == valueAt(1, 1) && valueAt(1, 1) == valueAt(0, 2) && valueAt(0, 2) != 0 ||
    valueAt(2, 0) == valueAt(2, 1) && valueAt(2, 1) == valueAt(0, 2) && valueAt(0, 2) != 0 ||
    valueAt(0, 0) == valueAt(1, 0) && valueAt(1, 0) == valueAt(2, 0) && valueAt(2, 0) != 0 ||
    valueAt(0, 1) == valueAt(1, 1) && valueAt(1, 1) == valueAt(2, 1) && valueAt(2, 1) != 0 ||
    valueAt(0, 2) == valueAt(1, 2) && valueAt(1, 2) == valueAt(2, 2) && valueAt(2, 2) != 0 ||
    valueAt(0, 0) == valueAt(1, 1) && valueAt(1, 1) == valueAt(2, 2) && valueAt(2, 2) != 0 ||
    valueAt(0, 2) == valueAt(1, 1) && valueAt(1, 1) == valueAt(2, 0) && valueAt(2, 0) != 0
  }

  // value at given coordinates
  private def valueAt(x: Int, y: Int): Int = {
    board_state(x)(y)
  }

  override def toString(): String = {
    var str = ""
    for(y <- 0 until 3) {
      for(x <- 0 until 3) {
        str += valueAt(x, y)
      }
      str += "\n"
    }
    str
  }

}




def runTicTacToe(): Unit = {

  val board = new Board

  var turn = 0
  var player = 0
  var won = false
  while(turn < 9 && !won) {
    player = turn % 2 + 1
    println("Make your move")

    try {
      val x = scala.io.StdIn.readLine.toInt
      val y = scala.io.StdIn.readLine().toInt
      board.move(x, y, player)

      println(board)

      if (board.isVictorious) {
        println("You won!")
        won = true
      }
      turn += 1
    } catch {
      case nfe: NumberFormatException =>
        // bad input
    }

  }


}



val board = new Board

println(board)
board.move(1, 2, 2)
board.move(1, 1, 1)
println(board)

println("game")
runTicTacToe


