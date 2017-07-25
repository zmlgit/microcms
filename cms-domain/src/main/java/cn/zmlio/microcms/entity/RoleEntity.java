package cn.zmlio.microcms.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_roles")
@Data
public class RoleEntity extends BasicEntity {

    private String roleCode;

    private String roleName;

}
