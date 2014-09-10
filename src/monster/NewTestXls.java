package monster;
//import static org.junit.Assert.*;


import java.io.File;
//import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
//import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
public class NewTestXls {
WebDriver driver;
Workbook wb;


@Before
public void setUp() throws Exception {
driver = new FirefoxDriver();
}

@After
public void tearDown() throws Exception {
}

@Test
public void test() 
throws FileNotFoundException, IOException {

File fp = new File(System.getProperty(("user.dir") + "/src/monster/XlsSheet.xls"));
try
{
driver.get("http://my.monsterindia.com/create_account.html?1407834089");
wb = Workbook.getWorkbook(fp);
Sheet sheet = wb.getSheet(0);
int columns = sheet.getColumns();
int rows = sheet.getRows();
String data;
int col;
for(int row = 1;row < rows;row++)
{

col=0;
List<WebElement> li = driver.findElements(By.className("border_grey"));
if(li.size()==0)
{
Assert.fail("not a container");
}
else{
System.out.println("container is avilable");
}
System.out.println("----------------------------");
//email
List<WebElement> li70 = driver.findElements(By.id("email"));
if(li70.size()==0)
{
Assert.fail("not a container");
}
else{
System.out.println("container is avilable");
}
data = sheet.getCell(col, row).getContents();
System.out.println(data);
System.out.println("*************************");
driver.findElement(By.id("email")).sendKeys(sheet.getCell(col,row).getContents());
col++;
List<WebElement> li89 = driver.findElements(By.name("firstName"));
if(li89.size()==0)
{
Assert.fail("not a container");
}
else{
System.out.println("container is avilable");
}
// first name
data = sheet.getCell(col, row).getContents();
System.out.println(data);
System.out.println("*************************");
driver.findElement(By.name("firstName")).sendKeys(sheet.getCell(col,row).getContents());
col++;
List<WebElement> li87 = driver.findElements(By.name("lastName"));
if(li87.size()==0)
{
Assert.fail("not a container");
}
else{
System.out.println("container is avilable");
}
// last name
data = sheet.getCell(col, row).getContents();
System.out.println(data);
System.out.println("*************************");
driver.findElement(By.name("lastName")).sendKeys(sheet.getCell(col,row).getContents());
col++;
List<WebElement> li86 = driver.findElements(By.name("userName"));
if(li86.size()==0)
{
Assert.fail("not a container");
}
else{
System.out.println("container is avilable");
}
//user name
data = sheet.getCell(col, row).getContents();
System.out.println(data);
System.out.println("*************************");
driver.findElement(By.name("userName")).sendKeys(sheet.getCell(col,row).getContents());
col++;
List<WebElement> li85 = driver.findElements(By.name("passwd"));
if(li85.size()==0)
{
Assert.fail("not a container");
}
else{
System.out.println("container is avilable");
}
//password
data = sheet.getCell(col, row).getContents();
System.out.println(data);
System.out.println("*************************");
driver.findElement(By.name("passwd")).sendKeys(sheet.getCell(col,row).getContents());
col++;
List<WebElement> li84 = driver.findElements(By.name("passwd_temp"));
if(li84.size()==0)
{
Assert.fail("not a container");
}
else{
System.out.println("container is avilable");
}
// verify password
data = sheet.getCell(col, row).getContents();
System.out.println(data);
System.out.println("*************************");
driver.findElement(By.name("passwd_temp")).sendKeys(sheet.getCell(col,row).getContents());
col++;
// nationality
driver.findElement(By.id("nationalityButton")).click();
List<WebElement> li83 = driver.findElements(By.className("selectionMenu"));
if(li83.size()==0)
{
Assert.fail("not a container");
}
else{
System.out.println("container is avilable");
}
List<WebElement> li1 = driver.findElement(By.className("selectionMenu")).findElements(By.tagName("a"));
Random r = new Random();
int k = r.nextInt(li1.size());
li1.get(k).click();
//currnt location
driver.findElement(By.id("currentlocButton")).click();
List<WebElement> li82 = driver.findElements(By.id("currentlocSelectionMenu"));
if(li82.size()==0)
{
Assert.fail("not a container");
}
else{
System.out.println("container is avilable");
}
List<WebElement> li2 = driver.findElement(By.id("currentlocSelectionMenu")).findElements(By.tagName("a"));
Random r1 = new Random();
int k1 = r1.nextInt(li2.size());
li2.get(k1).click();
//mobile number
List<WebElement> li81 = driver.findElements(By.id("mobile2"));
if(li81.size()==0)
{
Assert.fail("not a container");
}
else{
System.out.println("container is avilable");
}
data = sheet.getCell(col, row).getContents();
System.out.println(data);
System.out.println("*************************");
driver.findElement(By.id("mobile2")).sendKeys(sheet.getCell(col,row).getContents());
col++;
//gender
List<WebElement> li80 = driver.findElements(By.id("gender_border"));
if(li80.size()==0)
{
Assert.fail("not a container");
}
else{
System.out.println("container is avilable");
}
List<WebElement> li3 = driver.findElement(By.id("gender_border")).findElements(By.tagName("input"));
Random r2 = new Random();
int k2 = r2.nextInt(li3.size());
li3.get(k2).click();
System.out.println(li3.get(k2).getAttribute("value"));
System.out.println(li3.get(k2).isSelected());
// job type
driver.findElement(By.id("jobTypeButton")).click();
List<WebElement> li79 = driver.findElements(By.id("divjobType"));
if(li79.size()==0)
{
Assert.fail("not a container");
}
else{
System.out.println("container is avilable");
}
List<WebElement> job=driver.findElement(By.id("divjobType")).findElements(By.className("unchecked_small"));
System.out.println(job.size());
if(job.size()==0){
Assert.fail("Job type related elemnts are not loaded into the list");
}
Random r21=new Random();
int x=r21.nextInt(job.size());
job.get(x).click();
// experince
driver.findElement(By.id("exp_in_yearsButton")).click();
List<WebElement> li78 = driver.findElements(By.id("exp_in_yearsSelectionMenu"));
if(li78.size()==0)
{
Assert.fail("not a container");
}
else{
System.out.println("container is avilable");
}
List<WebElement> year =driver.findElement(By.id("exp_in_yearsSelectionMenu")).findElements(By.tagName("a"));
if(year.size()==0){
Assert.fail("years of experiance is not loaded");
}
Random r9 = new Random();
int y=r9.nextInt(year.size());
year.get(y).click();
//experince years
driver.findElement(By.id("exp_in_yearsButton")).click();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
List<WebElement> li77 = driver.findElements(By.id("exp_in_yearsSelectionMenu"));
if(li77.size()==0)
{
Assert.fail("not a container");
}
else{
System.out.println("container is avilable");
}
List<WebElement> li11 = driver.findElement(By.id("exp_in_yearsSelectionMenu")).findElements(By.tagName("div"));
Random r11 = new Random();
int k12 = r11.nextInt(li11.size());
li11.get(k12).click();
driver.findElement(By.id("exp_in_monthsButton")).click();
List<WebElement> li76 = driver.findElements(By.id("exp_in_monthsSelectionMenu"));
if(li76.size()==0)
{
Assert.fail("not a container");
}
else{
System.out.println("container is avilable");
}
List<WebElement> li6 = driver.findElement(By.id("exp_in_monthsSelectionMenu")).findElements(By.tagName("a"));
Random r5 = new Random();
int k5 = r5.nextInt(li6.size());
li6.get(k5).click();
//currnt industry
driver.findElement(By.id("industryButton")).click();
List<WebElement> li75 = driver.findElements(By.id("industrySelectionMenu"));
if(li75.size()==0)
{
Assert.fail("not a container");
}
else{
System.out.println("container is avilable");
}
List<WebElement> li7 = driver.findElement(By.id("industrySelectionMenu")).findElements(By.tagName("div"));
Random r6 = new Random();
int k6 = r6.nextInt(li7.size());
li7.get(k6).click();
//function
/* driver.findElement(By.id("catButton")).click();
Thread.sleep(3000);
List<WebElement> li74 = driver.findElements(By.id("catSelectionMenu"));
if(li74.size()==0)
{
Assert.fail("not a container");
}
else{
System.out.println("container is avilable");
}
List<WebElement> li8 = driver.findElement(By.id("catSelectionMenu")).findElements(By.tagName("td"));
Random r7 = new Random();
int k7 = r7.nextInt(li8.size());
driver.findElement(By.id("catButton")).click();
li8.get(k7).click();*/
/////////////////////////////////////////////////////////////////
// resume title
List<WebElement> li73 = driver.findElements(By.name("resume_title"));
if(li73.size()==0)
{
Assert.fail("not a container");
}
else{
System.out.println("container is avilable");
}
data = sheet.getCell(col, row).getContents();
System.out.println(data);
System.out.println("*************************");
driver.findElement(By.name("resume_title")).sendKeys(sheet.getCell(col,row).getContents());
col++;
// uplod resume
List<WebElement> li72 = driver.findElements(By.id("wordresume"));
if(li72.size()==0)
{
Assert.fail("not a container");
}
else{
System.out.println("container is avilable");
}
// upload resume
data = sheet.getCell(col, row).getContents();
System.out.println(data);
System.out.println("*************************");
driver.findElement(By.id("wordresume")).sendKeys(sheet.getCell(col,row).getContents());
List<WebElement> li71 = driver.findElements(By.id("continue"));
if(li71.size()==0)
{
Assert.fail("not a container");
}
else{
System.out.println("container is avilable");
}
//driver.findElement(By.id("continue")).click();
//driver.get("http://my.monsterindia.com/create_account.html?1407834089");
// Your code here
driver.quit();

driver.get("http://my.monsterindia.com/create_account.html?1407834089");
}
//driver.get("http://my.monsterindia.com/create_account.html?1407834089");
}
catch(Exception ioe)
{
System.out.println("Error: " + ioe);
}
}
}
