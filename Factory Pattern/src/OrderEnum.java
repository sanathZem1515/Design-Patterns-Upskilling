public enum OrderEnum {
    FOOD("FoodOrder"),
    CLOTHING("ClothingOrder"),
    ELECTRONICS("ElectronicsOrder");

    private String className;

    OrderEnum(String className) {
        this.className = className;
    }
    public Order getObject() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        return (Order) Class.forName(className).newInstance();
    }
}
