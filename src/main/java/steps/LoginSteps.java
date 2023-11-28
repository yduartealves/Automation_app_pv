package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import page.LoginPage;

import static utils.Utils.driver;

public class LoginSteps {
    LoginPage login = new LoginPage(driver);

    @Dado("^que eu informe usuário e senha$")
    public void que_eu_informe_usuario_e_senha(){
        login.emailLogin();
        login.passwordLogin();
    }

    @Quando("^eu clicar no botão logar$")
    public void eu_clicar_no_botão_logar() throws InterruptedException {
        login.confirmarLogin();
    }

    @Então("^vou visualizar a home do aplicativo$")
    public void vou_visualizar_a_home_do_aplicativo(){

        System.out.println("APLICATIVO LOGADO");
    }



}
