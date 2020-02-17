package mrsnickalo.capstone.dao;

import java.util.List;
import mrsnickalo.capstone.entity.Category;

/**
 *
 * @author Lindsay Gen10
 * @date Feb 6, 2020
 */

public interface CategoryDao 
{
    /**
     * Method to find category by given id.
     * @param id integer identifier of category
     * @return Category with that identifier, null if none found.
     */
    Category findById(int id);
    
    /**
     * Method to add a category to the database
     * In implementation, this method will be disabled.
     * In future use, it could be enabled to allow an admin to add 
     * instruments if JFugue extends its library of such.
     * @param category Category to be added
     * @return Category added, or Category found if already exists
     */
    Category addCategory(Category category);
    
    /**
     * Method to return list of all categories in database.
     * @return List of Categories
     */
    List<Category> findAll();
    
    /**
     * Method to update a category in the database.
     * This method will be disabled.
     * It can be enabled if necessary for admin purposes in the future.
     * @param category to be updated
     */
    void updateCategory(Category category);
    
   /**
     * Method to delete a category in the database.
     * This method will be disabled.
     * It can be enabled if necessary for admin purposes in the future.
     * @param id identifier of category to be deleted
     */ 
    void deleteCategory(int id);
}
