package gov.medicaid.features.service_admin.steps;

import cucumber.api.java.en.When;
import gov.medicaid.features.general.steps.GeneralSteps;
import net.thucydides.core.annotations.Steps;

@SuppressWarnings("unused")
public class FunctionsStepDefinitions {
    @Steps
    GeneralSteps generalSteps;

    @Steps
    AdminSteps adminSteps;

    @When("^I am on the Functions Provider Types page$")
    public void i_am_on_the_functions_provider_types_page() {
        generalSteps.clickLinkAssertTitle(".functionsLink", "Provider Types - Functions (Service Admin)");
    }

    @When("^I am on the Functions View Provider Type page$")
    public void i_am_on_the_functions_view_provider_type_page() {
        i_am_on_the_functions_provider_types_page();
        generalSteps.clickLinkAssertTitle(".viewProviderLink", "View Provider Type - Functions (Service Admin)");
    }

    @When("^I am on the Functions Edit Provider Type page$")
    public void i_am_on_the_functions_edit_provider_type_page() {
        i_am_on_the_functions_provider_types_page();
        generalSteps.clickLinkAssertTitle(".editProviderLink", "Edit Provider Type - Functions (Service Admin)");
    }

    @When("^I am on the Functions Screening Schedules page$")
    public void i_am_on_the_functions_screening_schedules_page() {
        i_am_on_the_functions_provider_types_page();
        generalSteps.clickLinkAssertTitle(".screeningSchedulesTab", "Screening Schedules - Functions (Service Admin)");
    }

    @When("^I am on the Functions Edit Screening Schedule page$")
    public void i_am_on_the_functions_edit_screening_schedule_page() {
        i_am_on_the_functions_screening_schedules_page();
        generalSteps.clickLinkAssertTitle(".changeScheduleBtn", "Edit Screening Schedule - Functions (Service Admin)");
    }

    @When("^I am on the Functions Help Topics page$")
    public void i_am_on_the_functions_help_topics_page() {
        i_am_on_the_functions_provider_types_page();
        generalSteps.clickLinkAssertTitle(".helpTopicsTab", "Help Topics - Functions (Service Admin)");
    }

    @When("^I am on the Functions Agreements and Addendums page$")
    public void i_am_on_the_functions_agreements_and_addendums_page() {
        i_am_on_the_functions_provider_types_page();
        generalSteps.clickLinkAssertTitle(".agreementsAddendumsTab", "Agreements & Addendums - Functions (Service Admin)");
    }

    @When("^I am on the Functions Add Agreement Document page$")
    public void i_am_on_the_functions_add_agreement_document_page() {
        i_am_on_the_functions_agreements_and_addendums_page();
        generalSteps.clickLinkAssertTitle(".addAgreementBtn", "Edit Agreement Document - Functions (Service Admin)");
    }

    @When("^I am on the Functions Edit Agreement Document page$")
    public void i_am_on_the_functions_edit_agreement_document_page() {
        i_am_on_the_functions_agreements_and_addendums_page();
        generalSteps.clickLinkAssertTitle(".editAgreementLink", "Edit Agreement Document - Functions (Service Admin)");
    }

    @When("^I am on the Functions View Agreement Document page$")
    public void i_am_on_the_functions_view_agreement_document_page() {
        i_am_on_the_functions_agreements_and_addendums_page();
        generalSteps.clickLinkAssertTitle(".viewAgreementLink", "View Agreement Document - Functions (Service Admin)");
    }
}
