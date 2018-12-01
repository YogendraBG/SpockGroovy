package specs

import spock.lang.Specification
import spock.lang.Unroll


class DataDriverSpec extends Specification {

    def "with params equal"(){
        expect:
        a==b

        where:
        a<<2
        b<<2
    }

    def "with params not equal"(){
        expect:
        a==b

        where:
        a<<3
        b<<2
    }

    @Unroll
    def "with params data driver equal"(){
        expect:
        a==b

        where:
        a | b
        2 | 2
        3 | 3
        4 | 5

    }

    @Unroll
    def "with params data driver equal using #a == #b"(){
        expect:
        a==b

        where:
        a | b
        2 | 2
        3 | 3
        4 | 5

    }


}