import java.util.Scanner;

public class InputSample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        StringBuffer input = new StringBuffer();
        while (scanner.hasNextLine()) {
            //ユーザーが入力した1行を取得
            String line = scanner.nextLine();
            input.append(line).append("\n");
            if(line.isEmpty()){
                break;
            }
        }

        //標準入力が終了した後の操作
        String result = input.toString();
        System.out.println(result);
        scanner.close();
    }
}
