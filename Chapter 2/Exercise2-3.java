public class Time {
  
  public static void main(String[] args) {
    int hour = 17, minute = 27, seconds = 40;
    
    int secondsSinceMidnight = hour * 3600 + minute * 60 + seconds;
    int totalDailySeconds = 86400;
    int secondsUntilMidnight = totalDailySeconds - secondsSinceMidnight;
    double percentageofDayPassed = (secondsSinceMidnight *100) / totalDailySeconds;
    
    
    System.out.println("The time in seconds since midnight is " + secondsSinceMidnight); 
    System.out.println("The number of seconds remaining in the day is " + secondsUntilMidnight);
    System.out.println("The percentage of the day that has passed is " + percentageofDayPassed + "%"); 
    
  }
}