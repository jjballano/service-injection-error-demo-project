package service.injection.error


import grails.testing.mixin.integration.Integration
import grails.transaction.*
import spock.lang.*

@Integration
@Rollback
class LoginServiceSpec extends Specification {

    LoginService loginService

    void "adds one to times"() {
        given:
            new User(username: "anyUser", password: "anyPassword", times: 0).save(flush: true)

        when:
            loginService.loggedOk("anyUser")

        then:
            User.findByUsername("anyUser").times == 1
    }
}
