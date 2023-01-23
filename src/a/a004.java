package a;

import java.util.Scanner;

public class a004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        while (scanner.hasNext()) {
            s = scanner.nextLine();
            int year = Integer.parseInt(s);
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
                System.out.println("閏年");
            }else{
                System.out.println("平年");
            }
        }
    }
}
