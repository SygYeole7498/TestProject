package Pack1;

import java.io.IOException;

public class Gmail {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Sairaj Computers\\\\Downloads\\\\software testing\\\\chromedriver_win32\\\\chromedriver.exe\\\\");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.google.com/mail");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("shitalm308@gmail.com");
		driver.findElement(By.xpath("//span[@jsname='V67aGc'][1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shital@123");
		driver.findElement(By.xpath("//input[@type=\'checkbox\']")).click();
		driver.findElement(By.xpath("//span[@jsname=\'V67aGc\']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']")).click();
		String path = "C:\\Users\\Sairaj Computers\\Desktop\\shital.xlsx";
		FileInputStream file = new FileInputStream(path);
		Sheet xyz = WorkbookFactory.create(file).getSheet("Sheet1");
		String data = xyz.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys(data);
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Resume");
		Thread.sleep(2000);

		WebElement shital = driver.findElement(By.xpath("//div[@command='Files']"));
		shital.sendKeys("C:\\Users\\Sairaj Computers\\Desktop\\shital.xlsx");

		/// driver.findElement(By.xpath("//div[@class='dC']")).click();{public static
		/// void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Sairaj Computers\\\\Downloads\\\\software testing\\\\chromedriver_win32\\\\chromedriver.exe\\\\");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.google.com/mail");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("shitalm308@gmail.com");
		driver.findElement(By.xpath("//span[@jsname='V67aGc'][1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shital@123");
		driver.findElement(By.xpath("//input[@type=\'checkbox\']")).click();
		driver.findElement(By.xpath("//span[@jsname=\'V67aGc\']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']")).click();
		String path = "C:\\Users\\Sairaj Computers\\Desktop\\shital.xlsx";
		FileInputStream file = new FileInputStream(path);
		Sheet xyz = WorkbookFactory.create(file).getSheet("Sheet1");
		String data = xyz.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys(data);
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Resume");
		Thread.sleep(2000);

		WebElement shital = driver.findElement(By.xpath("//div[@command='Files']"));
		shital.sendKeys("C:\\Users\\Sairaj Computers\\Desktop\\shital.xlsx");

		/// driver.findElement(By.xpath("//div[@class='dC']")).click();{public static
		/// void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Sairaj Computers\\\\Downloads\\\\software testing\\\\chromedriver_win32\\\\chromedriver.exe\\\\");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.google.com/mail");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("shitalm308@gmail.com");
		driver.findElement(By.xpath("//span[@jsname='V67aGc'][1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shital@123");
		driver.findElement(By.xpath("//input[@type=\'checkbox\']")).click();
		driver.findElement(By.xpath("//span[@jsname=\'V67aGc\']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']")).click();
		String path = "C:\\Users\\Sairaj Computers\\Desktop\\shital.xlsx";
		FileInputStream file = new FileInputStream(path);
		Sheet xyz = WorkbookFactory.create(file).getSheet("Sheet1");
		String data = xyz.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys(data);
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Resume");
		Thread.sleep(2000);

		WebElement shital = driver.findElement(By.xpath("//div[@command='Files']"));
		shital.sendKeys("C:\\Users\\Sairaj Computers\\Desktop\\shital.xlsx");

		/// driver.findElement(By.xpath("//div[@class='dC']")).click();{public static
		/// void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Sairaj Computers\\\\Downloads\\\\software testing\\\\chromedriver_win32\\\\chromedriver.exe\\\\");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.google.com/mail");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("shitalm308@gmail.com");
		driver.findElement(By.xpath("//span[@jsname='V67aGc'][1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shital@123");
		driver.findElement(By.xpath("//input[@type=\'checkbox\']")).click();
		driver.findElement(By.xpath("//span[@jsname=\'V67aGc\']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']")).click();
		String path = "C:\\Users\\Sairaj Computers\\Desktop\\shital.xlsx";
		FileInputStream file = new FileInputStream(path);
		Sheet xyz = WorkbookFactory.create(file).getSheet("Sheet1");
		String data = xyz.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys(data);
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Resume");
		Thread.sleep(2000);

		WebElement shital = driver.findElement(By.xpath("//div[@command='Files']"));
		shital.sendKeys("C:\\Users\\Sairaj Computers\\Desktop\\shital.xlsx");

		/// driver.findElement(By.xpath("//div[@class='dC']")).click();{public static
		/// void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Sairaj Computers\\\\Downloads\\\\software testing\\\\chromedriver_win32\\\\chromedriver.exe\\\\");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.google.com/mail");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("shitalm308@gmail.com");
		driver.findElement(By.xpath("//span[@jsname='V67aGc'][1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shital@123");
		driver.findElement(By.xpath("//input[@type=\'checkbox\']")).click();
		driver.findElement(By.xpath("//span[@jsname=\'V67aGc\']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']")).click();
		String path = "C:\\Users\\Sairaj Computers\\Desktop\\shital.xlsx";
		FileInputStream file = new FileInputStream(path);
		Sheet xyz = WorkbookFactory.create(file).getSheet("Sheet1");
		String data = xyz.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys(data);
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Resume");
		Thread.sleep(2000);

		WebElement shital = driver.findElement(By.xpath("//div[@command='Files']"));
		shital.sendKeys("C:\\Users\\Sairaj Computers\\Desktop\\shital.xlsx");

		/// driver.findElement(By.xpath("//div[@class='dC']")).click();

	}
}
