public enum OrderEnum {
    FOOD(FoodOrder.class),
    CLOTHING(ClothingOrder.class),
    ELECTRONICS(ElectronicsOrder.class);

    private Class className;

    OrderEnum(Class className) {
        this.className = className;
    }
    public Order getObject() throws InstantiationException, IllegalAccessException {
        return (Order) className.newInstance();
    }
}
