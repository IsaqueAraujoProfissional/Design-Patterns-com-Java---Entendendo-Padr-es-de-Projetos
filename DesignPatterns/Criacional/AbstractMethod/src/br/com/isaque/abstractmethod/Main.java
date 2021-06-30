package br.com.isaque.abstractmethod;

import br.com.isaque.abstractmethod.app.Application;
import br.com.isaque.abstractmethod.factories.ITransportFactory;
import br.com.isaque.abstractmethod.factories.NineNineFactory;
import br.com.isaque.abstractmethod.factories.UberTransport;

public class Main {
    public static Application configureApplication(){
        Application app;
        ITransportFactory factory;

        String company = "uber";
        if(company == "uber"){
            factory = new UberTransport();
        }else{
            factory = new NineNineFactory();
        }
        app = new Application(factory);

        return app;
    }
    public static void main(String[] args) {
	    Application app = configureApplication();
	    app.startRoute();
    }
}
