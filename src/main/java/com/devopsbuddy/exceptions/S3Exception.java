package com.devopsbuddy.exceptions;

/**
 * Created by shaiun on 2/05/17.
 */
public class S3Exception extends RuntimeException {

    public S3Exception(Throwable e) {
        super(e);
    }

    public S3Exception(String s) {
        super(s);
    }
}