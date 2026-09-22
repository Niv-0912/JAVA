import java.util.Scanner;

class Time {
    private int hours;
    private int minutes;
    private int seconds;

    
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }


    public static Time addTime(Time t1, Time t2) {
     
        int totalSeconds = t1.seconds + t2.seconds;
        int totalMinutes = t1.minutes + t2.minutes;
        int totalHours = t1.hours + t2.hours;

        if (totalSeconds >= 60) {
            totalMinutes = totalMinutes  + 1;
            totalSeconds = totalSeconds-60;
        }

        if (totalMinutes >= 60) {
            totalHours = totalHours  + 1;

            
            totalMinutes = totalMinutes-60;
        }

        return new Time(totalHours, totalMinutes, totalSeconds);
    }
    public void display() {
        System.out.printf("%d:%d:%d\n", hours, minutes, seconds);
    }
}


public class TimeADD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter first time (hours minutes seconds): ");
        int h1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int s1 = scanner.nextInt();
        Time t1 = new Time(h1, m1, s1);

        System.out.println("Enter second time (hours minutes seconds): ");
        int h2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int s2 = scanner.nextInt();
        Time t2 = new Time(h2, m2, s2);

        
        Time result = Time.addTime(t1, t2);
        
       
        System.out.print("Time 1: ");
        t1.display();
        System.out.print("Time 2: ");
        t2.display();
        System.out.print("Result: ");
        result.display();

   
    }
}

