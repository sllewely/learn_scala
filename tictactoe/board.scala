
// Tictactoe board
// Sarah Llewelyn 2016

class Board {
  private val board_state = Array(Array(0, 0, 0), Array(0, 0, 0))


  
  def move(x: Int, y: Int, player: Int): Unit = {
    // check if legal move
    if valueAt(x, y) > 0 {
      // raise error for illegal move
    } else {
      setBoardMove(x, y, player)
    }
  }

  def setBoardMove(x: Int, y: Int, player: Int): Unit = {
    board_state(y)(x) = player
  }


  // value at given coordinates
  def valueAt(x: Int, y: Int): Int = {
    return board_state(y)(x)
  }

}


