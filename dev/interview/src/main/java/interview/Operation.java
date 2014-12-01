package interview;

import java.util.InputMismatchException;
import java.util.Optional;

public enum Operation implements Element {

    ADD("+"), SUBTRACT("-"), MULTIPLY("*"), DIVIDE("/"), ABS("abs");

    private final String operation;

    private Operation(final String operation) {
        this.operation = operation;
    }

    public static Optional<Operation> fromString(String text) {
        if (text != null) {
            for (Operation b : Operation.values()) {
                if (text.equalsIgnoreCase(b.operation)) {
                    return Optional.of(b);
                }
            }
        }
        return Optional.empty();
    }

    public static Integer getResult(Operation operation, Integer a) {
        switch (operation) {
            case ABS:
                return Math.abs(a);
            default:
                throw new InputMismatchException(String.format("Wrong input parameters %d %s", a, operation));
        }
    }

    public static Integer getResult(Operation operation, Integer a, Integer b) {
        switch (operation) {
            case ADD:
                return a + b;
            case SUBTRACT:
                return a - b;
            case MULTIPLY:
                return a * b;
            case DIVIDE:
                return a / b;
            default:
                throw new InputMismatchException(String.format("Wrong input parameters %d %d %s", a, b, operation));
        }
    }
}
