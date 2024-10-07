import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DateUtilsTest2 {

    @Test
    public void testInvalidDateformat(){
        DateUtils dateUtils = new DateUtils();
        dateUtils.getDayOfWeek("2024/12/25");
        Assertions.assertEquals("Invalid date");
    }
}
