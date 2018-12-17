package service.injection.error

import grails.gorm.services.Service

@Service(User)
abstract class UserRepositoryService {

    abstract User findByUsername(String usermane)
    abstract User save(User user)

}
