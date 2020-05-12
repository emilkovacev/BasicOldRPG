package rooms

class Castle(knight: Knight) extends State(knight: Knight) {

  println("you have entered the Castle.\na long hallway shrouded in darkness lays ahead.")

  override def explore(): Unit = {
    println("\nyou discovered treasure!")
    println("currency + 1,000,000")
    knight.currency += 1000000
    println("currency: " + knight.currency.toString + "\n")
  }

  override def toCastle(): Unit = {
    println("you are already inside the castle")
  }

  override def toCave(): Unit = {
    knight.state = new Cave(knight)
  }

  override def toDungeon(): Unit = {
    knight.state = new Dungeon(knight)
  }

  override def toHQ(): Unit = {
    knight.state = new HQ(knight)
  }

}
