import javax.sound.sampled.SourceDataLine;

public class task_2_09_05 {
    public static void main(String[] args) {
        int x = 121;
        int cloneX = x;
        
        boolean flag; 
    //     if (x < 0){
    //         flag = false;
    //     } else {
    //         flag = true;
    //     }
    // System.out.println(flag);
        int reversX = 0;
        int curentRev = 0;
        while (cloneX !=0){
            curentRev = cloneX%10;
            reversX = reversX*10+curentRev;
            cloneX = cloneX/10;
        }
        System.out.println(x);
        System.out.println(reversX);
        if (x == reversX & x > 0){
            System.out.println("полиндром");
        } else {
            System.out.println("не полиндром");
        }
    
    }
    
}
