package deposit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.Scanner;


public class Deposit {
    public static WebDriver driver;
    public void login() throws InterruptedException{
        driver.manage().window().maximize();
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
    public void test2(String accno,String amount,String description) throws InterruptedException{
        WebElement cusid = driver.findElement(By.name("accountno"));
        cusid.sendKeys(accno);


        WebElement inideposit = driver.findElement(By.name("ammount"));
        inideposit.sendKeys(amount);

        WebElement description1 = driver.findElement(By.name("desc"));
        description1.sendKeys(description);

        Thread.sleep(2000);
        WebElement button2 = driver.findElement(By.name("AccSubmit"));
        button2.click();

    }
    public void reset(){
        WebElement reset_button = driver.findElement(By.name("reset"));
        reset_button.click();
    }

    public static void main(String[] args){
        try {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            driver = new ChromeDriver();
            //Mo trang web

            driver.get("http://www.demo.guru99.com/V4/");

            System.out.println(driver.getTitle());
            Deposit test = new Deposit();

            System.out.println("Vui long nhap test case ma ban muon chay");
            System.out.println("1: ");
            System.out.println("2: ");
            System.out.println("3: ");
            System.out.println("4: ");
            System.out.println("5: ");
            int number;
                Scanner sc = new Scanner(System.in);
                number = sc.nextInt();
                switch (number) {
                    case 1:
                        driver.get("http://www.demo.guru99.com/V4/manager/DepositInput.php");
                        test.test2("", "", "");
                        break;
                    case 2:
                        driver.get("http://www.demo.guru99.com/V4/manager/DepositInput.php");
                        test.test2("93594", "", "");
                        break;
                    case 3:
                        driver.get("http://www.demo.guru99.com/V4/manager/DepositInput.php");
                        test.test2("93594", "10000", "");
                        break;
                    case 4:
                        test.login();
                        driver.get("http://www.demo.guru99.com/V4/manager/DepositInput.php");
                        test.test2("935ab", "10000", "mota");
                        break;
                    case 5:
                        test.login();
                        driver.get("http://www.demo.guru99.com/V4/manager/DepositInput.php");
                        test.test2("93594", "100ab", "mota");
                        break;
                    case 6:
                        test.login();
                        driver.get("http://www.demo.guru99.com/V4/manager/DepositInput.php");
                        test.test2("93594", "10000", "mota");
                        break;

                }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
