import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = Math.abs(n);
        int rem = y%10;
       System.out.println(rem);
    }
}