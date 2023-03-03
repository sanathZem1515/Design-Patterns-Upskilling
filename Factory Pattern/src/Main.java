public class Main {
    public static void main(String[] args) {
        Order foodOrder = OnlineOrderProcessingFactory.createOrder("Food");
        foodOrder.processOrder();

        Order clothingOrder = OnlineOrderProcessingFactory.createOrder("Clothing");
        clothingOrder.processOrder();

        Order electronicsOrder = OnlineOrderProcessingFactory.createOrder("Electronics");
        electronicsOrder.processOrder();
    }
}