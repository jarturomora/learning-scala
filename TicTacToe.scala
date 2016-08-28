//TicTacToe.scala
import com.atomicscala.AtomicTest._

class Cell{
    var entry = ' '
    def set(e:Char):String = {
        if (entry == ' ' && (e == 'X' ) || e == 'O') {
            entry = e
            "Successful move"
        } else
            "Invalid move"
    }
}

class Grid{
    val cells = Vector(
        Vector(new Cell, new Cell, new Cell),
        Vector(new Cell, new Cell, new Cell),
        Vector(new Cell, new Cell, new Cell)
        )
    def play(e:Char, x:Int, y:Int):String = {
        if (x < 0 || x > 2 || y < 0 || y > 2)
            "Invalid move"
        else
            cells(x)(y).set(e)
    }
}

val grid = new Grid
grid.play('X', 1, 1) is "Successful move"
grid.play('X', 1, 1) is "Invalid move"
grid.play('O', 1, 3) is "Invalid move"