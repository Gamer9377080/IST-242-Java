public class Krzysztof_IST242_LoopThruTime {
    public static void main(String[] args) {
    int h=0, m=0, s=0;
    int cntr = 0;
    while (h < 24){
        while (m < 60){
            while (s < 60){
                cntr = cntr + 1;
                System.out.printf ("%5d). [%2d:%2d:%2d].\n", cntr, h, m, s);
                s++;
            }
            s = 0;
            m++;
        }
        m = 0;
        h++;
    }
    }
}