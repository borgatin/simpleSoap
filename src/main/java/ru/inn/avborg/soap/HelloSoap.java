package ru.inn.avborg.soap;

import ru.inn.avborg.model.Goods;

import javax.jws.WebService;

/**
 * Created by avborg on 13.11.2016.
 */
@WebService(endpointInterface = "ru.inn.avborg.soap.WebserviceSEI",
        serviceName = "HelloSoap")
public class HelloSoap implements WebserviceSEI {

    @Override
    public String testService() {
        return "Hello from SOAP Webservice!";
    }

    @Override
    public String sayHelloTo(String text) {
        return "Hello to " + text;
    }

    @Override
    public Goods getGoods() {
        Goods goods = new Goods();
        goods.setId(1);
        goods.setName("Some goods test name");
        return goods;
    }
}
