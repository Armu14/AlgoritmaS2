public class Bentuk6e {
    public static void main(String[] args) {
        int x = 5;
        int i = 2 * 1 - 1;
        do {
            int j = 4;
            do {
                System.out.print('*');
                j--;
            } while (j >= i);
            int k = 1;
            do {
                System.out.print('k');
                k++;
            } while (k <= i );
            int l = 1;
            do {
                System.out.print('i');
                l++;
            } while (l <= i - 1);
            System.out.println();
            i++;
        } while (i <= x);
    }
}
