import HashmapMenu.HashMapMethods;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//
//        System.out.println(hashmap.keySet());
//
//        System.out.println(hashmap.values());
//
//        System.out.println("*********************************************");
//        HashMap hashmap2=new HashMap();
//        hashmap2.putAll(hashmap);
//
//        System.out.println(hashmap2);
//        System.out.println("*********************************************");
//
//        hashmap2.replace(103,"Pushpa");
//        System.out.println(hashmap2);
//
//        System.out.println(hashmap2.getOrDefault(105,"Aniket"));

        Scanner scanner=new Scanner(System.in);
        HashMapMethods hashMapMethods=new HashMapMethods();
        int choice=(-1);

      while(true){
          System.out.println("1-Add data\n2-Display All Data\n3-Find in Data\n4-Delete a Data\n" +
                  "5-Replace/Update Data\n6-Delete All Data\n0-Exit");
          System.out.println("Enter your choice=");
          choice=scanner.nextInt();

          switch(choice){
              case 1:
                  System.out.println("Enter city code");
                  int cityCode= scanner.nextInt();
                  System.out.println("Enter the city name");
                  String cityName=scanner.next();
                  hashMapMethods.addNew(cityCode,cityName);
                    break;
              case 2:hashMapMethods.displayAllData();
                    break;
              case 3:
                  System.out.println("Enter city code");
                  cityCode= scanner.nextInt();
                  hashMapMethods.findCity(cityCode);
                    break;
              case 4:
                  System.out.println("Enter city code");
                  cityCode= scanner.nextInt();
                  hashMapMethods.deleteData(cityCode);
                  break;
              case 5:System.out.println("Enter city code");
                  cityCode= scanner.nextInt();
                  System.out.println("Enter the new city name");
                  cityName=scanner.next();
                  hashMapMethods.updateData(scanner.nextInt(), scanner.next());
                    break;
              case 6:hashMapMethods.clearAllData();
                    break;
              case 0:
                  return;
          }
      }

    }
}

//map<integer,String>
//1-add
//2-Display all
//3-find
//4-delete
//5-Replace/update
//6-clear all
//0-Exit

//Presentation on stack