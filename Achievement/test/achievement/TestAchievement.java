package achievement;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestAchievement {

    @Test
    public void testCreateNewAchievementPoints () {
        Achievement a = new Achievement("Certificado Java");
        String name = a.getName();
        assertEquals("Certificado Java", name);
    }
}