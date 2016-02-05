package me.mingxing5212.chaihens.exception;

/**
 * SOA服务异常
 *
 * @author Mingxing Li
 * @date 4/2/16
 */
public class ServiceException extends RuntimeException {
    public ServiceException(){}

    public ServiceException(String message){super(message);}
}
