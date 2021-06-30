package br.com.isaque.adapter;

import br.com.isaque.adapter.adapters.PayoneerAdapter;
import br.com.isaque.adapter.payoneer.IPayoneerPayments;
import br.com.isaque.adapter.payoneer.Payoneer;
import br.com.isaque.adapter.paypal.IPayPalPayments;
import br.com.isaque.adapter.paypal.PayPal;

public class Main {

    public static void main(String[] args) {
        /*IPayoneerPayments payment = new Payoneer();
        payment.sendPayment();
        payment.receivedPayment();*/
        IPayPalPayments payment = new PayoneerAdapter(new Payoneer());
        payment.paypalPayment();
        payment.paypalReceived();
    }
}
