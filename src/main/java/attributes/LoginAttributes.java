package attributes;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebDriver;

public class LoginAttributes {

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]")
    @iOSFindBy(xpath = "32r")
    protected MobileElement campoemail;

    @AndroidFindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]")
    @iOSFindBy(xpath = "fdas")
    protected MobileElement camposenha;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"ACESSAR CONTA\"]")
    @iOSFindBy(xpath = "fdsa")
    protected MobileElement botaologin;


}
