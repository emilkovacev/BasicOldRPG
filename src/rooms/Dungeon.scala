package rooms

class Dungeon(knight: Knight) extends State(knight: Knight) {

  println("\n\nYou have entered the Dungeon.\nA thundering echo bounds off the stone walls.")

  override def explore(): Unit = {
    println("You find a health potion\n+ 1 life")
    knight.lives += 1
  }

  override def toCastle(): Unit = {
    knight.state = new Castle(knight)
  }

  override def toCave(): Unit = {
    knight.state = new Cave(knight)
  }

  override def toDungeon(): Unit = {
    println("you are already in the Dungeon")
  }

  override def toHQ(): Unit = {
    knight.state = new HQ(knight)
  }
}
