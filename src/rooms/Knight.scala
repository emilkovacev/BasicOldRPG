package rooms

class Knight {

  var state: State = new Castle(this)

  var currency: Int = 0
  var lives: Int = 3

  def explore(): Unit = {
    this.state.explore()
  }

  def toCastle(): Unit = {
    this.state.toCastle()
  }

  def toCave(): Unit = {
    this.state.toCave()
  }

  def toDungeon(): Unit = {
    this.state.toDungeon()
  }

  def toHQ(): Unit = {
    this.state.toHQ()
  }
}
