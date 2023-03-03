public class OnlineOrderProcessingFactory {
    public static Order createOrder(OrderEnum orderType) throws  InstantiationException, IllegalAccessException {
        return orderType.getObject();
    }
}