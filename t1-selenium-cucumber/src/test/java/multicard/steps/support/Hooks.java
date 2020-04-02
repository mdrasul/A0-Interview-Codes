package multicard.steps.support;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	// Dependency injection
	 MctTestHelper testHelper;
	

	/** Constructor */
	public Hooks(MctTestHelper testHelper ){
	
		this.testHelper=testHelper;
	}
	
	/** Hooks Before & After   */
	@Before
	public void beforeScenarioStart() {
		System.out.println("Scenario Started... ");
		
		// Prepare a Test User James for All test 
		testHelper.getJames().setID("user");
		testHelper.getJames().setPassword("pass");
		testHelper.getJames().setprofileName("JAMES WILLIAMS");
	}
	
	@After
	public void afterScenarioEnd() {
		System.out.println("Scenario Ended... ");
		testHelper.getDriver().close();
	}
	

	
	
}
