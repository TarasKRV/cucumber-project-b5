package io.loop.pages;

public class POM {

    private DocuportLoginPage docuportLoginPage;
    private  GoogleSearchPage googleSearchPage;
    private  HomePage  homePage;
    private  ProductPage productPage;



    public DocuportLoginPage getDocuportLoginPage() {
        if (docuportLoginPage == null) {
            docuportLoginPage = new DocuportLoginPage();
        }
        return docuportLoginPage;
    }

    public GoogleSearchPage getGoogleSearchPage() {
        if (googleSearchPage == null) {
            googleSearchPage = new GoogleSearchPage();
        }
        return googleSearchPage;
    }

    public ProductPage getProductPage() {
        if (productPage == null) {
            productPage = new ProductPage();
        }
        return productPage;
    }

    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }
}
