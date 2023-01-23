import java.util.Scanner;

public class Template {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        while (scanner.hasNext()) {
            s = scanner.nextLine();
            System.out.println(s);
        }
    }
}
