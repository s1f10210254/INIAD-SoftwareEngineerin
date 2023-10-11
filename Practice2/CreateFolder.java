import java.io.File;

public class CreateFolder{
    public static void main(String[] args){
        File newfolder = new File("sampe.txt");
        if(newfolder.mkdir()){
            System.out.println("succeded");
        }else{
            System.out.println("Failed");;
        }
    }
}