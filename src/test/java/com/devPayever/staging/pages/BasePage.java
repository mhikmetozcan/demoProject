package com.devPayever.staging.pages;

import com.devPayever.staging.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    /**
     * initializing the page object for locating the web elements of the web page (POM design pattern)
     */

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
