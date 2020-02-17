package mrsnickalo.capstone.dao;

import java.util.List;
import mrsnickalo.capstone.entity.Role;

/**
 *
 * @author Lindsay Gen10
 * @date Feb 14, 2020
 */

public interface RoleDao 
{
    Role findById(int id);
    Role addRole(Role role);
    List<Role> findAll();
    void updateRole(Role role);
    void deleteRole(int id);
}
