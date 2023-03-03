public class Main {
    public static void main(String[] args) {
        Order foodOrder = OnlineOrderProcessingFactory.createOrder(OrderEnum.FOOD);
        foodOrder.processOrder();

        Order clothingOrder = OnlineOrderProcessingFactory.createOrder(OrderEnum.CLOTHING);
        clothingOrder.processOrder();

        Order electronicsOrder = OnlineOrderProcessingFactory.createOrder(OrderEnum.ELECTRONICS);
        electronicsOrder.processOrder();
    }
}