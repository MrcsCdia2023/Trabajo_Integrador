package pagesService;

import org.openqa.selenium.By;
import trabajointegrador.DriverActions;

public class elementsByPage5 {
    //en esta pagina de placeholder busco los elementos que me van a permitir
    //que una vez seleccionados pueda terminar el proceso de compra
    //y sumo una manera de dejar cliqueado el selector CheckBilling
    private By btn_placeHolder = By.cssSelector("button[title='Place Order']");
    private By checkBilling= By.cssSelector("#billing-address-same-as-shipping-checkmo");
    public By getBtn_placeHolder() {
        return btn_placeHolder;
    }

    public By getCheckBilling() {
        return checkBilling;
    }
    public void checkBillingStatus(){
        Boolean active= DriverActions.isSelected(this.getCheckBilling());
        if (active==false) {
            DriverActions.click(this.getCheckBilling());
        }
    }
}
