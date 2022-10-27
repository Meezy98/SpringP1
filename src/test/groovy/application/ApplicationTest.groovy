package application

import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class ApplicationTest extends Specification {
def "Should work idfk lol"(){
    expect:
    1 + 1 == 2
}
}