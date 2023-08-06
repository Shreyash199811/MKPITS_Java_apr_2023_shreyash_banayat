public class ArrayOperations {
    int[] arr={121,12,113,4,35};
    int[] num={12,22,34,56,47,82,66,49,70};

    int[] numArray={12,22,34,47,56,66,70};

    public void addArrayElements(){
        int sum=0;
        for(int counter=0;counter<arr.length;counter++)
        {
          sum=sum+arr[counter];
        }
        System.out.println("The addition of array elements is "+sum);
    }

    public void oddEvenElements(){
        for(int counter=0;counter<arr.length;counter++){
            if(arr[counter] % 2==0){
                System.out.println(arr[counter]+" is even");
            }else{
                System.out.println(arr[counter]+" is odd");
            }
        }
    }

    public void leftShift(){
        int temp=arr[0];
        for(int counter=1;counter< arr.length;counter++){
            arr[counter-1]=arr[counter];
        }
        arr[arr.length-1]=temp;
        System.out.print("New array=");
        for(int counter=0;counter<arr.length;counter++) {
            System.out.print(arr[counter]+" ");
        }
    }

    public void selectionSort(){
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                   int temp=arr[j];
                   arr[j]=arr[i];
                   arr[i]=temp;
                }
            }
        }
        System.out.print("the Sorted array is =");
        for(int counter=0;counter<arr.length;counter++) {
            System.out.print(arr[counter]+" ");
        }
    }

    public void bubbleSort(){
        for(int counter=0;counter< arr.length-1;counter++){
            for(int j=0;j< arr.length-1-counter;j++){
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                 }
                }
        }
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void linearSearch(int searchNum) {
        int num[]={12,22,34,56,22,82,66,22,70};
        int flag=0;
        int counter;
        System.out.println("Number Found on indixes ");
        for(counter=0;counter< num.length;counter++){
           if(searchNum==num[counter]){
               flag++;
               System.out.print(counter+",");
           }
        }
        System.out.println("Number appear for "+flag+" times");
            if(counter == num.length) {
                System.out.println("Number not found");
            }
    }

    public void binarySearch(int number){
        int min=0;
        int max=numArray.length-1;
        int mid=(min+max)/2;


        for(min=0;min<=max;min++) {
            if (number == numArray[mid]) {
                System.out.println("number is found on index "+mid);
                break;
            }
            if (numArray[min]==number) {
                System.out.println("number is found on index "+min);
            }else if(number < numArray[mid])
             {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
            if(number >numArray[numArray.length-1]){
                System.out.println("number is not found");
                break;
            }
        }
        System.out.println("");
    }


}
