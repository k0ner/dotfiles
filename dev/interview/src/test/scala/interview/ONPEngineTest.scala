package interview

import java.util.InputMismatchException

import org.specs2.mutable.Specification

class ONPEngineTest extends Specification {

  "ONPEngine" should {
    "throws InputMismatchException when not valid ONP input" in {
      //given
      val input = "12 2 3 4 * 10 5 / + *"

      //then
      ONPEngine.compute(input) must throwA(new InputMismatchException("Input \"12 2 3 4 * 10 5 / + *\" is not valid ONP expression"))
    }

    "returns 40" in {
      //given
      val input = "12 2 3 4 * 10 5 / + * +"

      //then
      ONPEngine.compute(input) must_== 40
    }
  }
}