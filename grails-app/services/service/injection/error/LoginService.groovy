package service.injection.error

import grails.gorm.transactions.Transactional

@Transactional
class LoginService {

    UserService userService

    def loggedOk(String username) {
        userService.loginOK(username)
    }

}
