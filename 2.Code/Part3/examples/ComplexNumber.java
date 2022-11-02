package Part3.examples;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplexNumber add(double real, double imaginary){
        return new ComplexNumber(this.real + real , this.imaginary + imaginary);
    }

    public ComplexNumber add(ComplexNumber c){
        return new ComplexNumber(this.real + c.getReal() , this.imaginary + c.getImaginary());
    }

    public ComplexNumber subtract(double real, double imaginary){
        return new ComplexNumber(this.real -real , this.imaginary - imaginary);
    }

    public ComplexNumber subtract(ComplexNumber c){
        return new ComplexNumber(this.real - c.getReal() , this.imaginary - c.getImaginary());
    }


}


/*
* public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary){
        // return new ComplexNumber(this.real + real , this.imaginary + imaginary);
        this.real += real ; this.imaginary += imaginary;
    }

    public void add(ComplexNumber c){
        // return new ComplexNumber(this.real + c.getReal() , this.imaginary + c.getImaginary());
        this.real += c.getReal() ; this.imaginary += c.getImaginary();
    }

    public void subtract(double real, double imaginary){
        // return new ComplexNumber(this.real -real , this.imaginary - imaginary);
        this.real -= real ; this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber c){
        // return new ComplexNumber(this.real - c.getReal() , this.imaginary - c.getImaginary());
        this.real -= c.getReal() ; this.imaginary -= c.getImaginary();
    }


}
* */
