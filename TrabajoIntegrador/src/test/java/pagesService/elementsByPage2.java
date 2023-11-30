package pagesService;

import org.openqa.selenium.By;

public class elementsByPage2 {
    //posicionado en la pagina Radian Tee busco los elementos que debo utilizar
    //para completar las funciones de seleccion y cantidad
    private final By btn_blueColor = By.id("option-label-color-93-item-50");
    private final By btn_sizeL = By.id("option-label-size-143-item-169");
    private final By input_cantidad =By.id("qty");
    private final By btn_AddToCart = By.cssSelector("#product-addtocart-button");
    private final By link_shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");

    public By getBtn_blueColor() {
        return btn_blueColor;
    }

    public By getBtn_sizeL() {
        return btn_sizeL;
    }

    public By getInput_cantidad() {
        return input_cantidad;
    }

    public By getBtn_AddToCart() {
        return btn_AddToCart;
    }

    public By getLink_shoppingCart() {
        return link_shoppingCart;
    }
}
