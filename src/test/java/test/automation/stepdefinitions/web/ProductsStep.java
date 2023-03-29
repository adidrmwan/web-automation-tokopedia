package test.automation.stepdefinitions.web;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import test.automation.pages.web.ProductPage;

public class ProductsStep {
    @Autowired
    ProductPage product;

    @Given("user on tokopedia homepage")
    public void userOnTokopediaHomepage() {
        product.openPage();
        Assert.assertTrue(product.isOnPage());
    }

    @When("user search product {string}")
    public void userSearchProduct(String name) {
        product.inputProduct(name);
    }

    @And("user click product on the top right")
    public void userClickProduct() {
        product.clickProduct();
    }

    @Then("user see detail of product")
    public void userSeeDetailOfProduct() {
        Assert.assertTrue(product.isProductDetailIsDisplayed());
        Assert.assertTrue(product.getDetailProductName().contains(product.name));
        Assert.assertEquals(product.getDetailProductPrice(),product.price);
    }
}
