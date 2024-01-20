public class Quiz {
    public static void main(String[] args){
        System.out.println(appendAll(args));
    }
    public static String appendAll(String[] args){
        StringBuffer a = new StringBuffer();
        for(String i : args){
            a.append(i).append(";");
        }
        String result = a.toString();
        return result;
    }
}
