public class ArrayElementAddition extends AcceptArray{

    int array[]={2, 56, 34, 62, 78, 94, 110, 126,           //declaring an array
            142, 158, 174, 190, 206, 222, 238, 254,
            270, 286, 302, 31, 33, 35, 36, 38, 39,
            41, 43, 46, 462, 7, 9, 10, 526, 542,
            58, 574, 22, 23, 24, 25};

    public int addArrayElements() {                         //declaring method to add array elements
        int sum=0;
        for (int counter = 1; counter <=40; counter++) {    //initializing for loop
        if(counter%4==0){
            sum=sum+(array[counter-1]*array[counter-1]);    //adding array elements
            System.out.println(array[counter-1]);           //display array elements
        }
        }
        return sum;                                         //return the sum
    }

}
