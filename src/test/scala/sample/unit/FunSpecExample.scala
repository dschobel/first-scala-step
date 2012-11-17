import collection.mutable
import org.junit.runner.RunWith
import org.scalatest.FunSpec
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ExampleSpec extends FunSpec {

  describe("A Stack") {

    it("should pop values in last-in-first-out order") {
      val stack = new mutable.Stack[Int]
      stack.push(1)
      stack.push(2)
      assert(stack.pop() === 2)
      assert(stack.pop() === 1)
    }

    it("should throw NoSuchElementException if an empty stack is popped") {
      val emptyStack = new mutable.Stack[Int]
      intercept[NoSuchElementException] {
        emptyStack.pop()
      }
    }
  }
}