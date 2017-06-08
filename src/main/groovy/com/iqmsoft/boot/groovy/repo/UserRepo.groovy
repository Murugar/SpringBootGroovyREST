package com.iqmsoft.boot.groovy.repo

import com.iqmsoft.boot.groovy.model.User
import org.springframework.data.jpa.repository.JpaRepository


interface UserRepo extends JpaRepository<User, Long> {
}
