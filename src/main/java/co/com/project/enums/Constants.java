package co.com.project.enums;

public enum Constants {

    BASE_URL("BASE URL", "https://jsonplaceholder.typicode.com/"),
    PATH_GET("PATH GET", "posts/"),
    PATH_POST("PATH POST", "posts/");
    


    private String key;
    private String value;

    Constants(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

}
