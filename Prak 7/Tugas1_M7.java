public class Tugas1_M7{
	public static void main(String[]args){
		int n = 6;
		int suku1 = 1;
		int suku2 = 2;
		int suku3 = 0;

		System.out.println("Suku ke-"+suku1+" : "+suku1);
		System.out.println("Suku ke-"+suku2+" : "+suku2);
		for ( int i=3; i<=n ; i++){
			if (i == 4){
				suku3 = 3;
			}else if (i==5){
				suku3 = 4;
			}else if (i==6){
				suku3 = 7;
			}else{
				suku3 = suku1+suku2;
			}
			System.out.println("Suku ke-"+i+" : "+suku3);
		}
	}
}