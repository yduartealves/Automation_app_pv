package page;

import attributes.LoginAttributes;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import utils.BasePage;
import utils.Utils;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

import static org.junit.Assert.assertTrue;
import static utils.BasePage.setText;
import static utils.Utils.getPropertySettings;

public class LoginPage  extends LoginAttributes {

    LocalDate myObj = LocalDate.now();


    public LoginPage(AppiumDriver<?> driver) {

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);


    }

    /**
     * Metodo a ser chamado pela classe LoginSteps, no qual contem os metodos para
     * preencher email e senha
     */
    public void emailLogin() {

       BasePage.implicitWait(campoemail, 10);
        campoemail.click();
        setText(campoemail, getPropertySettings("PvMobile.data.emailuser"));
        assertTrue(campoemail.isDisplayed());
    }


    /**
     * Metodo a ser chamado pela classe clientSteps, no qual contem o metodo para
     * preencher o Campo Senha
     */
    public void passwordLogin() {

        camposenha.click();
        setText(camposenha, getPropertySettings("PvMobile.data.passworuser"));

        try {
            File imagem = ((TakesScreenshot) Utils.driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(imagem, new File("target/screenshots/1 Login Usuario " + myObj + ".png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * Metodo a ser chamado pela classe clientSteps, no qual contem o metodo para
     * selecionar Cliente
     */
    public void confirmarLogin() throws InterruptedException {
        BasePage.implicitWait(botaologin, 10);
        botaologin.click();
        BasePage.fixedWait(6);

    }

}
