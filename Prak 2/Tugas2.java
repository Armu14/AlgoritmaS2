public class Tugas2 {
    public static void main(String[] args) {
        int a = 5;
        int i = 1;
        while (i <= a) {
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
        i = a - 1;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
