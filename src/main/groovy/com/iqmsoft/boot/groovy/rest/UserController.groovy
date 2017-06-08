package com.iqmsoft.boot.groovy.rest

import com.iqmsoft.boot.groovy.model.User
import com.iqmsoft.boot.groovy.repo.UserRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class UserController {

    UserRepo userRepo

   
    @Autowired
    UserController(UserRepo userRepo) {
        this.userRepo = userRepo

        createMockUser()
    }

  
    def createMockUser() {
        def user = new User(name: "Test1", password: "Test2", 
			email: "test@test.com")
        userRepo.save(user)
    }

    @GetMapping('/users')
    @Transactional(readOnly = true)
    def users() {
		createMockUser()
        return userRepo.findAll()
    }

  
    @PutMapping('/add-user')
    @Transactional
    def addUser(User user) {
        if (user.id != null) user.id = null
        userRepo.save(user)
    }

}
