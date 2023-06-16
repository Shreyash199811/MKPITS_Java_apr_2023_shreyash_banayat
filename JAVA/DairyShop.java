class DairyShop{
	String itemName;
	float itemPrice;
	int quantity;
	float expiryDate;
}

class MilkProducts extends DairyShop{
	String company;
	String type;
	String quality;
}

class BakedProducts extends DairyShop{
	String type;
	float thickness; 
	float size;
	String ingredient;
}

class OtherProducts extends DairyShop{
	List<ProductName> productName;
	String size; 		// small medium large
	String company;
}
	
	
	
	