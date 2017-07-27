package cn.zmlio.microcms.repository.dao

import cn.zmlio.microcms.entity.UserEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository interface UserDao : CrudRepository<UserEntity, Long> {
    fun findPrincipalByRegisterString(principal: String)
}