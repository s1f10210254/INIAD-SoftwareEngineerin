public class Time {
    int hour;
    int minute;
    int second;

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour(){
        return hour;
    }

    public void setHour(int hour){
        this.hour = hour;
    }
    
    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute){
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }
    
    public void setSeccond(int second){
        this.second = second;
    }

    public String getCurrentTime(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public static void main(String[] args) {
        Time time = new Time(18, 00, 45);
        System.out.println(time.getCurrentTime());
    }


}
