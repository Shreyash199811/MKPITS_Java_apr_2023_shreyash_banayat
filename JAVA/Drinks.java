//Drinks in a shop
class Drinks{
	float price;
	String taste;
	int quantity;
	}

class SoftDrink extends Drinks{
	String flavour;
	String color;
	String type;
	}
	
class CaffeinatedBeverage extends Drinks{
	float temp;
	List<Type> type;
	String serve;
}

class HardDrinks extends Drinks{
	int noOfIce;
	List<DrinkType> type;
	String serve;
}