package mrsnickalo.capstone.dao;

import java.util.List;
import mrsnickalo.capstone.entity.Role;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author Lindsay Gen10
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleDaoDBTest 
{
    @Autowired
    RoleDao roles;
    
    @Autowired
    UserDao users;
    
    
    public RoleDaoDBTest() 
    {
        
    }
    
    @BeforeClass
    public static void setUpClass() 
    {
        
    }
    
    @AfterClass
    public static void tearDownClass() 
    {
        
    }
    
    @Before
    public void setUp() 
    {
        
    }
    
    @After
    public void tearDown() 
    {
        
    }

    /**
     * Test of findById method, of class RoleDaoDB.
     */
    @Test
    public void testFindById() 
    {
        Role role = new Role();
        role.setId(1);
        role.setRole("USER");
        Role fromDao = roles.findById(1);
        assertEquals(role, fromDao);
    }

    /**
     * Test of addRole method, of class RoleDaoDB.
     */
    @Test
    public void testAddRole() 
    {
        Role role = new Role();
        role.setId(3);
        role.setRole("TEST");
        roles.addRole(role);
        Role fromDao = roles.findById(3);
        assertNull(fromDao);
    }

    /**
     * Test of findAll method, of class RoleDaoDB.
     */
    @Test
    public void testFindAll() 
    {
        List<Role> roleList = roles.findAll();
        assertEquals(2, roleList.size());
    }

    /**
     * Test of updateRole method, of class RoleDaoDB.
     */
    @Test
    public void testUpdateRole() 
    {
        Role role = new Role();
        role.setId(2);
        role.setRole("TEST");
        Role fromDao = roles.findById(role.getId());
        assertEquals(role.getId(), fromDao.getId());
        assertNotEquals(role, fromDao);
        roles.updateRole(role);
        fromDao = roles.findById(role.getId());
        assertEquals(role.getId(), fromDao.getId());
        assertNotEquals(role, fromDao);
    }

    /**
     * Test of deleteRole method, of class RoleDaoDB.
     */
    @Test
    public void testDeleteRole() 
    {
        roles.deleteRole(2);
        Role fromDao = roles.findById(2);
        assertNotNull(fromDao);
    }
    
}
