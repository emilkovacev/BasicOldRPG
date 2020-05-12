package rooms

class HQ(knight: Knight) extends State(knight: Knight) {

  println("\nYou arrive at HQ.\nThe wind shutters through the thinly lain tarp.\nIt's not much but it will suffice.")

  override def explore(): Unit = {
    knight.currency += 1000000
  }

  override def toCastle(): Unit = {
    knight.state = new Castle(knight)
  }

  override def toCave(): Unit = {
    knight.state = new Cave(knight)
  }

  override def toDungeon(): Unit = {
    knight.state = new Dungeon(knight)
  }

  override def toHQ(): Unit = {
    println("you are already at HQ")
  }

}
