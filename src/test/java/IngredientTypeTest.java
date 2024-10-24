import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.IngredientType;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class IngredientTypeTest {

    private IngredientType type;

    public IngredientTypeTest(IngredientType type) {
        this.type = type;
    }

    @Parameterized.Parameters
    public static IngredientType[] data() {
        return IngredientType.values();
    }

    @Test
    public void testEnumValues() {
        assertNotNull(type);
    }

    @Test
    public void testEnumSpecificValues() {
        assertTrue(type == IngredientType.SAUCE || type == IngredientType.FILLING);
    }
}
