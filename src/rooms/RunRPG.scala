package rooms

object RunRPG {
  def main(args: Array[String]): Unit = {
    val knight: Knight = new Knight

    knight.explore()

    knight.toHQ()

    knight.explore()

  }
}
