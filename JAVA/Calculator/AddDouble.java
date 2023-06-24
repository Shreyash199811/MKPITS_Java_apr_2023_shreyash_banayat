public class AddDouble extends CalculateDouble{
    public double getCalculatedValue(double operand1, double operand2) {
        double result=(operand1 + operand2);
        System.out.println("Addition of "+operand1+" and "+operand2+" is "+result );
        return (operand1 + operand2);
    }

}
