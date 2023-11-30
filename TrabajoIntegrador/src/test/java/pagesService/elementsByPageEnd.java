package pagesService;

import org.openqa.selenium.By;

public class elementsByPageEnd {
    //en la pagina final del detalle de la compra busco los elementos necesarios
    //para confirmar que he llegado a la misma y realizar las aserciones solicitadas
    private final By btn_createAnAccount= By.cssSelector(".action.primary[data-bind='attr: { href: getUrl() }']");
    private final By title= By.cssSelector(".base");
    private final By btn_continueShopping = By.cssSelector(".action.primary.continue");
    private final By numberOrder= By.cssSelector("div[class='checkout-success'] p span");

    public By getBtn_createAnAccount() {
        return btn_createAnAccount;
    }

    public By getTitle() {
        return title;
    }

    public By getBtn_continueShopping() {
        return btn_continueShopping;
    }

    public By getNumberOrder() {
        return numberOrder;
    }

}
