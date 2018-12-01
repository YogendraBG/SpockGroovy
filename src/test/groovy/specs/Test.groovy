package specs

import spock.lang.Specification
import pages.GooglePage


class Test extends Specification {

    def "hi"() {

        given: "user navigates to google page"
        to GooglePage
        println("I am at Given")
        when: "when user enter search term and clicks on google page"
        GooglePage.searchFor("hello")
        at GooglePage
        println("I am at When")

        then: "search resutls will be displayed"
        println("I am at then")

    }
}