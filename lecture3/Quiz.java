public class Quiz {
    public static void main(String[] args) {
        System.out.println(appendAll(args));
    }

    public static String appendAll(String[] args) {
        String  result = "";
        for(int i = 0;i < args.length; i++ ){
            result += args[i] + ";";
        }
        return result;
    }
    // public static String appenAll(String[] args){
    //     StringBuffer a = new StringBuffer();
    //     for(char s; args){
            
    //     }
    // }
}