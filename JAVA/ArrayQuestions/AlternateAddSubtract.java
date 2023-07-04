public class AlternateAddSubtract {
    int[] array={2, 56, 34, 62, 78, 94, 110, 126,                               //declaring an array
            142, 158, 174, 190, 206, 222, 238, 254,
            270, 286, 302, 31, 33, 35, 36, 38, 39,
            41, 43, 46, 462, 7, 9, 10, 526, 542, 58, 574, 22, 23, 24, 25};

    public int addArrayElements() {                                            //declaring method to add array elements
        int finalResult=0;
        for (int counter = 5; counter <=array.length; counter+=5) {            //initializing for loop
            if(counter%2==0){
                finalResult=finalResult-(array[counter-1]*array[counter-1]*array[counter-1]);       //Adding array elements
                System.out.println(array[counter-1]);
                System.out.println(array[counter]);
            } else {
                finalResult=finalResult+(array[counter-1]*array[counter-1]*array[counter-1]);       //Subtracting array elements
                System.out.println(array[counter-1]);
            }
        }
        return finalResult;                                                                         //Return final result
    }
}
