package com.demoblaze.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Rama2UI {

    public static final Target A_phones= Target.the( "lkn phones" )
            .located( By.xpath("//a[@id='itemc']") );

}
