package pagesService;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import trabajointegrador.DriverManager;

public class elementsByPage4 {
    //en la pagina de completar datos, busco los elementos para rellenar el formulario de datos
    //asimismo la primera opcion de shhiping como fue requerida, y el boton Next
    private final By email= By.xpath("//div[@class='control _with-tooltip']//input[@id='customer-email']");
    private final By firstname= By.name("firstname");
    private final By lastName= By.name("lastname");
    private final By streetAdress= By.name("street[0]");
    private final By City= By.name("city");
    private final By dropDownState= By.name("region");
    private final By postalCode= By.name("postcode");
    private final By dropDownCountry= By.name("country_id");
    private final By phoneNumber= By.name("telephone");
    private final By primeraOpcionShipping= By.cssSelector("input[value='flatrate_flatrate']");
    private final By btn_next = By.cssSelector("span[data-bind=\"i18n: 'Next'\"]");


    public void selectCountry(){

        Select menuOpcion= new Select(DriverManager.getDriver().findElement(By.name("country_id")));
        menuOpcion.selectByIndex(11);
   }
    public By getEmail() {
        return email;
    }

    public By getFirstname() {
        return firstname;
    }

    public By getLastName() {
        return lastName;
    }

    public By getStreetAdress() {
        return streetAdress;
    }

    public By getCity() {
        return City;
    }

    public By getDropDownState() {
        return dropDownState;
    }

    public By getPostalCode() {
        return postalCode;
    }

    public By getDropDownCountry() {
        return dropDownCountry;
    }

    public By getPhoneNumber() {
        return phoneNumber;
    }

    public By getPrimeraOpcionShipping() {
        return primeraOpcionShipping;
    }

    public By getBtn_next() {
        return btn_next;
    }
}
