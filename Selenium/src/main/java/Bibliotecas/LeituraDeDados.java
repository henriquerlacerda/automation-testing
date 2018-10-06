package Bibliotecas;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LeituraDeDados {
	
	private static XSSFSheet ExcelSheet;
	private static XSSFWorkbook ExcelBook;
	//private static XSSFRow Linha;
	private static XSSFCell Coluna;
	
	public static void setArquivo(String Caminho, String Aba){
		System.out.println("Caminho do arquivo de Excel: " + Caminho);
		try {
			FileInputStream Arquivo = new FileInputStream(Caminho);
			
			ExcelBook = new XSSFWorkbook(Arquivo);
			ExcelSheet = ExcelBook.getSheet(Aba);
			System.out.println("Aba " + Aba +" adicionada com sucesso");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static String getValorCelula(int linha, int coluna){
		try {
			Coluna = ExcelSheet.getRow(linha).getCell(coluna);
			String Valor = Coluna.getStringCellValue();
			System.out.println(ExcelSheet.getRow(0).getCell(coluna).getStringCellValue() + " = " + Valor);
			return Valor;
		}
		catch(Exception e) {
			return "";
		}
	}
	
	public static int getNumeroColuna(String nomeColuna) {
		
		int iLimite = 1000;
		int iNumeroColuna = 0;
		
		for(int i = 0; i<iLimite; i++) {
			if (ExcelSheet.getRow(0).getCell(i).getStringCellValue().equalsIgnoreCase(nomeColuna)) {
				iNumeroColuna = i;
				break;
			}
		}
		return iNumeroColuna;
	}
}

