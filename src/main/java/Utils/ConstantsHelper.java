package Utils;

import java.io.File;

public interface ConstantsHelper {
	
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String username = "Admin";
	String password = "admin123";
	int timeout =10;
	String firefoxDriverPath ="firefoxDriverPath";
	String driverName = "driverName";
	String ExtentReportsPath = "./Reports" +File.separator + "extentReport ";
	String excelPath= "./DataDriven" + File.separator +"data.xlsx";
	

}
