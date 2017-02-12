
// experiment with parameterizing an array

val cats: Array[String] = new Array[String](3)
// omg I am so thankful I already know Java

cats(0) = "tabby"
cats(1) = "calico"
cats(2) = "tuxedo"

for (i <- 0 to 2)
  print(cats(i) + ' ')

println

println
println("In what way are vals with arrays mutable?")
// The object to which val refers to cannot be changed, but the elements of its array can be

println("How are alements in scala arrays accessed:?")
// With parens, not square brackets.  How strange!



