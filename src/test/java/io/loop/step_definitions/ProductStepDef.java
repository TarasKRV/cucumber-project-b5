package io.loop.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.loop.pages.POM;
import io.loop.utilities.ConfigurationReader;
import io.loop.utilities.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class ProductStepDef {

    POM pages = new POM();
    private static final Logger LOG = LogManager.getLogger();

    @Given("User is on the HomePage")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties("product.url"));
        LOG.info("User on home page");
    }
    @Then("User should be able to see expected prices in the following products")
    public void user_should_be_able_to_see_expected_prices_in_the_following_products(List<Map<String, String>> productDetails) {
        for (Map<String, String> productDetail : productDetails) {
//            System.out.println("=============Product Details=============");
//            System.out.println(productDetail.get("Category"));
//            System.out.println(productDetail.get("Product"));
//            System.out.println(productDetail.get("expectedPrice"));

            pages.getProductPage().clickCategory(productDetail.get("Category"));
            String actualPrice = pages.getProductPage().getProductPrice(productDetail.get("Product"));
            String expectedPrice = productDetail.get("expectedPrice");
            assertEquals("Expected price not match" + expectedPrice, actualPrice, expectedPrice);
            LOG.info("Validation of the price for " + productDetail.get("Category")+ ", for " + productDetail.get("Product") + " expected price is " + expectedPrice+ " - actual price is " + actualPrice);

        }

    }

}
