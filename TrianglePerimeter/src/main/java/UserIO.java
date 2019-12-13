/**
 *
 * @author Lindsay Gen10
 * @date December 10, 2019
 * UserIO Interface as provided in prompt.
 */
public interface UserIO {

    void print(String message);

    double readDouble(String prompt);

    double readDouble(String prompt, double min, double max);

    float readFloat(String prompt);

    float readFloat(String prompt, float min, float max);

    int readInt(String prompt);

    int readInt(String prompt, int min, int max);

    long readLong(String prompt);

    long readLong(String prompt, long min, long max);

    String readString(String prompt);
}
