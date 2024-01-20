public class StringSample {
    // public static void main(String[] args) {
    //     String str = "INIAD";
    //     int len = str.length();
    //     String lower = str.toLowerCase();
    //     System.out.println(lower);
    //     String fstr = String.format("Length of %s: %d", str, len);
    //     System.out.println(fstr);
    // }

    //Stringクラス
    // public static void main(String[] args){
    //     String str = "Iniad";
    //     int len = str.length();
    //     String lower = str.toLowerCase();
    //     System.out.println(lower);
    //     String fstr = String.format("Length of %s: %d", str, len);
    //     System.out.println(fstr);
    // }

    //StringBufferクラス
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i< 10; i++){
            sb.append(i);
            sb.append(" ");
        }
        String result = sb.toString();
        System.out.println(result);
    }

}