package mrsnickalo.capstone.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import mrsnickalo.capstone.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lindsay Gen10
 * @date Feb 14, 2020
 */

@Repository
public class RoleDaoDB implements RoleDao
{
    @Autowired
    JdbcTemplate jdbc;

    @Override
    public Role findById(int id) 
    {
        try
        {
            final String FIND_ROLE = "SELECT roleID, role FROM role WHERE roleID = ?;";
            Role role = jdbc.queryForObject(FIND_ROLE, new RoleMapper(), id);
            return role;
        }
        catch(DataAccessException e)
        {
            return null;
        }
    }

    @Override
    public Role addRole(Role role) 
    {
        final String INSERT_ROLE = "INSERT INTO role (role) VALUES (?);";
        jdbc.update(INSERT_ROLE, role.getRole());
        return findById(role.getId());
    }

    @Override
    public List<Role> findAll() 
    {
        final String FIND_ROLES = "SELECT roleId, rold FROM role;";
        List<Role> roles = jdbc.query(FIND_ROLES, new RoleMapper());
        return roles;
    }

    @Override
    public void updateRole(Role role) 
    {
        final String UPDATE_ROLE = "UPDATE role SET role = ? WHERE roleId = ?;";
        jdbc.update(UPDATE_ROLE, role.getRole(), role.getId());
    }

    @Override
    public void deleteRole(int id) 
    {
        final String DELETE_ROLE = "DELETE FROM role WHERE roleId = ?;";
        jdbc.update(DELETE_ROLE, id);
    }
    
    public static final class RoleMapper implements RowMapper<Role>
    {
        @Override
        public Role mapRow(ResultSet rs, int index) throws SQLException
        {
            Role role = new Role();
            role.setId(rs.getInt("roleId"));
            role.setRole(rs.getString("role"));
            return role;
        }
    }

}
