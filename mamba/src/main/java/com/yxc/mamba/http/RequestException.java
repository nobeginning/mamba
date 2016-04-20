package com.yxc.mamba.http;

/**
 * RequestException
 * Created by robin on 15/12/4.
 *
 * @author yangxc
 */
public class RequestException extends Exception {

    private int errorCode;

    private String errorMessage;

    public RequestException() {
        super();
    }

    public RequestException(int errorCode, String errorMessage) {
        super();
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    @Override
    public String getMessage() {
        return errorMessage == null ? "The exception message is ** null **" : errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    @Override
    public String toString() {
        return "Error Code : " + getErrorCode() + " ; " + "Error Message : " + getMessage();
    }
}
