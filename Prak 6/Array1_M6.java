public class Array1_M6 {
	public static void main(String[] args) {
		String cats[][]= {{"terry","brown"},
		{"kitty","white"},
		{"toby","gray"},};
		try{
			System.out.println("Nama Kucing\tWarna");
			System.out.println(cats[0][0] + "\t\t" + cats[0][1]);
			System.out.println(cats[1][0] + "\t\t" + cats[1][1]);
			System.out.println(cats[2][0] + "\t\t" + cats[2][1]);
			System.out.println(cats[3][0] + "\t\t" + cats[3][1]);
		}
		catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
			System.err.printf("\nException: %s\n", arrayIndexOutOfBoundsException);
			System.out.println("Array anda salah, Masukkan ulang array");
		}
	}
}
