
import scala.io.Source

// Read from file
val lines = Source.fromFile(args(0)).getLines.toList

def widthOfLength(s: String) = s.length.toString.length

val longestLine = lines.reduceLeft(
  (a, b) => if (a.length > b.length) a else b
)

println(longestLine)

