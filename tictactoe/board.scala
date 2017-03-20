
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
    board_state(y)(x) = player
  }


  // value at given coordinates
  private def valueAt(x: Int, y: Int): Int = {
    board_state(y)(x)
  }

  override def toString(): String = {
    var str = ""
    for(y <- 0 until 3) {
      for(x <- 0 until 3) {
        str += valueAt(y, x)
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
  while(turn < 9) {
    player = turn % 2 + 1
    println("Make your move")
    val x = scala.io.StdIn.readLine.toInt
    val y = scala.io.StdIn.readLine().toInt
    board.move(x, y, player)

    println(board)
    turn += 1
  }


}



val board = new Board

println(board)
board.move(1, 2, 2)
board.move(1, 1, 1)
println(board)

println("game")
runTicTacToe


