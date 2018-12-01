package pages

import spock.lang.Specification

import geb.spock.GebSpec

class GebHomepageSpec extends GebSpec {

    def "can access The Book of Geb via homepage"() {
        given:
        to GebHomePage

        when:
        manualsMenu.open()
        manualsMenu.links[0].click()

        then:
        at TheBookOfGebPage
    }

}