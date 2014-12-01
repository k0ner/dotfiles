package interview;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.InputMismatchException;
import java.util.Stack;

public class ONPEngine {

    public static Integer compute(String input) {
        final Stack<Integer> stack = new Stack<>();

        for (String element : input.split("\\s+")) {
            if (NumberUtils.isNumber(element)) {
                stack.push(Integer.parseInt(element));

            } else if (Operation.fromString(element).isPresent()) {
                Operation operation = Operation.fromString(element).get();
                Integer a = stack.pop(), b = stack.pop();

                //b operation a
                stack.push(Operation.getResult(b, a, operation));
            } else {
                throw new InputMismatchException(String.format("Input value %s not supported", element));
            }
        }

        if (stack.size() != 1) {
            throw new InputMismatchException(String.format("Input \"%s\" is not valid ONP expression", input));
        }
        return stack.pop();
    }
}
