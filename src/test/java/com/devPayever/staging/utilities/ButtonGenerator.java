package com.devPayever.staging.utilities;

import com.devPayever.staging.pages.FashionPage;

public class ButtonGenerator {

    FashionPage fashionPage = new FashionPage();

    /**
     * Is used for clicking any button with a single step definition as "click on 'button'"
     * @param buttonName name of the button to be clicked
     */
    public void clickButton(String buttonName){
        setComponent();
        switch (buttonName){
            case "Sign up for free":
                fashionPage.signUp.click();
                break;
        }

    }

    /**
     * Prepares the page object instance
     */
    public void setObject(){

    }

    /**
     * Destroys previous instances of the page objects
     */
    public void resetObject(){

    }

    /**
     * Sets the page objects for the use
     */
    public void setComponent(){
        resetObject();
        setObject();
    }

}
