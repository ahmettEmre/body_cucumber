package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AmazonStepDefinitions {
    AmazonPage amazonPage=new AmazonPage();

    @Given("kullanici amazon anasayfaya gider")
    public void kullanici_amazon_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @Then("amazon arama kutusuna Java yazip aratir")
    public void amazon_arama_kutusuna_java_yazip_aratir() {
        amazonPage.aramaKutusu.sendKeys("Java"+ Keys.ENTER);
    }
    @When("arama sonuclarinin Java icerdigini test eder")
    public void arama_sonuclarinin_java_icerdigini_test_eder() {
        String expectedIcerik = "Java";
        String actualIcerik = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualIcerik.contains(expectedIcerik));
    }
    @When("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @Then("amazon arama kutusuna apple yazip aratir")
    public void amazonAramaKutusunaAppleYazipAratir() {
        amazonPage.aramaKutusu.sendKeys("apple"+ Keys.ENTER);
    }

    @When("arama sonuclarinin apple icerdigini test eder")
    public void aramaSonuclarininAppleIcerdiginiTestEder() {
        String expectedIcerik = "apple";
        String actualIcerik = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualIcerik.contains(expectedIcerik));
    }

    @Then("amazon arama kutusuna Nutella yazip aratir")
    public void amazonAramaKutusunaNutellaYazipAratir() {
        amazonPage.aramaKutusu.sendKeys("nutella"+Keys.ENTER);
    }

    @And("arama sonuclarinin Nutella icerdigini test eder")
    public void aramaSonuclarininNutellaIcerdiginiTestEder() {
        String expected= "nutella";
        String actual= amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actual.contains(expected));
    }

    @Then("amazonda {string} icin arama yapar")
    public void amazondaIcinAramaYapar(String arananKelime) {
        amazonPage.aramaKutusu.sendKeys(arananKelime+Keys.ENTER);
    }

    @And("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String arananKelime) {
        String actual=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actual.contains(arananKelime));
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int bekle) {
        ReusableMethods.bekle(bekle);
    }

    @Given("kullanici {string} anasayfaya gider")
    public void kullaniciAnasayfayaGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("{string} sayfasina gittigini test eder")
    public void sayfasinaGittiginiTestEder(String url) {
        String actualUrl= Driver.getDriver().getCurrentUrl();
        String expectedUrl= ConfigReader.getProperty(url)+"/";
        Assert.assertEquals(actualUrl,expectedUrl);

    }
}
