package specs

import spock.lang.Specification
import spock.lang.Shared
class FirstSpec extends Specification{
    def "My Firset Spec"() {
        given:
        def a = []
        when:
        a << "hello"
        // TODO implement when
        then:
        a.contains("hello")
        println(a.contains("hello"))
        // TODO implement then
    }
}
