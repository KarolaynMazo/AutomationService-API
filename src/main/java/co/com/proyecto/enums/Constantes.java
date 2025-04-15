package co.com.proyecto.enums;

public enum Constantes {

    BASE_URL("BASE URL", "https://jsonplaceholder.typicode.com/"),
    PATH_GET("PATH GET", "posts/"),
    PATH_POST("PATH POST", "posts/");
    


    private String key;
    private String value;

    Constantes(String key, String value) {
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
