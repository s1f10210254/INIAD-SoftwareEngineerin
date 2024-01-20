public class Bmi {
    public static void printRisk(int age, double h, double w){
        double BMI = w /((h/100)* (h/100));
        String risk = "Your risk: ";
        System.out.println("Your BMI: " + (float)BMI);
        if(BMI < 22){
            if(age < 45){
                System.out.println(risk + "Low");
            }else{
                System.out.println(risk + "Medium");
            }
        }else{
            if(age < 45){
                System.out.println(risk + "Medium");
            }else{
                System.out.println(risk + "High");
            }
        }
    }

    public static void main(String[] args){
        int age = 30;
        double h = 170.0;
        double w = 70.0;

        printRisk(age, h, w);
    }
}
