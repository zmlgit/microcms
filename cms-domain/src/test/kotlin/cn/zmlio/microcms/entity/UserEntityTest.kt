package cn.zmlio.microcms.entity

import org.junit.Before
import org.junit.Test

class UserEntityTest {


    private lateinit var userEntity: UserEntity

    @Before
    fun before() {
        userEntity = UserEntity.builder().email("zml").build()
    }

    @Test
    fun setUsername() {
        println(userEntity)
    }

    @Test
    operator fun component1() {
    }

    @Test
    fun copy() {
    }

    @Test
    fun toStringTest() {
    }

    @Test
    fun hashCodeTest() {
    }

    @Test
    fun equals() {
    }

}

