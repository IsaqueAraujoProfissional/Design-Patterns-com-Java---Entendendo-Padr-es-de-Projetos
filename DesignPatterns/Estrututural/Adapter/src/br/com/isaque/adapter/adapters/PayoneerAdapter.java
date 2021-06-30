package br.com.isaque.adapter.adapters;

import br.com.isaque.adapter.payoneer.Payoneer;
import br.com.isaque.adapter.paypal.IPayPalPayments;
import br.com.isaque.adapter.utils.Token;

import java.awt.font.TextHitInfo;

public class PayoneerAdapter implements IPayPalPayments {
    private Token token;
    private Payoneer payoneer;

    public  PayoneerAdapter(Payoneer payoneer){
        this.payoneer = payoneer;
        System.out.println("Adaptando o Payoneer utilizando os métodos padrões do PayPal!");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.payoneer.sendPayment();
    }

    @Override
    public void paypalReceived() {
        this.payoneer.receivedPayment();
    }
}
