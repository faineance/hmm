package hmm

import org.scalatest.{BeforeAndAfter, FunSuite}

import scala.collection.mutable.ListBuffer

class InventoryTests extends FunSuite with BeforeAndAfter {
  var inventory: Inventory = _

  before(
    inventory = new Inventory
  )

  test("Empty Inventory") {
    assert(inventory.size == 0)
    assert(inventory.empty)
    assert(inventory.all == new ListBuffer[Item])
    assert(inventory.get(0).isEmpty)
  }
}
