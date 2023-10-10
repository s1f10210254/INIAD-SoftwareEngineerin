public class TestTime {
    public static void main(String[] args){
        Time specifiedTime = new Time(16, 7, 30);
        System.out.println("Specified Time: " + specifiedTime.toString());

        // 現在の時間を取得する
        System.out.println("Current Time: " + Time.getCurrentTime());
    }
}
