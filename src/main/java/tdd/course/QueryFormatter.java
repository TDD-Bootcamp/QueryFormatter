package tdd.course;

public class QueryFormatter {
    public static String format(String value) {
        if (value.startsWith("\"") && value.endsWith("\"")) {
            return value;
        }
        return value.toLowerCase()
                .replace("-", "\\-")
                .replace("\\\\", "\\");
    }
}
