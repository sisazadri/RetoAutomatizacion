package com.sophossolutions.run;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(glue = { "com.sophossolutions.stepdefinitions" }, 
		features = {
        "src/test/resources/com/sophossolutions/features/REST_Service.feature",
		"src/test/resources/com/sophossolutions/features/buy_cart.feature"
        }, 

        snippets = SnippetType.CAMELCASE, 
        monochrome = true
        )

public class rest_service {

}
