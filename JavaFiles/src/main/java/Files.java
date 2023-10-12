import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Files {

	public static void main(String[] args) throws IOException {

		File fileOne=new File("D:\\DEV\\fileData\\file1.txt");
		File fileTwo=new File("D:\\DEV\\fileData\\file2.txt");
		System.out.println(fileOne.createNewFile());
		System.out.println(fileOne.canExecute());
		System.out.println(fileOne.canRead());
	    System.out.println(fileOne.canWrite());
		System.out.println(fileOne.compareTo(fileTwo));
		System.out.println(fileOne.getAbsolutePath());
		System.out.println(fileOne.getFreeSpace());
		System.out.println(fileOne.getName());
	    System.out.println(fileOne.getParent());
		System.out.println(fileOne.getPath());
    	System.out.println(fileOne.isAbsolute());
		System.out.println(fileOne.isDirectory());
		
		System.out.println(fileOne.isFile());
		
		FileReader fr=new FileReader(fileOne);
		FileWriter fw=new FileWriter(fileTwo);
		
		BufferedReader br=new BufferedReader(fr);
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Life is serious joke ::::: ");
		bw.flush();
		
		System.out.println(br.readLine());
		
		
		
		
		
					
		
		

	}

}
