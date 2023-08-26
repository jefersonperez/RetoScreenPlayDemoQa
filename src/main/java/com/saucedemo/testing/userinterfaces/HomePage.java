package com.saucedemo.testing.userinterfaces;


import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;
import java.util.Random;




public class HomePage {

    public static final Target BTN_SEARCH = Target.the("INPUT SEARCH").located(By.id("searchBox"));

    public  static  Target BOOK_LIST = Target.the("Book List").located(By.className("mr-2"));
    public static final Target BTN_ADD = Target.the("INPUT ADD").located(By.id("addNewRecordButton"));
    public  static final Target BNT_OK = Target.the("BTN OK").located(By.id("Aceptar"));
    public static final Target BTN_PROFILE = Target.the("BTN PROFILE").located(By.xpath("//span[contains(text(),'Profile')]"));
    public static final Target BTN_DELETE = Target.the("BTN DELETE").located(By.id("delete-record-undefined"));
    public static final Target BTN_DELETE_OK = Target.the("BTN DELETE OK").located(By.id("closeSmallModal-ok"));
    public static final Target TXT_SHARE_BOOK = Target.the("TXT SHARE BOOK").located(By.xpath("//input[@id='searchBox']"));

    public static void selectRandomBookAndSaveName (Actor actor){

        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userName-value")));



        List<WebElementFacade> bookElements = BOOK_LIST.resolveAllFor(actor);
      if(!bookElements.isEmpty()){
          int randomIndex = new Random().nextInt(bookElements.size());
          WebElementFacade selectedBook = bookElements.get(randomIndex);
          String bookname = selectedBook.getText();
          actor.remember("selected book name", bookname);
          selectedBook.click();
      }
    }




}
