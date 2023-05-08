package PasswordVerify;

public class PasswordResult {
    private boolean isValid;
    private String msjError;

    public PasswordResult(boolean isValid, String errorMessage) {
        this.isValid = isValid;
        this.msjError = errorMessage;
    }

    public boolean isValid() {
        return isValid;
    }

    public String getErrorMessage() {
        return msjError;
    }
}
