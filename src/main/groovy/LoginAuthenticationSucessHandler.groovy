import grails.events.EventPublisher
import grails.plugin.springsecurity.rest.RestAuthenticationSuccessHandler
import grails.plugin.springsecurity.rest.token.AccessToken
import grails.plugin.springsecurity.userdetails.GrailsUser
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.Authentication
import service.injection.error.UserService

import javax.servlet.ServletException
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class LoginAuthenticationSucessHandler extends RestAuthenticationSuccessHandler implements EventPublisher {

//    @Autowired
//    UserService userService

    @Override
    void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        super.onAuthenticationSuccess(request, response, authentication)
        AccessToken accessToken = (AccessToken)authentication
        GrailsUser principal = (GrailsUser)accessToken.principal
//        userService.loginOK(principal?.username)
    }

}
