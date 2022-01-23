package utils;

public enum PathResponse {

    CHARACTER_BIRTHDAY("birthday");


    private final String path;

    private PathResponse(String text) {
        this.path = text;
    }

    public String getPath() {
        return this.path;
    }
}
