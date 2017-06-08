package com.iqmsoft.boot.groovy.model

import groovy.transform.CompileStatic

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id


@Entity
class User {

    @Id
    @GeneratedValue
    Long id
    String name
    String password
    String email
}
