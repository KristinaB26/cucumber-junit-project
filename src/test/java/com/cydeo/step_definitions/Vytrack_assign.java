package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Vytrack_assign {
    @Given("user is on the Vytrack login page")
    public void user_is_on_the_vytrack_login_page() {
        Driver.getDriver().get("https://qa2.vytrack.com/user/login");
        Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput']")).sendKeys("user19");
        Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys("UserUser123");
        Driver.getDriver().findElement(By.xpath("//button[@type='submit']")).click();

    }

    @When("User navigates to CarEntitles page")
    public void user_navigates_to_car_entitles_page() throws InterruptedException {
        WebElement fleetModule = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleetModule).perform();
        Thread.sleep(3000);
        Driver.getDriver().findElement(By.xpath("//span[.='Vehicles']")).click();
    }

    @When("clicks Grid Settings button")
    public void clicks_grid_settings_button() {
        Driver.getDriver().findElement(By.xpath("//a[@title='Grid Settings']")).click();
    }

    @Then("dropdown should be displayed with Grid Settings title")
    public void dropdown_should_be_displayed_with_grid_settings_title() {
        WebElement gridDropDown = Driver.getDriver().findElement(By.xpath("//div[.='Grid Settings']"));
        System.out.println("gridDropDown.getText() = " + gridDropDown.getText());

        Driver.getDriver().quit();
    }
}





