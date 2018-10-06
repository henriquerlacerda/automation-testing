package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.sun.jmx.snmp.Timestamp;

public class Utilitarios {
	
	public static WebDriver driver;
	public static String extentReportFile;
	public static String extentReportImage;
	public static ExtentReports extent;
	public static ExtentTest extentTest;
	
	public static void abrirBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\1414950\\Documents\\\\eclipse-workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void abrirPagina (String url) {
		driver.get(url);
	}
	
	public static void fecharBrowser() {
		driver.close();
	}
	
	public static String evidenciaPagina() throws IOException {
		
		Timestamp dados = new Timestamp(System.currentTimeMillis());
		String data = new SimpleDateFormat("dd-MM-yyy_HHmmSSZ").format(dados.getDateTime());
		String arquivo = "C:\\Temp\\" + data +".png";
		File print = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(print, new File(arquivo));
		
		return arquivo;
	}
	
	public static void elaboraReport() throws IOException {
		
		extentReportFile = System.getProperty("user.dir") + "\\report\\Report.html";
		extentReportImage = System.getProperty("user.dir") + "\\extentReportImage.png";
		
		extent = new ExtentReports(extentReportFile,false);
		extentTest = extent.startTest("Site Automação com Batista","Procedimento de teste");
	}
}
