package test;

public class One {
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("Please input numbers.");
        }
        int a = Integer.parseInt(args[0]) *Integer.parseInt(args[0]) * Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]) *Integer.parseInt(args[1]) * Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]) *Integer.parseInt(args[2]) * Integer.parseInt(args[2]);
        int result =a + b + c;
        System.out.println(result);
    }
}
