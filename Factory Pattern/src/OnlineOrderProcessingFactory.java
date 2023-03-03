public class OnlineOrderProcessingFactory {
    public static Order createOrder(OrderEnum orderType) {
        return orderType.getObject();
    }
}