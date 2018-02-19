object Partridge extends App {

  def part(args: Array[String]): String = {
    val quoteSet = Set("Partridge", "PearTree", "Chat", "Dan", "Toblerone", "Lynn", "AlphaPapa", "Nomad")
    val q = args.count((i: String) => quoteSet contains i)
    if (q == 0) {"Lynn, I've pierced my foot on a spike!!"}
    else {s"Mine's a Pint" + "!" * q}
  }

}
