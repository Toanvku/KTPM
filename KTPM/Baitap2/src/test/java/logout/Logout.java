package logout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class Logout {
    public static WebDriver driver;
    public void login() throws InterruptedException{
        driver = new ChromeDriver();
        //Mo trang web
        driver.get("http://www.demo.guru99.com/V4/index.php");

        //driver.manage().window().maximize();
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
    public void logout() throws InterruptedException{
        driver = new ChromeDriver();
        //Mo trang web
        driver.get("http://www.demo.guru99.com/V4/manager/Managerhomepage.php");

        //driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        WebElement logout = driver.findElement(By.linkText("Log out"));
        logout.click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
    }
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        Logout lo = new Logout();
        try {
            System.out.println("Chon test case");
            System.out.println("1: dang xuat khi chua dang nhap");
            System.out.println("2: dang xuat khi dang nhap thanh cong");
            int number;
            Scanner sc = new Scanner(System.in);
            System.out.print("Moi nhap testcase: ");
            number = sc.nextInt();
                switch (number){
                    case 1:
                        lo.logout();
                        Thread.sleep(3000);
                        break;
                    case 2:
                        lo.login();
                        lo.logout();
                        Thread.sleep(3000);
                        driver.close();
                        break;
                    case 3:
                        System.out.println("Vui long nhap lai");
                        break;
                }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
