package test.automation.pages.web;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import test.automation.pageobject.BasePageObject;
import test.automation.properties.ConfigProperties;

@Component("test.automation.pages.web.ProductPage")
public class ProductPage extends BasePageObject {
    @Autowired
    ConfigProperties configProperties;

    public String name = "";
    public String price = "";

    private By productPage() {
        return By.xpath("//a[@data-testid='icnHeaderIcon']");
    }

    private By searchField() {
        return By.xpath("//input[@type='search']");
    }

    private By topRightProduct() {
        return By.xpath("//div[@data-testid='divSRPContentProducts']/div[@class='css-jza1fo'][1]/div[@class='css-12sieg3'][5]");
    }

    private By productsList() {
        return By.xpath("//div[@data-testid='divSRPContentProducts']/div[@class='css-jza1fo'][1]/div[@class='css-12sieg3']");
    }

    private By productName() {
        return By.xpath("//div[@data-testid='divSRPContentProducts']/div[@class='css-jza1fo'][1]/div[@class='css-12sieg3'][5]/descendant::div[@data-testid='spnSRPProdName']");
    }

    private By productPrice() {
        return By.xpath("//div[@data-testid='divSRPContentProducts']/div[@class='css-jza1fo'][1]/div[@class='css-12sieg3'][5]/descendant::div[@data-testid='spnSRPProdPrice']");
    }

    private By productDetailName() {
        return By.xpath("//h1[@data-testid='lblPDPDetailProductName']");
    }

    private By productDetailPrice() {
        return By.xpath("//div[@data-testid='lblPDPDetailProductPrice']");
    }

    public void openPage() {
        goTo(configProperties.getWeb().getBaseUrl());
    }

    public boolean isOnPage() {
        return waitUntilPresence(productPage()).isDisplayed();
    }

    public void inputProduct(String name) {
        onType(searchField(), Keys.ENTER, name);
    }

    public void clickProduct() {
        int elem;
        do {
            elem = waitUntilPresences(productsList()).size();
        }
        while (elem != 10);

        name = waitUntilVisible(productName()).getText();
        price = waitUntilVisible(productPrice()).getText();
        waitUntilVisible(topRightProduct());
        onClick(topRightProduct());
    }

    public String getDetailProductName() {
        return waitUntilPresence(productDetailName()).getText();
    }

    public String getDetailProductPrice() {
        return waitUntilPresence(productDetailPrice()).getText();
    }

    public boolean isProductDetailIsDisplayed() {
        return waitUntilVisible(productDetailName()).isDisplayed() && waitUntilVisible(productDetailPrice()).isDisplayed();
    }
}
