package a;

import java.util.Scanner;

public class a002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        while (scanner.hasNext()) {
            s = scanner.nextLine();
            String[] n = s.split(" ");
            System.out.println(Integer.parseInt(n[0]) + Integer.parseInt(n[1]));
        }
    }
}
