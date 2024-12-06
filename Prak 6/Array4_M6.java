public class Array4_M6 {
    public static void main(String[] args) {
		int[][] matriks = {{12,23,32},{34,56,63},{78,89}};
		int j,k;
		try{
			System.out.println("Matriks Sebelum Transpose ");
			for(j=0;j<3;j++){
				for(k=0;k<3;k++){
					System.out.print(matriks[j][k]+" ");
	    	    }
	    	    System.out.println();
	    	}
	    	System.out.println("\nMatriks Setelah Transpose");
	    	for(j=0;j<3;j++){
				for(k=0;k<3;k++){
					System.out.print(matriks[k][j]+" ");
				}
				System.out.println();
			}
		}
		catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
			System.err.printf("\nException: %s\n", arrayIndexOutOfBoundsException);
			System.out.println("Array Anda Kurang Lengkap, Cek Deklarasi Array");
		}
	}
}
