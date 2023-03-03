public enum OrderEnum {
    FOOD(new FoodOrder()),
    CLOTHING(new ClothingOrder()),
    ELECTRONICS(new ElectronicsOrder());

    private Order className;

    OrderEnum(Order className) {
        this.className = className;
    }
    public Order getObject() {
        return className;
    }
}
