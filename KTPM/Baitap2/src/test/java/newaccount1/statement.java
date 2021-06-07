package newaccount1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class statement {
    public static WebDriver driver;
    public void login() throws InterruptedException{
        System.out.println(driver.getTitle());
        WebElement payers = driver.findElement(By.name("uid"));
        payers.sendKeys("mngr332026");
        Thread.sleep(1000);
        WebElement payees = driver.findElement(By.name("password"));
        payees.sendKeys("musErun");
        Thread.sleep(1000);
        WebElement login_button = driver.findElement(By.name("btnLogin"));
        login_button.click();
        Thread.sleep(2000);
    }
    public void statement(String account,String fdate,String todate,String minimun,String number) throws InterruptedException{
        WebElement accountNo = driver.findElement(By.name("accountno"));
        accountNo.sendKeys(account);
        Thread.sleep(1000);

        WebElement fromdate = driver.findElement(By.name("fdate"));
        fromdate.sendKeys(fdate);
        Thread.sleep(1000);


        WebElement toDate = driver.findElement(By.name("tdate"));
        toDate.sendKeys(todate);
        Thread.sleep(1000);

        WebElement min = driver.findElement(By.name("amountlowerlimit"));
        min.sendKeys(minimun);
        Thread.sleep(1000);

        WebElement num = driver.findElement(By.name("numtransaction"));
        num.sendKeys(number);
        Thread.sleep(1000);

        WebElement button = driver.findElement(By.name("AccSubmit"));
        button.click();
    }
    public void reset(String account,String fdate,String todate,String minimun,String number) throws InterruptedException{
        WebElement accountNo = driver.findElement(By.name("accountno"));
        accountNo.sendKeys(account);
        Thread.sleep(1000);

        WebElement fromdate = driver.findElement(By.name("fdate"));
        fromdate.sendKeys(fdate);
        Thread.sleep(1000);


        WebElement toDate = driver.findElement(By.name("tdate"));
        toDate.sendKeys(todate);
        Thread.sleep(1000);

        WebElement min = driver.findElement(By.name("amountlowerlimit"));
        min.sendKeys(minimun);
        Thread.sleep(1000);

        WebElement num = driver.findElement(By.name("numtransaction"));
        num.sendKeys(number);
        Thread.sleep(1000);

        WebElement reset = driver.findElement(By.name("res"));
        reset.click();
    }
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        statement sta = new statement();
        try {
            System.out.println("Chon test case");
            System.out.println("1: Tat ca cac truong rong");
            System.out.println("2: Mot hoac nhieu truong rong");
            System.out.println("3: So tien lon hon so tien hien tai");
            System.out.println("4: Nhap sai dinh dang Account No");
            System.out.println("5: Rut tien thanh cong");
            System.out.println("6: Reset khi nhap du tat ca cac truong");
            System.out.println("7: Reset khi tat ca cac truong rong");
            int number;
            Scanner sc = new Scanner(System.in);
            System.out.print("Moi nhap testcase: ");
            number = sc.nextInt();
            switch (number){
                case 1:
                    driver = new ChromeDriver();
                    driver.get("http://www.demo.guru99.com/V4/index.php");
                    sta.login();
                    driver.get("http://www.demo.guru99.com/V4/manager/CustomisedStatementInput.php");
                    sta.statement("","","","","");
                    break;
                case 2:
                    driver = new ChromeDriver();
                    driver.get("http://www.demo.guru99.com/V4/index.php");
                    sta.login();
                    driver.get("http://www.demo.guru99.com/V4/manager/CustomisedStatementInput.php");
                    break;
                case 3:
                    driver = new ChromeDriver();
                    driver.get("http://www.demo.guru99.com/V4/index.php");
                    sta.login();
                    driver.get("http://www.demo.guru99.com/V4/manager/CustomisedStatementInput.php");
                    break;
                case 4:
                    driver = new ChromeDriver();
                    driver.get("http://www.demo.guru99.com/V4/index.php");
                    sta.login();
                    driver.get("http://www.demo.guru99.com/V4/manager/CustomisedStatementInput.php");
                    break;
                case 5:
                    driver = new ChromeDriver();
                    driver.get("http://www.demo.guru99.com/V4/index.php");
                    sta.login();
                    driver.get("http://www.demo.guru99.com/V4/manager/CustomisedStatementInput.php");
                    break;
                case 6:
                    driver = new ChromeDriver();
                    driver.get("http://www.demo.guru99.com/V4/index.php");
                    sta.login();
                    driver.get("http://www.demo.guru99.com/V4/manager/CustomisedStatementInput.php");
                    sta.reset("95642","562021","662021","20000","50000");
                    break;
                case 7:
                    driver = new ChromeDriver();
                    driver.get("http://www.demo.guru99.com/V4/index.php");
                    sta.login();
                    driver.get("http://www.demo.guru99.com/V4/manager/CustomisedStatementInput.php");
                    sta.reset("","","","","");
                    break;
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
