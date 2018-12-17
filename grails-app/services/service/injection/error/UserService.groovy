package service.injection.error

import grails.gorm.transactions.Transactional
import groovy.transform.CompileStatic

@Transactional
@CompileStatic
class UserService {

    UserRepositoryService userRepositoryService

    void loginOK(String username) {
        User user = userRepositoryService.findByUsername(username)
        user.times++
        userRepositoryService.save(user)
    }
}
