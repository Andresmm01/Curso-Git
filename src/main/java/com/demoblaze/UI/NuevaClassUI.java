package com.demoblaze.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NuevaClassUI {
    public static final Target TXT_EMAIL= Target.the( "text input email" )
            .located( By.xpath("//a[@class='carousel-control-next']") );

}
