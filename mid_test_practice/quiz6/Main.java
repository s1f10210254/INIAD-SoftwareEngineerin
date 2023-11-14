package quiz6;

// public class Main {
//     public static void main(String[] args) {
//         Machine m = new Machine("M367", 1000);
//         System.out.println(m.getModel());
//         System.out.println(m.getPrice());
//     }
// }

public class Main {
    public static void main(String[] args) {
        AdvancedMachine m1 = new AdvancedMachine("M367", 1000);
        // AdvancedMachine m2 = new AdvancedMachine("RX231", 2000);
        System.out.println(m1.getModel());
        System.out.println(m1.getPrice());
        System.out.println(AdvancedMachine.getTotalPrice());
    }
}