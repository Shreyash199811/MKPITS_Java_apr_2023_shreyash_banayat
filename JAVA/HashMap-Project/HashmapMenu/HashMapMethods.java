package HashmapMenu;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapMethods {
    HashMap<Integer,String> citiesInfo=new HashMap();

    public void addNew(Integer cityCode,String cityName){

        citiesInfo.put(cityCode,cityName);
    }

    public void displayAllData(){
        Set set=citiesInfo.entrySet();
        Iterator iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void findCity(Integer cityCode){
        System.out.println(citiesInfo.get(cityCode));
    }

    public void deleteData(Integer cityCode){
        citiesInfo.remove(cityCode);
        System.out.println("Data Deleted");
    }

    public void updateData(Integer cityCode,String newCityName){
        citiesInfo.replace(cityCode,newCityName);
        System.out.println("Map Updated");
    }

    public void clearAllData(){
        citiesInfo.clear();
        System.out.println("All the data is deleted.");
    }

}
