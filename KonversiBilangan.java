import java.util.Scanner;
import javax.swing.JOptionPane;
// Nama Dwi Apriyanto 1127050045
// Nama Firman Abdurrahman 1127050061
public class KonversiBilangan {
		static String name; 
			static int bilDes;
		public static void Biner (int n){
			if(n>1){
				Biner(n/2);
			}
				System.out.print(n%2);
		}
			public static void Hexa (int n){
				char[] daftarHexa={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
					if(n>1){
						Hexa(n/16);
					}
							System.out.print(daftarHexa[n%16]);
      
			}
			public static void Oktal (int n){
				char[] daftarOktal={'0','1','2','3','4','5','6','7','8'};
					if(n>1){
						Oktal (n/8);
					}
				System.out.print(daftarOktal[n%8]);
			}
			public static void inputDes(){
					System.out.print("Masukkan bilangan desimal = ");
						Scanner inputan=new Scanner(System.in);
							bilDes=inputan.nextInt();
			}
				public static void tampilBiner(){
					inputDes();
						System.out.print("\nBinernya adalah ");	
							Biner(bilDes);
				}
					public static void tampilHexa(){
						inputDes();
							System.out.print("\nHexanya adalah  ");
								Hexa(bilDes);
					}
		public static void tampilOktal(){
			inputDes();
				System.out.print("\nOktalnya adalah ");
					Oktal(bilDes);
		}
			public static int inpBil(){
						System.out.println("" + "\n================ Selamat datang Pak " + name + " di konversi bilanggan =================\n");
							System.out.println("Silahkan Memilih Menu Konversi Bilangan ke: " + "\n1. Biner  \n2. Hexa \n3. Oktal \n4. Exit");
							System.out.print("\n-------------------------------------");
							System.out.print("\nMasukkan Angka Dari Menu Di Atas = ");
									Scanner inputan=new Scanner (System.in);
						int pilmenu=inputan.nextInt();
					return pilmenu;
			}
  
		public static void menu (int pil){
			System.out.println(" ");
				switch(pil){
					case 1: tampilBiner(); break;
					case 2: tampilHexa() ; break;
					case 3: tampilOktal(); break;
					case 4: System.out.println("Trimakasih");
						System.exit(0); break;
							default:System.out.println("(Maaf. Pilih angka 1-4 saja)" + ""); break;
				}
				System.out.println(" ");
		}
		public static void main(String arg[]){
				name=JOptionPane.showInputDialog("Tuliskan Nama Anda :");
			do
				{
				menu(inpBil());
				}
			while(true);
        }
}