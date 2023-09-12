public class Main {
    public static void main(String[] args) {
    Runnable runnableOne=new Runnable() {
        @Override
        public void run() {
            System.out.print("Even numbers=");
            for(int iterator=1;iterator<=100;iterator++){
                if(iterator%2==0)
                    System.out.print(iterator+"\t");
            }
            System.out.println();
        }
    };

    Runnable runnableTwo=new Runnable(){
        @Override
                public void run(){
            System.out.print("Odd numbers=");
                for(int iterator=1;iterator<=100;iterator++){
                    if(iterator%2==1)
                        System.out.print(iterator+"\t");
                }
                System.out.println();
            }
        };

    runnableOne.run();
    runnableTwo.run();

        System.out.println("lambda Function");
    Runnable runnable1=()->{
        System.out.print("Even numbers=");
        for(int iterator=1;iterator<=100;iterator++){
            if(iterator%2==0)
                System.out.print(iterator+"\t");
        }
        System.out.println();
    };
    runnable1.run();

    Runnable runnable2=()->{
        System.out.print("Odd numbers=");
        for(int iterator=1;iterator<=100;iterator++){
            if(iterator%2==1)
                System.out.print(iterator+"\t");
        }
        System.out.println();
    };
    runnable2.run();
    }

}