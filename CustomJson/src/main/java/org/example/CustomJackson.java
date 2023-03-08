package org.example;




        import lombok.Data;
        import lombok.SneakyThrows;

        import java.lang.reflect.Field;
        import java.util.Arrays;
        import java.util.Map;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

        import static java.util.stream.Collectors.toMap;

public class CustomJackson {
    public static void main(String[] args) {
        var json = "{\n" +
                "  \"firstName\": \"Andrii\",\n" +
                "  \"lastName\": \"Shtramak\",\n" +
                "  \"email\": \"shtramak@gmail.com\"\n" +
                "}";
        var user = jsonToObj(json, User.class);
        System.out.println(user);

    }

    @SneakyThrows
    private static <T> T jsonToObj(String json, Class<T> userClass) {
        var obj = userClass.getConstructor().newInstance();
        var fields = userClass.getDeclaredFields();
        var fieldsValues = parseJsonToMap(json);
        for (Field field : fields) {
            field.setAccessible(true);
            var fieldName = field.getName();
            field.set(obj, fieldsValues.get(fieldName));
        }
        return obj;
    }

    private static Map<String, String> parseJsonToMap(String json) {
        return Arrays.stream(json.replaceAll("[}{\"]", "").split(","))
                .map(String::strip)
                .collect(toMap(
                        pair -> pair.substring(0, pair.indexOf(":")),
                        pair -> pair.substring(pair.indexOf(":") + 1).strip()));
    }

    @Data
    static class User {
        private String firstName;
        private String lastName;
        private String email;

        public User(String firstName, String lastName, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public User() {
        }
    }
}
