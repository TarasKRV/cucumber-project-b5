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
            LOG.info("Validation of the price for " + productDetail.get("Category") + ", for " + productDetail.get("Product") + " expected price is " + expectedPrice + " - actual price is " + actualPrice);

        }

    }

    @Then("User should be able to see expected prices in the following products with listOfLists")
    public void user_should_be_able_to_see_expected_prices_in_the_following_products_with_list_of_lists(List<List<String>> productDetails) {
        for (List<String> productDetail : productDetails) {
            pages.getProductPage().clickCategory(productDetail.get(0));
            String actualPrice = pages.getProductPage().getProductPrice(productDetail.get(1));
            String expectedPrice = productDetail.get(2);
            assertEquals("Expected price not match" + expectedPrice, actualPrice, expectedPrice);
            LOG.info("Validation of the price for " + productDetail.get(0) + ", for " + productDetail.get(1) + " expected price is " + expectedPrice + " - actual price is " + actualPrice);
        }

    }

    @Then("user should be able to see the names")
    public void user_should_be_able_to_see_the_names(Map<String, List<String>> student) {

        List<String> group2 = student.get("Group 2");


    }

    @Then("User should be able to see expected prices in the following products with map")
    public void user_should_be_able_to_see_expected_prices_in_the_following_products_with_map(Map<String, List<String>> productsDetails)  {


        for (Map.Entry<String, List<String>> entry : productsDetails.entrySet()) {
            String category = entry.getKey();
            List<String> products = entry.getValue();

            for (String productPrice : products) {

                try {
                    String[] arr1 = productPrice.split("-");
                    String product = arr1[0].trim();
                    String expectedPrice = arr1[1].trim();


                    pages.getProductPage().clickCategory(category);

                    String actualPrice = pages.getProductPage().getProductPrice(product);

                   assertEquals("Expected price not match" + expectedPrice, actualPrice, expectedPrice);
                    LOG.info("Expected price {} -  Actual price {}", expectedPrice, actualPrice);


                } catch (Exception e) {
                }
            }
        }


    }

}
