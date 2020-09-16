package com.sophossolutions.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.wong.pe/")
public class PaGE extends PageObject{

	public static final Target A = Target.the("").locatedBy("id:onesignal-popover-cancel-button");
	public static final Target B = Target.the("").locatedBy("");
	public static final Target C = Target.the("").locatedBy("");
	public static final Target D = Target.the("").located(By.id("search-input"));
	public static final Target E = Target.the("").located(By.xpath("//a[contains(text(), '%s')]"));
	
}
