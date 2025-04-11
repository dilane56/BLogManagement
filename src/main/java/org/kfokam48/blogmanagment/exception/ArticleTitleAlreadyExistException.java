package org.kfokam48.blogmanagment.exception;

public class ArticleTitleAlreadyExistException extends RuntimeException {

    public ArticleTitleAlreadyExistException(String message) {
        super(message);
    }
}
