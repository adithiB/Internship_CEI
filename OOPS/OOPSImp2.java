abstract class Table {

    private int numberOfLegs;
    private String material;

    public Table(int numberOfLegs, String material) {
        this.numberOfLegs = numberOfLegs;
        this.material = material;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public String getMaterial() {
        return material;
    }

    public abstract void displayTableDetails();

}

class DiningTable extends Table {

    private int seatingCapacity;

    public DiningTable(int numberOfLegs, String material, int seatingCapacity) {
        super(numberOfLegs, material);
        this.seatingCapacity = seatingCapacity;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void displayTableDetails() {
        System.out.println("Dining Table Details");
        System.out.println("Number of legs: " + getNumberOfLegs());
        System.out.println("Material: " + getMaterial());
        System.out.println("Seating capacity: " + seatingCapacity);
        System.out.println();
    }
}

class WorkingTable extends Table {

    private boolean adjustableHeight;

    public WorkingTable(int numberOfLegs, String material, boolean adjustableHeight) {
        super(numberOfLegs, material);
        this.adjustableHeight = adjustableHeight;
    }

    public boolean isAdjustableHeight() {
        return adjustableHeight;
    }

    public void displayTableDetails() {
        System.out.println("Working Table Details");
        System.out.println("Number of legs: " + getNumberOfLegs());
        System.out.println("Material: " + getMaterial());
        System.out.println("Adjustable height: " + adjustableHeight);
        System.out.println();
    }

}

class IroningTable extends Table {

    private boolean hasIroningBoard;

    public IroningTable(int numberOfLegs, String material, boolean hasIroningBoard) {
        super(numberOfLegs, material);
        this.hasIroningBoard = hasIroningBoard;
    }

    public boolean hasIroningBoard() {
        return hasIroningBoard;
    }

    public void displayTableDetails() {
        System.out.println("Ironing Table Details");
        System.out.println("Number of legs: " + getNumberOfLegs());
        System.out.println("Material: " + getMaterial());
        System.out.println("Has ironing board: " + hasIroningBoard);
        System.out.println();
    }

}

public class OOPSImp2 {
    
    public static void main(String[] args) {
        Table table1 = new DiningTable(4, "Wood", 6);
        Table table2 = new WorkingTable(4, "Metal", true);
        Table table3 = new IroningTable(4, "Plastic", true);

        table1.displayTableDetails();
        table2.displayTableDetails();
        table3.displayTableDetails();
    }
}
