package tdd.course;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class QueryFormatterTest {
    @Test
    public void should_transform_param_value_to_lowercase() {
        String formatted = QueryFormatter.format("Something");
        assertEquals("something", formatted);
    }

    @Test
    public void should_escape_dash() {
        String formatted = QueryFormatter.format("some-thing");
        assertEquals("some\\-thing", formatted);
    }

    @Test
    public void should_escape_multiple_dashed() {
        String formatted = QueryFormatter.format("some-thing-other");
        assertEquals("some\\-thing\\-other", formatted);
    }

    @Test
    public void should_not_change_escaped_dash() {
        String formatted = QueryFormatter.format("some\\-thing");
        assertEquals("some\\-thing", formatted);
    }
}
