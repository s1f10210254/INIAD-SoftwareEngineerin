public class One {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("");
        }else{
            int tmp = 0;
            for(int i = 0; i < args.length; i++){
                if(args[i].length() > tmp){
                    tmp = args[i].length();
                }
            }
            System.out.println(tmp);
        }
        
    }
}