public class OnlineOrderProcessingFactory {
    public static Order createOrder(String orderType) {
        if (orderType.equals("Food")) {
            return new FoodOrder();
        } else if (orderType.equals("Clothing")) {
            return new ClothingOrder();
        } else if (orderType.equals("Electronics")) {
            return new ElectronicsOrder();
        } else {
            throw new IllegalArgumentException("Invalid order type: " + orderType);
        }
    }
}