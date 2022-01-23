package utils;

public enum StatusCode {

    CODE_200  (200);


    private final int status;

    private StatusCode(int status) {
        this.status = status;
    }

    public int  getCode(){
        return this.status;
    }
}
