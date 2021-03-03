package edu.ping.pigcoin.domain;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.List;

public class Wallet {
    
    private PublicKey address;
    private PrivateKey sKey;
    private double total_input;
    private double total_output;
    private double balance;
    private List<Transaction> inputTransactions;
    private List<Transaction> outputTransactions;

    public void setAddress(PublicKey address) {
        this.address = address;
    }

    public void setSK(PrivateKey sKey) {
        this.sKey = sKey;
    }

    public PublicKey getAddress() {
        return this.address;
    }

    public PrivateKey getSKey() {
        return this.sKey;
    }

    public void setTotal_input(double total_input) {
        this.total_input = total_input;
    }

    public double getTotal_input() {
        return this.total_input;
    }

    public void setTotal_output(double total_output) {
        this.total_output = total_output;
    }

    public double getTotal_output() {
        return this.total_output;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setOutputTransactions(List<Transaction> outputTransactions) {
        this.outputTransactions = outputTransactions;
    }

    public List<Transaction> getOutputTransactions() {
        return this.outputTransactions;
    }

    public void setInputTransactions(List<Transaction> inputTransactions) {
        this.inputTransactions = inputTransactions;
    }

    public List<Transaction> getInputTransactions() {
        return this.inputTransactions;
    }

}
