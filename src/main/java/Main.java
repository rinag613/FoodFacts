public class Main {
    public static void main(String[] args) {
        FoodComponent foodComponent = DaggerFoodComponent
                .builder()
                .build();
        FoodFrame frame = foodComponent.providesFoodFrame();
        frame.setVisible(true);
    }
}
