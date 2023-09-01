abstract class Shop {
    String itemName;
    float itemPrice;
    int quantity;
    float expiryDate;

    abstract float totalPurchasePrice(float price);
}
