package mrsnickalo.capstone.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import javax.transaction.Transactional;
import mrsnickalo.capstone.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lindsay Gen10
 * @date Feb 6, 2020
 */

@Repository
public class CategoryDaoDB implements CategoryDao
{
    @Autowired
    JdbcTemplate jdbc;
    
    @Override
    public Category findById(int id) 
    {
        try
        {
            final String FIND_CATEGORY_ID = "SELECT CategoryID, CategoryName FROM InstrumentCategory WHERE categoryID = ?;";
            Category category = jdbc.queryForObject(FIND_CATEGORY_ID, new CategoryMapper(), id);
            return category;
        }
        catch(DataAccessException e)
        {
            return null;
        }
    }

    @Override
    @Transactional
    public Category addCategory(Category category) 
    {
        // this is disabled for now. To enable, uncomment the code...
//        final String INSERT_CATEGORY = "INSERT INTO instrumentCategory (categoryId, categoryName) VALUES (?,?);";
//        int id = findAll().stream().collect(Collectors.maxBy(Comparator.comparingInt(
//                Category::getCategoryId))).get().getCategoryId();
//        jdbc.update(INSERT_CATEGORY, id, category.getCategory());
//        Category newCategory = findById(id);
//        return newCategory;
        return null;
    }

    @Override
    public List<Category> findAll() 
    {
        final String ALL_CATEGORIES = "SELECT categoryId, categoryName FROM instrumentCategory;";
        List<Category> categories = jdbc.query(ALL_CATEGORIES, new CategoryMapper());
        return categories;
    }

    @Override
    public void updateCategory(Category category) 
    {
        // this is disabled for now. To enable, uncomment the code...
//        final String UPDATE_CATEGORY = "UPDATE instrumentCategory SET categoryName = ? WHERE categoryId = ?;";
//        jdbc.update(UPDATE_CATEGORY, category.getCategory(), category.getCategoryId());
    }

    @Override
    public void deleteCategory(int id) 
    {
        // this is disabled for now. To enable, uncomment the code...
//        final String DELETE_CATEGORY = "DELETE FROM instrumentCategory WHERE categoryId = ?;";
//        jdbc.update(DELETE_CATEGORY, id);
    }

    public static final class CategoryMapper implements RowMapper<Category>
    {
        @Override
        public Category mapRow(ResultSet rs, int i) throws SQLException 
        {
            Category category = new Category();
            category.setCategoryId(rs.getInt("CategoryID"));
            category.setCategory(rs.getString("CategoryName"));
            return category;
        }
        
    }
    
}
