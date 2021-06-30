package br.com.isaque.dip.payment;

import br.com.isaque.dip.factory.DbProductFactory;
import br.com.isaque.dip.model.Db;
import br.com.isaque.dip.model.IDbProduct;
import br.com.isaque.dip.model.MySQLProduct;

public class Payment {
    public void pay(String productID){
        IDbProduct dbProduct = DbProductFactory.create(Db.MYSQL);
        String product = dbProduct.getProductById(productID);
        System.out.println(product);
    }
}
