public class ArraySample {
    public static int sum(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5};
        int sum = sum(array);
        System.out.println(sum);
    }
}
