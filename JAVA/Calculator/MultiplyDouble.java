public class MultiplyDouble extends CalculateDouble{
    public double getCalculatedValue(double operand1, double operand2) {
        double result=(operand1 * operand2);
        System.out.println("Multiplication of "+operand1+" and "+operand2+" is "+result);
        return (operand1 * operand2);
    }
}
