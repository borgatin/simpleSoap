package ru.inn.avborg;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import ru.inn.avborg.model.Goods;
import ru.inn.avborg.soap.WebserviceSEI;

/**
 * Created by avborg on 13.11.2016.
 */
public class SoapClient {
    public static void main(String[] args) {
        testSOAPFromClient();
    }

    /**
     * create client and test soap service
     */
    private static void testSOAPFromClient() {
        String soapServiceUrl = "http://localhost:8080/soap/webserviceSEI";

        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(WebserviceSEI.class);
        factoryBean.setAddress(soapServiceUrl);

        WebserviceSEI webserviceSEI = (WebserviceSEI) factoryBean.create();

        Goods result = webserviceSEI.getGoods();
        System.out.println("Result: " + result);
    }
}
