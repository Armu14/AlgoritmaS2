public class Array2_M6 {
	public static void main(String[] args) {
		String cats[][]= {{"terry","brown"},
		{"kitty","white"},{"toby","gray"},
		};
		try{
			System.out.println("Nama Kucing\tWarna");
			for (int i=0;i<cats.length;i++) {
				for (int j=0;j<cats[i].length;j++) {
					System.out.print(cats[i][j]);
					System.out.print("\t\t");
				}
				System.out.println(" ");
			}
		}
		catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
			System.err.printf("\nException: %s\n", arrayIndexOutOfBoundsException);
			System.out.println("Array anda kurang, Cek ulang array");
		}
	}
}
