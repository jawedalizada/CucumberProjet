package steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo_steps {
    @Given("je suis sur ebay page accuil")
    public void method_accuil() {
        System.out.println("e suis sur ebay page accuil");
    }
    @When("je clique sur le lien Recherche avancee")
    public void method_recherche_avancee() {
        System.out.println("je clique sur le lien Recherche avancee");
    }
    @Then("je navigue vers la page recheche avancee")
    public void method_navigation() {
        System.out.println("je navigue vers la page recheche avancee");
    }

}
