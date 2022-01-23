package utils.uris;

public enum Characters {

    URI_GET_ALL_CHARACTERS("characters"),
    URI_GET_USER_BY_CHARACTER("characters?name=Walter+White");


    private final String uri;

    private Characters(String text) {
        this.uri = text;
    }

    public String getURI() {
        return this.uri;
    }
}


