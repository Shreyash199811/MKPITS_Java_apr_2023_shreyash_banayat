public class DivideDouble extends CalculateDouble{
    public double getCalculatedValue(double operand1, double operand2) {
        if (operand1 == 0 || operand2 == 0) {
            System.out.println("Operand should not be zero");
        }
        double result=(operand1 / operand2);
        System.out.println(operand1+" divided by "+operand2+" then divisor is "+result);
        return (operand1 / operand2);
    }

}
