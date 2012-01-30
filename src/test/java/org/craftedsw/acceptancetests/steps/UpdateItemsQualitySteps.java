package org.craftedsw.acceptancetests.steps;

import junit.framework.Assert;

import org.jbehave.core.annotations.BeforeStory;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class UpdateItemsQualitySteps {

	@BeforeStory
	public void beforeStoryDo() {
	}
	
	@Given("an item named <name>, with sell in <sellIn> days and quality <quality>")
	public void givenAnItemWithNameSellInAndQualitySetTo(@Named("name") String name, 
			@Named("sellIn") int sellIn, @Named("quality") int quality) {
		
		// Construct your objects or data
		
	}
	
	@When("the quality of the item is updated after one day")
	public void whenTheQualityOfTheItemIsUpdatedAfterOneDay(){
		
		// Invoke your application / method
		
	}
	
	@Then("sell in should be <newSellIn>")
	public void thenSellInShouldBe(@Named("newSellIn") int newSellIn){
		
		Assert.fail("You should have some assert code here");
		
	}
	
	@Then("quality should be <newQuality>")
	public void thenQualityShouldBe(@Named("newQuality") int newQuality){
		
		Assert.fail("You should have some assert code here");
		
	}

}
