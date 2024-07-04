public class Bentuk6b{
	public static void main(String[] args){
		int x = 5;
		int i = 1;
		do {i++;
			int j = 4;
			do {j--;
				System.out.print(' ');
			} while ( j >= i);
			int k = 1;
			do {k++;
				System.out.print(k);
			}while (k <= i);
			int l = 1;
			do {l++;
				System.out.print(i);
			}while ( l <= i - 1);
			System.out.println();
		}while (i <= x);
	}
}
