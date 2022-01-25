public class Week2Q3
{
    public static void main(String[] args)
    {
        float totalMilliSeconds = System.currentTimeMillis();
        float totalSeconds = totalMilliSeconds/1000;
        float currentSeconds = totalSeconds%60;
        float totalMinutes = totalSeconds/60;
        float currentMinute = totalMinutes%60;
        float totalHours = totalMinutes/60;
        float currentHours = totalHours%24;


        System.out.print("Current time is " + (int)currentHours + ":" + (int)currentMinute + ":" + (int)currentSeconds + "CMT");
    }
}
