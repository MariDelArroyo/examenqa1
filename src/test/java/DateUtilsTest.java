import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DateUtilsTest {
    @Test
    public void testValidarDateofWeekTh(){
        DateUtils dateUtils = new DateUtils();
        String result = dateUtils.getDayOfWeek("2024-02-29");
        Assertions.assertEquals("THURSDAY", result);
    }
    @Test
    public void testValidarDateofWeekMo(){
        DateUtils dateUtils = new DateUtils();
        String result = dateUtils.getDayOfWeek("2024-01-01");
        Assertions.assertEquals("MONDAY", result);
    }
}




