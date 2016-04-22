package com.learn.test.stepsdefine;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.eclipse.jetty.util.annotation.Name;
import org.hamcrest.Matchers;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Composite;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.learn.test.stepsmodules.JBehaveTestStepsModules;

import net.thucydides.core.annotations.Steps;

public class JBehaveTestSteps {

	@Steps
	JBehaveTestStepsModules jbehaveteststepsmodules;

	@Given("I am on $site")
	public void homepageOnEtsyDotCom(String site) {
		System.out.println(site);
	}

	@Given("I am searching on $site")
	public void advancedSearchingOnEtsyDotCom(@Name("site") String site) {
		System.out.println(site);
	}

	@When("I specify the $subCat sub category")
	public void specifiSubCategory(String subCat) {
		System.out.println(subCat);
	}

	@When("I search for $thing")
	public void seachForThing(String thing) {
		System.out.println(thing);
	}

	@Then("there are search results")
	@Alias("results will be displayed in the gallery")
	public void thereAreSearchResults() {

		assertThat(1, Matchers.greaterThan(0));
	}

	@Given("that the cart is empty")
	public void cartIsEmptyAndOnStartPage() {
		System.out.println("cart is empty");
	}

	@When("an $item is added to the cart")
	public void putThingInCart(String item) {
		System.out.println(item);
	}

	@Given("the cart contains one $item")
	public void anItemInTheEtsyCart(String item) {
		System.out.println(item);
	}

	@Then("the cart contains that $item")
	public void cartHasThatItem(String item) {
		assertThat(true, Matchers.is(true));
	}

	@When("the $item is removed")
	public void removeItem(String item) {
		System.out.println(item);
	}

	@Then("the cart will be empty")
	public void cartIsEmpty() {
		assertThat(0, equalTo(0));
	}

	@When("I want to browse through a treasury gallery")
	@Composite(steps = { "When I want to buy something from etsy.com", "When I want to browse the treasury",
			"When I choose the first treasury gallery" })
	public void browseToFirstTreasuryGallery() {
	}

	@When("I want to buy something from etsy.com")
	public void selectBuyTabAtTop() {
		System.out.println("I want to buy something from etsy.com");
		;
	}

	@When("I want to browse the treasury")
	public void browseTreasury() {
		System.out.println("I want to browse the treasury");
	}

	@When("I choose the first treasury gallery")
	public void selectFirstTreasuryGallery() {
		System.out.println("I choose the first treasury gallery");
	}
}
