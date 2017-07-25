package cn.zmlio.microcms.repository.impl

import cn.zmlio.microcms.domains.Principal
import cn.zmlio.microcms.repository.PrincipalRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Repository

@Repository
class PrincipalRepositoryImpl : PrincipalRepository {
    override fun newPrincipal(): Principal {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findPrincipalByUsername(username: String): Principal {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findPrincipalByUserId(id: Long): Principal {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findPrincipalByRegisterString(uniqueString: String): Principal {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findAllPrincipals(pageParam: PageRequest): Page<Principal> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}