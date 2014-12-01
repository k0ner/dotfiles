package interview

import java.util.Optional

import org.specs2.mutable.Specification

class OperationTest extends Specification {

  "Operation" should {
    "parse operations from string" in {
      Operation.fromString("+").get() must_== Operation.ADD
      Operation.fromString("-").get() must_== Operation.SUBTRACT
      Operation.fromString("/").get() must_== Operation.DIVIDE
      Operation.fromString("*").get() must_== Operation.MULTIPLY
      Operation.fromString("%") must_== Optional.empty()
    }

    "produces proper results" in {
      Operation.getResult(10, 10, Operation.ADD) must_== 20
      Operation.getResult(10, 10, Operation.SUBTRACT) must_== 0
      Operation.getResult(10, 10, Operation.MULTIPLY) must_== 100
      Operation.getResult(10, 10, Operation.DIVIDE) must_== 1
    }
  }

}
