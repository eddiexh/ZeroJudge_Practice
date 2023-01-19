package a;

import java.util.Scanner;

public class a003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        int M,D,S;
        while (scanner.hasNext()) {
            s = scanner.nextLine();
            String[] n = s.split(" ");
            M = Integer.parseInt(n[0]);
            D = Integer.parseInt(n[1]);
            S = (M*2+D)%3;

            if(S == 0){
                System.out.println("普通");
            }else if(S == 1){
                System.out.println("吉");
            }else if(S == 2){
                System.out.println("大吉");
            }
        }
    }
}
