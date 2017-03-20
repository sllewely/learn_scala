
val demand = "Tell me what to do with my time!!"

val source = scala.io.Source.fromFile("todo.txt")
val lines = try source.mkString finally source.close()


