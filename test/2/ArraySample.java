public class ArraySample {
    //整数の配列の合計を求めるメソッド
    public static int sum(int[] array){
        int sum = 0;
        // for(int i = 0; i<array.length; i++){
        //     sum += array[i];
        // }
        for(int x : array){
            sum += x;
        }
        return sum;
    }
    public static int positive(int[] array1){
        int sum = 0;
        for(int x : array1){
            if (x > 0){
                sum += x;
            }
        }
        return sum;
    }
    public static void printOdd(String[] array2) {
        
        for(int i = 0; array2.length > i; i++){
            if(array2[i].length() % 2 == 1){
                System.out.println(array2[i]);
            }
        }
        
    }
    public static void main(String[] args){
        int[] array1 = {1, -2, 3, 4, -5};
        int result = positive(array1);
        System.out.println(result);

        String[] array2 = {"Information", "Networking", "for", "Innovation", "And", "Design"};
        printOdd(array2);

    }
}
