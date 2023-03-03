public class OnlineOrderProcessingFactory {
    public static Order createOrder(OrderEnum orderType) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        return orderType.getObject();
    }
}