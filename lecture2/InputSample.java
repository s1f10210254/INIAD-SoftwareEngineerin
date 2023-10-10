import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputSample {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            while (true) {
                String input = reader.readLine();

                if (input == null || input.isEmpty()) {
                    break;
                }

                buffer.append(input).append("\n");
            }
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }

        System.out.println(buffer.toString());
    }
}
