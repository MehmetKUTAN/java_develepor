package file_java;
import java.io.File;
import java.util.Scanner;
public class file_test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		System.out.print("analiz edilecek dosya yaz�n�z=");
		dosya_analiz(input.nextLine());	
	}
	private static void dosya_analiz(String nextLine) {
		// TODO Auto-generated method stub
		File dosya=new File(nextLine);
		if(dosya.exists())
		{
			System.out.print(dosya.getName()+" \n mevcut. \n");
			System.out.print(dosya.isFile()?"normal dosya \n":"normal dosya de�il \n");
			System.out.print(dosya.isDirectory()?"klas�r \n":"klos�r de�il \n");
			System.out.print(dosya.isAbsolute()?"a��k adres \n":"a��k adres  de�il \n");
			System.out.print("a��k adres="+dosya.getAbsolutePath());
			System.out.print(dosya.getParent());
			System.out.println(dosya.length());
			System.out.print(dosya.isHidden());
			if(dosya.isDirectory())
			{
				String dosyalar[]=dosya.list();
				System.out.print("\n Klas�r i�indeki dosyalar \n");
				for(String dosya_isim:dosyalar)
					System.out.print(dosya_isim+"\n");
			}
		}
	}
}