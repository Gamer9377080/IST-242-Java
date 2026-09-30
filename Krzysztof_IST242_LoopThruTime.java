import java.time.LocalTime;
public class Krzysztof_IST242_LoopThruTime {
    public static void main(String[] args) {
    int h=0, m=0, s=0;
    int cntr = 0;
    LocalTime startTime, endTime;
    startTime = LocalTime.now();
    while (h < 24){
        while (m < 60){
            while (s < 60){
                cntr += 1;
                System.out.printf ("%5d). [%2d:%2d:%2d].\n", cntr, h, m, s);
                s++;
            }
            s = 0;
            m++;
        }
        m = 0;
        h++;
    }
    endTime = LocalTime.now();
    System.out.printf("Start time = [%s].\n", startTime);
    System.out.printf("End time = [%s].\n", endTime);
    }
}