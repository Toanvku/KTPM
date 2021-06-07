package newaccount1;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import javax.swing.plaf.TableHeaderUI;
import java.util.Scanner;


public class newAccount1 {
    public static WebDriver driver;
    public void login() throws InterruptedException{
//        WebElement aboutLink = driver.findElement(By.name("uid"));
//        Thread.sleep(1000);
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
    public void addAccount(String uid,String accType,String inidep) throws InterruptedException{
        WebElement cusid = driver.findElement(By.name("cusid"));
        cusid.sendKeys(uid);
        Thread.sleep(1000);
        Select testDropdown = new Select(driver.findElement(By.name("selaccount")));
        testDropdown.selectByValue(accType);
        Thread.sleep(1000);

        WebElement inideposit = driver.findElement(By.name("inideposit"));
        inideposit.sendKeys(inidep);
        Thread.sleep(2000);

        WebElement button2 = driver.findElement(By.name("button2"));
        button2.click();

    }
    public void reset(String uid,String accType,String inidep) throws InterruptedException{

        WebElement cusid = driver.findElement(By.name("cusid"));
        cusid.sendKeys(uid);
        Thread.sleep(1000);

        Select testDropdown = new Select(driver.findElement(By.name("selaccount")));
        testDropdown.selectByValue(accType);
        Thread.sleep(1000);

        WebElement inideposit = driver.findElement(By.name("inideposit"));
        inideposit.sendKeys(inidep);
        Thread.sleep(2000);

        WebElement reset_button = driver.findElement(By.name("reset"));
        reset_button.click();
    }

    public static void main(String[] args){
        try {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        newAccount1 newaccount = new newAccount1();
        System.out.println("Chon test case");
        System.out.println("1: Tat ca cac truong rong");
        System.out.println("2: Mot hoac nhieu truong rong");
        System.out.println("3: Nhap sai dinh dang Customer id");
        System.out.println("4: Nhap sai dinh dang Initial deposit");
        System.out.println("5: Them tai khoan thanh cong");
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
                newaccount.login();
                driver.get("http://www.demo.guru99.com/V4/manager/addAccount.php");
                newaccount.addAccount("","Savings","");
                break;
            case 2:
                driver = new ChromeDriver();
                driver.get("http://www.demo.guru99.com/V4/index.php");
                newaccount.login();
                driver.get("http://www.demo.guru99.com/V4/manager/addAccount.php");
                newaccount.addAccount("","Savings","200000");
                break;
            case 3:
                driver = new ChromeDriver();
                driver.get("http://www.demo.guru99.com/V4/index.php");
                newaccount.login();
                driver.get("http://www.demo.guru99.com/V4/manager/addAccount.php");
                newaccount.addAccount("500ab","Savings","200000");
                break;
            case 4:
                driver = new ChromeDriver();
                driver.get("http://www.demo.guru99.com/V4/index.php");
                newaccount.login();
                driver.get("http://www.demo.guru99.com/V4/manager/addAccount.php");
                newaccount.addAccount("50084","Savings","2000ab");
                break;
            case 5:
                driver = new ChromeDriver();
                driver.get("http://www.demo.guru99.com/V4/index.php");
                newaccount.login();
                driver.get("http://www.demo.guru99.com/V4/manager/addAccount.php");
                newaccount.addAccount("50084","Savings","200000");
                break;
            case 6:
                driver = new ChromeDriver();
                driver.get("http://www.demo.guru99.com/V4/index.php");
                newaccount.login();
                driver.get("http://www.demo.guru99.com/V4/manager/addAccount.php");
                newaccount.reset("50084","Savings","200000");
                break;
            case 7:
                driver = new ChromeDriver();
                driver.get("http://www.demo.guru99.com/V4/index.php");
                newaccount.login();
                driver.get("http://www.demo.guru99.com/V4/manager/addAccount.php");
                newaccount.reset("","Savings","");
                break;
        }



        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


