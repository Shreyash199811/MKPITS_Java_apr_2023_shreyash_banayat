public class Main {
    public static void main(String[] args) {

        CalculationService calculationService=new CalculationService();

        calculationService.calculate("+",34.50,50.50);
        calculationService.calculate("-",34.78789,56.8980);
        calculationService.calculate("*",24.456,56.2432);
        calculationService.calculate("/",7500.7500,25.25);



    }
}