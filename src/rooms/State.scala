package rooms

abstract class State(knight: Knight) {

  def explore(): Unit

  def toCastle(): Unit

  def toCave(): Unit

  def toDungeon(): Unit

  def toHQ(): Unit

}
