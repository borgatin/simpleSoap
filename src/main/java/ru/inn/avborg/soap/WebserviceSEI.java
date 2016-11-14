package ru.inn.avborg.soap;

import ru.inn.avborg.model.Goods;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by avborg on 13.11.2016.
 */
@WebService
public interface WebserviceSEI {

    @WebMethod
    String testService();

    @WebMethod
    String sayHelloTo(@WebParam(name = "text") String text);

    @WebMethod
    Goods getGoods();
}