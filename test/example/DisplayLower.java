import java.util.Scanner;

public class DisplayLower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer input = new StringBuffer();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            input.append(line).append("\n");
            if(line.isBlank()){
                break;
            }
        }

        String result = input.toString();
        result.toLowerCase();
        System.out.println(result);
        scanner.close();
    }
}