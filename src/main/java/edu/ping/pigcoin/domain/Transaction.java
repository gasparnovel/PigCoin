package edu.ping.pigcoin.domain;

import java.security.PublicKey;

public class Transaction {
    
    private String hash;
    private String prev_hash;
    private PublicKey pKey_sender;
    private PublicKey pKey_recipient;
    private double pigcoins;
    private String message;
    private byte[] signature;

    public Transaction(String hash, String prev_hash, PublicKey pKey_sender, PublicKey pKey_recipient, double pigcoins, String message, byte[] signature) {
        this.hash = hash;
        this.prev_hash = prev_hash;
        this.pKey_sender = pKey_sender;
        this.pKey_recipient = pKey_recipient;
        this.pigcoins = pigcoins;
        this.message = message;
        this.signature = signature;
    }

    public String getHash() {
        return this.hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getPrev_hash() {
        return this.prev_hash;
    }

    public void setPrev_hash(String prev_hash) {
        this.prev_hash = prev_hash;
    }

    public PublicKey getPKey_sender() {
        return this.pKey_sender;
    }

    public void setPKey_sender(PublicKey pKey_sender) {
        this.pKey_sender = pKey_sender;
    }

    public PublicKey getPKey_recipient() {
        return this.pKey_recipient;
    }

    public void setPKey_recipient(PublicKey pKey_recipient) {
        this.pKey_recipient = pKey_recipient;
    }

    public double getPigcoins() {
        return this.pigcoins;
    }

    public void setPigcoins(double pigcoins) {
        this.pigcoins = pigcoins;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public byte[] getSignature() {
        return this.signature;
    }

    public void setSignature(byte[] signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "{" +
            " hash='" + getHash() + "'" +
            ", prev_hash='" + getPrev_hash() + "'" +
            ", pKey_sender='" + getPKey_sender() + "'" +
            ", pKey_recipient='" + getPKey_recipient() + "'" +
            ", pigcoins='" + getPigcoins() + "'" +
            ", message='" + getMessage() + "'" +
            ", signature='" + getSignature() + "'" +
            "}";
    }
}
