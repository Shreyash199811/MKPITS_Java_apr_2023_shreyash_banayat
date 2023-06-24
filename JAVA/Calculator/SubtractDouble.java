public class SubtractDouble extends CalculateDouble{
    public double getCalculatedValue(double operand1, double operand2) {
        double result=(operand1 - operand2);
        System.out.println("Subtracting "+operand2+" from "+operand1+"is "+result );
        return (operand1 - operand2);
    }
}
