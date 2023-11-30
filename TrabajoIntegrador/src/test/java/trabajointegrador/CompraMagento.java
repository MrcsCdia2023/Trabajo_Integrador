package trabajointegrador;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pagesService.*;

public class CompraMagento {
   @BeforeMethod
    public void setup(){
        DriverManager.create("chrome");
        DriverManager.goSite("https://magento.softwaretestingboard.com/");
    }
        @Test
       public void actionsForPage(){
         elementsByPage1 element= new elementsByPage1();
            DriverActions.click(element.getLink_radiantTee());
            DriverManager.getWait();
            elementsByPage2 listado= new elementsByPage2();
            DriverActions.click(listado.getBtn_blueColor());
            DriverActions.click(listado.getBtn_sizeL());
            DriverActions.insertText(listado.getInput_cantidad(), "2");
            DriverManager.getWait();
            DriverActions.click(listado.getBtn_AddToCart());
            DriverActions.click(listado.getLink_shoppingCart());
            elementsByPage3 btn_continuar= new elementsByPage3();
            DriverActions.click(btn_continuar.getBtn_proceedToCheckOut());
            elementsByPage4 options= new elementsByPage4();
            DriverActions.insertText(options.getEmail(), "marcosway@gmail.com");
            DriverActions.insertText(options.getFirstname(), "Marcos");
            DriverActions.insertText(options.getLastName(), "Llanos");
            DriverActions.insertText(options.getCity(), "Concordia");
            DriverActions.insertText(options.getPhoneNumber(), "345000000");
            DriverActions.insertText(options.getPostalCode(), "3200");
            DriverActions.insertText(options.getStreetAdress(), "Segundo Sombra 13");
            options.selectCountry();
            DriverActions.insertText(options.getDropDownState(),"Entre Rios");
            DriverActions.insertText(options.getPhoneNumber(),"345000222");
            DriverActions.click(options.getPrimeraOpcionShipping());
            DriverActions.click(options.getBtn_next());
            elementsByPage5 place_holder_actions= new elementsByPage5();
            place_holder_actions.checkBillingStatus();
            DriverActions.click(place_holder_actions.getBtn_placeHolder());
            elementsByPageEnd finish= new elementsByPageEnd();
                DriverActions.isVisible(finish.getBtn_createAnAccount());
                DriverActions.isEnabled(finish.getBtn_createAnAccount());
            //Asercion: el boton continueShopping is enabled
            Assert.assertTrue(DriverActions.isEnabled(finish.getBtn_continueShopping()));
            //Asercion: el boton CreateAccount is enabled
            Assert.assertTrue(DriverActions.isEnabled(finish.getBtn_createAnAccount()));
            //Dos maneras de saber si la busqueda de *title* traducida a texto contiene *Thank you for your purchase!* una por comparacion con string otra por valor true
            Assert.assertEquals(DriverManager.getDriver().findElement(By.xpath("//span[@class='base']")).getText(), "Thank you for your purchase!", "El titulo no es el esperado");
            Assert.assertTrue(DriverManager.getDriver().findElement(By.xpath("//span[@class='base']")).getText().contains("Thank you for your purchase!"),  "El titulo no es el esperado");
            // Consulto el valor true para el resultado booleano de la busqueda de numberOrder con la funcion matches codificada para saber si contiene digitos
            Assert.assertTrue(DriverManager.getDriver().findElement(By.cssSelector("div[class='checkout-success'] p span")).getText().matches("[0-9]*"));
            //busco ver el contenido de la busqueda numberOrder para confirmarme por este metodo visual que es un numero
            System.out.println("Contenido: "+DriverManager.getDriver().findElement(By.cssSelector("div[class='checkout-success'] p span")).getText());

        }


    }


