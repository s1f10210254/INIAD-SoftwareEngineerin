public class Time {
    int hour;
    int minute;
    int second;

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }


    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
    // public int getHour(){
    //     return hour;
    // }

    // public void setHour(int hour){
    //     this.hour = hour;
    // }
    
    // public int getMinute() {
    //     return minute;
    // }

    // public void setMinute(int minute){
    //     this.minute = minute;
    // }

    // public int getSecond() {
    //     return second;
    // }
    
    // public void setSeccond(int second){
    //     this.second = second;
    // }


    public static String getCurrentTime() {
        java.util.Calendar now = java.util.Calendar.getInstance();
        return now.get(java.util.Calendar.HOUR_OF_DAY) + ":" + now.get(java.util.Calendar.MINUTE) + ":" + now.get(java.util.Calendar.SECOND);
    }
    public static void main(String[] args) {
        // Time time = new Time(18, 00, 45);
        // System.out.println("Time: " + time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());
        System.out.println("Current Time: " + Time.getCurrentTime());
    }


}
