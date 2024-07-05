import java.util.Scanner;
public class Latihan2 {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	String nama,nim, jurusan;
	int jml;
	float[] uts, uas, rata;
	char[] grade;
	String[] mat = new String[100];

	System.out.println("================================");
	System.out.println("|  MENGHITUNG NILAI MAHASISWA  |");
	System.out.println("================================");
	System.out.print("MASUKKAN JUMLAH MATA KULIAH : ");
	jml = input.nextInt();
	System.out.println("================================");
	System.out.print("NAMA	: ");
	nama = input.next();
	System.out.print("NIM	: ");
	nim = input.next();
	System.out.print("Jurusan : ");
	jurusan = input.next();
	System.out.println("================================");

	//inisialisasi array
	rata = new float[jml];
	grade = new char[jml];
	uts = new float[jml];
	uas = new float[jml];

	for (int i = 0; i<jml; i++){
		System.out.print("Mata Kuliah ke-"+(i+1)+" : ");
		mat[i] = input.next();
		System.out.print("Nilai UTS	: ");
		uts[i] = input.nextFloat();
		System.out.print("Nilai UAS	: ");
		uas[i] = input.nextFloat();

	}
	//rata
	for (int i = 0; i<jml; i++){
		rata[i] = ((uts[i]+uas[i]) / 2);
		if (rata[i]>80){
			grade[i] = 'A';
		}else if (rata[i]>70){
			grade[i] = 'B';
		}else if (rata[i]>60){
			grade[i] = 'C';
		}else{
			grade[i] = 'D';
		}
	}
	System.out.println("================================");
	System.out.println("NAMA : "+nama+" \t NIM : "+nim+"");
	System.out.println("================================");
	System.out.println("Mata Kuliah\tNilai\tGrade");
	System.out.println("================================");
	for (int i=0; i<jml;i++){
		System.out.println(""+mat[i]+"\t\t"+rata[i]+"\t"+grade[i]);
		}
    }
}
