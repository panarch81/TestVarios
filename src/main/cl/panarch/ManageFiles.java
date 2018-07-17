package main.cl.panarch;

import java.io.*;

public class ManageFiles {
	private File miArchivo = null;
	private File miDir = null;
	
	//pag 453
	public void lectorArchivoNuevo(String name, String miDirectorio){
		miDir = new File(miDirectorio);
		miDir.mkdir();
		
		miArchivo = new File(miDir,name);
		try {
			miArchivo.createNewFile();
			PrintWriter pw1 = new PrintWriter(miArchivo);
			pw1.println("una linea para miArchivo segun ejemplo pag 454");
			pw1.flush();
			pw1.close();
			
			PrintWriter miArchivoPw = new PrintWriter(new File(name+"_Pwriter"));
			miArchivoPw.println("otro archivo");
			miArchivoPw.flush();
			miArchivoPw.close();
			
			System.out.println(miArchivo.toURI());
			System.out.println(miArchivo.toString());
			
			//testing directories
			//another pointer to the existing directory
			File dir = new File(miDirectorio);
			//i dont need create again
			System.out.println("directorio existe?: "+dir.isDirectory());
			File f2 = new File(dir,name);
			System.out.println("archivo existe?: "+f2.isFile());
			
			FileReader fr = new FileReader(f2);
			BufferedReader br = new BufferedReader(fr);
			
			String statement = "";
			
			while((statement = br.readLine()) != null ){ //(LINEA 493)
				System.out.println(statement);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//pag 450 (488)
	public void lectorHightLevel(){
		FileWriter fw;
		try {
			/*fw = new FileWriter(new File("grumpyCat.txt"));
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("grumpy cat es un gatito muy tierno\n");
			bw.write("es muy famoso y ha ido a los Oscar\n");
			bw.close();*/
			
			
			FileReader fr = new FileReader(new File("grumpyCat.txt"));
			BufferedReader br = new BufferedReader(fr);
			
			String statement = "";
			System.out.println("archivo grumpy");
			while((statement = br.readLine()) != null ){ //(LINEA 493)
				System.out.println(statement);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String lectorTheFile(){
		try{
			char[] buffer = new char[50];
			FileReader myReader = new FileReader("archivoDia13Nov2015");
			
			myReader.read(buffer);
			myReader.close();
			
		}
		catch(IOException e){

		}
		return "";
	}

	public void creatorFileFromScratch(String fileName) {
		try{
			byte[] infoBytes = new byte[8];

			infoBytes = new String(fileName).getBytes();

			File file = new File(fileName);
			FileOutputStream fos = new FileOutputStream(file);

			BufferedOutputStream bos = new BufferedOutputStream(fos);
			bos.write(infoBytes);

			infoBytes = new String(file.getAbsolutePath()).getBytes();
			bos.write(infoBytes);

			bos.close();
			fos.close();
		}catch(IOException e){
			System.out.println(e);
		}

	}

	public static void main(String [] args){
		ManageFiles mf = new ManageFiles();
		mf.lectorHightLevel();
		mf.creatorFileFromScratch("1er_dia_noviembre_2017.txt");

		try{
			FileReader fr = new FileReader("1er_dia_noviembre_2017.txt");
			BufferedReader br = new BufferedReader(fr);
			String readedLine = "";
			while((readedLine = br.readLine()) != null){
				System.out.println(readedLine);

			}
			br.close();
			fr.close();
		}catch(FileNotFoundException e){
			System.out.println(e);
		}
		catch (IOException e){
			System.out.println(e);
		}
	}
}
