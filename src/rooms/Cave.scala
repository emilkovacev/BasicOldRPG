package rooms

class Cave(knight: Knight) extends State(knight: Knight) {

  println("you enter the cave.\na piercing screech erupts from the depths of the cave.\na flood of bats swarms over your head\n")

  override def explore(): Unit = {
    println("a hidden trap lunges towards you\n- 1 life")
    knight.lives -= 1
  }

  override def toCastle(): Unit = {
    knight.state = new Castle(knight)
  }

  override def toCave(): Unit = {
    println("you are already in the cave\n")
  }

  override def toDungeon(): Unit = {
    knight.state = new Dungeon(knight)
  }

  override def toHQ(): Unit = {
    knight.state = new HQ(knight)
  }

}
