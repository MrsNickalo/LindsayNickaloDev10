package UI;
/**
 *
 * @author Lindsay Gen10
 * @date Dec 12, 2019
 * UserIO Interface.
 */
public interface UserIO {

    void print(String message);

    int readInt(String prompt);

    int readInt(String prompt, int min, int max);
    
    int readIntFirm(String prompt, int min, int max);

    String readString(String prompt);
}

