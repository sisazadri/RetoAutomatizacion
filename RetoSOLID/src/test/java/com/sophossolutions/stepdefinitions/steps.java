package com.sophossolutions.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.equalTo;

import java.util.Map;

import com.sophossolutions.exceptions.ExceptionError;
import com.sophossolutions.tasks.BuyProduct;
import com.sophossolutions.tasks.PostMethod;
import com.sophossolutions.utilities.MsgError;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class steps {

	@Before
	public void prepareStage() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("{word} create a user with the post method in {string}")
	public void createAUserWithThePostMethod() {
		theActorCalled("").whoCan(CallAnApi.at(""));
	}

	@When("Candidate provide information the post method with {string}")
	public void provideInformationThePostMethod(String post, Map<String, String> dataTable) {
		theActorInTheSpotlight().attemptsTo(PostMethod.createUser(post, PostMethod.bodyUser(dataTable)));
	}

			@Then("Candidate verify the creation of this user with the get method")
			public void verifyTheCreationOfThisUserWithTheGetMethod() {
				theActorInTheSpotlight()
						.should(seeThatResponse(response -> response.body("result.first_name", equalTo("Candidate")))
								.orComplainWith(ExceptionError.class, MsgError.MSG_VALUE_ERROR.getMsg()));
			}
			
			@Given("{word} select the {string}")
			public void selectThe(String actorName, String article) {
				theActorCalled(actorName).attemptsTo(BuyProduct.buy());
			}

	@When("Add to shopping cart the {string}")
	public void addToShoppingCartThe(String string) {
		System.out.println(string);
	}

	@Then("Check if the product was added to the cart {string}")
	public void checkIfTheProductWasAddedToTheCart(String string) {
		theActorInTheSpotlight().should(seeThat(BuyProduct.name(), equalTo(string))
				.orComplainWith(ExceptionError.class, MsgError.MSG_VALUE_ERROR.getMsg()));
	}

}
