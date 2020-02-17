package UI;
/**
 *
 * @author Lindsay Gen10
 * @date Dec 12, 2019
 * UserIO Interface
 */
public interface UserIO {
    void print(String msg);
    double readDouble(String prompt);
    double readDouble(String prompt, double min, double max);
    float readFloat(String prompt);
    float readFloat(String prompt, float min, float max);
    int readInt(String prompt);
    int readInt(String prompt, int min, int max);
    long readLong(String prompt);
    long readLong(String prompt, long min, long max);
    String readString(String prompt);
    String readStringEnter(String prompt);
    public String readStreet(String prompt);
}

