package warehousing;

public class Main {
    public static void main(String[] args) {
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000, 50);
        juice.addToWarehouse(50.0);
        System.out.println(juice);
        System.out.println(juice.history());
        juice.takeFromWarehouse(110);
        System.out.println(juice.history());
        juice.printAnalysis();
    }
}
