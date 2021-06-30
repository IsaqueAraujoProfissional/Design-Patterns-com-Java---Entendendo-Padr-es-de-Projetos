package br.com.isaque.dip.factory;

import br.com.isaque.dip.model.Db;
import br.com.isaque.dip.model.IDbProduct;
import br.com.isaque.dip.model.MongoDBProduct;
import br.com.isaque.dip.model.MySQLProduct;

public class DbProductFactory {
    public static IDbProduct create(Db type){
        if(type == Db.MYSQL) {
            return new MySQLProduct();
        }else{
            return  new MongoDBProduct();
        }
    }
}
