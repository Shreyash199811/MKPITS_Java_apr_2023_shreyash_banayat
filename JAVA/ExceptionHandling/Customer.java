public class Customer {

    public void personAge(int age) throws InvalidAgeException{
        if(age<18 || age>100) {
            throw new InvalidAgeException();
        }
    }
}
