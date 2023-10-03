public class ClassSample {
    public static void main(String[] args) {
        byte[] array = {0x49, 0x4e, 0x49, 0x41, 0x44};
        String str = new String(array);
        System.out.println(str);
   }
}