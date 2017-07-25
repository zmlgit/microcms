package cn.zmlio.microcms.repository

import cn.zmlio.microcms.domains.Principal;
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest

interface PrincipalRepository {

    fun newPrincipal(): Principal

    fun findPrincipalByUsername(username: String): Principal

    fun findPrincipalByUserId(id: Long): Principal

    fun findPrincipalByRegisterString(uniqueString: String): Principal

    fun findAllPrincipals(pageParam: PageRequest): Page<Principal>

}