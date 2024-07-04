public class Bentuk6c{
	public static void main(String[] args){
		int a = 5;
		int b = 1;
		do {
			int c = 1;
			do {
				System.out.print('*');
				c++;
			}while ( c <= b);
		System.out.println();
		b++;
		}while (b <= a);
	}
}
