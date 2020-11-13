public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public void add (double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber num) {
        add(num.getReal(), num.getImaginary());
    }

    public void subtract (double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber num) {
        subtract(num.getReal(), num.getImaginary());
    }




    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.getReal() = " + one.getReal());
        System.out.println("one.getImaginary() = " + one.getImaginary());

        one.subtract(number);
        System.out.println("one.getReal() = " + one.getReal());
        System.out.println("one.getImaginary() = " + one.getImaginary());

        number.subtract(one);
        System.out.println("number.getReal() = " + number.getReal());
        System.out.println("number.getImaginary() = " + number.getImaginary());
    }


}
