public class Bmi {
    public static void printRisk(int age, double h, double w) {
        double bmi = w / (h/100)*(h/100);
        System.out.println("Your BMI: " + bmi);
        if(bmi < 22){
            if(age < 45){
                System.out.println("Your risk: Low");
            }else if(age >= 45){
                System.out.println("Your risk: Medium");
            }
        }else if( bmi >= 22){
            if(age < 45){
                System.out.println("Your risk: Medium");
            }else if( age >= 45){
                System.out.println("Your risk: High");
            }
        }
        }
    
        public static void main(String[] args) {
            int age = 30;
            double h = 170.0;
            double w = 70.0;
    
            printRisk(age, h, w);
        }
}
