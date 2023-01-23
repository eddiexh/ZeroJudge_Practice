package a;

import java.util.*;


public class a005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int data = Integer.parseInt(s);
        for(int i = 1;i <= data;i++){
            s = scanner.nextLine();
            String[] str_n = s.split(" ");
            int[] n = new int[5];
            for(int j = 0;j <= 3;j++){
                n[j] = Integer.parseInt(str_n[j]);
            }

            if((n[3] - n[2]) == (n[2] - n[1]) && (n[2] - n[1])== (n[1] - n[0])){
                int d = n[1] - n[0];
                n[4] = n[3] + d;
            }else if((n[3] / n[2]) == (n[2] / n[1]) && (n[2] / n[1])== (n[1] / n[0])){
                float r;
                r = (float)n[1] / n[0];
                n[4] = (int) (n[3] * r);
            }

            System.out.println(n[0] + " " + n[1] + " " + n[2] + " " + n[3] + " " + n[4]);
        }
    }
}
