package pagesService;

import org.openqa.selenium.By;

public class elementsByPage3 {
    //posicionado en la pagina de checkout,busco el elemento necesario para cliquear y continuar la compra
    private final By btn_proceedToCheckOut = By.cssSelector("button[title='Proceed to Checkout'] span");

    public By getBtn_proceedToCheckOut() {
        return btn_proceedToCheckOut;
    }
}
