package hmm

import scala.collection.mutable.ListBuffer

class Inventory {
  private val items = ListBuffer[Item]()

  def all = items

  def empty = items.isEmpty

  def size = items.length

  //def add(item: Item) = items += item

  //def remove(item: Item) = items.remove(items.indexOf(item))

  def get(index: Int): Option[Item] = {
    try {
      Some(items(index))
    }
    catch {
      case _: Throwable => None
    }
  }
}
