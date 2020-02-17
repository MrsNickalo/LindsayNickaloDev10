package mrsnickalo.capstone.dao;

import mrsnickalo.capstone.entity.Category;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
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
public class CategoryDaoDBTest 
{
    @Autowired
    CategoryDao categories;
    
    public CategoryDaoDBTest() 
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
     * Test of findById method, of class CategoryDaoDB.
     */
    @Test
    public void testFindById() 
    {
        Category category = new Category();
        category.setCategory("PIANO");
        category.setCategoryId(1);
        Category fromDao = categories.findById(1);
        assertEquals(category, fromDao);
    }
    
    /**
     * Test of findById method to return null, of class CategoryDaoDB.
     */
    @Test
    public void testFindByIdFail() 
    {
        Category fromDao = categories.findById(81);
        assertNull(fromDao);
    }
    
    /**
     * Test of addCategory method, of class CategoryDaoDB.
     */
    @Test
    public void testAddCategory() 
    {
        Category category = new Category();
        category.setCategory("TESTING");
        category.setCategoryId(100);
        assertNull(categories.addCategory(category));
    }

    /**
     * Test of findAll method, of class CategoryDaoDB.
     */
    @Test
    public void testFindAll() 
    {
        int size = categories.findAll().size();
        assertEquals(16, size);
    }

    /**
     * Test of updateCategory method, of class CategoryDaoDB.
     */
    @Test
    public void testUpdateCategory() 
    {
        Category category = new Category();
        category.setCategory("TESTING");
        category.setCategoryId(1);
        Category current = categories.findById(category.getCategoryId());
        assertEquals(category.getCategoryId(), current.getCategoryId());
        assertNotEquals(category, current);
        categories.updateCategory(category);
        Category fromDao = categories.findById(category.getCategoryId());
        assertEquals(category.getCategoryId(), fromDao.getCategoryId());
        assertNotEquals(category, fromDao);
    }

    /**
     * Test of deleteCategory method, of class CategoryDaoDB.
     */
    @Test
    public void testDeleteCategory() 
    {
        int size = categories.findAll().size();
        assertEquals(16, size);
        categories.deleteCategory(1);
        size = categories.findAll().size();
        assertEquals(16, size);
    }
    
}
