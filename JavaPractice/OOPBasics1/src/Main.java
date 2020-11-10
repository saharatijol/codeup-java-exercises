public class Main {

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("calculator.getAdditionResult() = " + calculator.getAdditionResult());
        System.out.println("calculator.getSubtractionResult() = " + calculator.getSubtractionResult());

        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("calculator.getMultiplicationResult() = " + calculator.getMultiplicationResult());
        System.out.println("calculator.getDivisionResult() = " + calculator.getDivisionResult());
    }
}
