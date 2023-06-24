public class CalculationService extends CalculateDouble{
    CalculateDouble calculateDouble=new CalculateDouble();
    AddDouble addDouble=new AddDouble();
    SubtractDouble subtractDouble=new SubtractDouble();
    MultiplyDouble multiplyDouble=new MultiplyDouble();
    DivideDouble divideDouble=new DivideDouble();
    public void calculate(String operator,double var1,double var2){

        switch(operator){
            case "+":
                addDouble.getCalculatedValue(var1,var2);
            break;

            case "-": subtractDouble.getCalculatedValue(var1,var2);
            break;

            case "*":multiplyDouble.getCalculatedValue(var1,var2);
            break;

            case "/":divideDouble.getCalculatedValue(var1,var2);
            break;
        }
    }

}
