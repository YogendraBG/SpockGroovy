package specs

import geb.spock.GebReportingSpec
import pages.GooglePage
import pages.GoogleResultsPage

class GoogleSpec extends GebReportingSpec {
    //GooglePage googlePage
    def setup(){
        driver.manage().window().maximize()
    }

    def "search google page with #searchTerm "() {

        def searchTerm="hello"
        given: "user navigates to google page"
        GooglePage googlePage = to GooglePage
            println("I am at Given")
        when: "when user enter search term and clicks on google page"
        println("I am at When")
        googlePage.searchFor(searchTerm)


        then: "search results will be displayed"
        at GoogleResultsPage
    }
}