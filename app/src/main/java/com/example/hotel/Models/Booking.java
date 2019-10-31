package com.example.hotel.Models;

public class Booking {
    String offerName;
    int offerImage;
    String offerDescript;

    public Booking(String offerName, int offerImage, String offerDescript) {
        this.offerName = offerName;
        this.offerImage = offerImage;
        this.offerDescript = offerDescript;
    }

    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public int getOfferImage() {
        return offerImage;
    }

    public void setOfferImage(int offerImage) {
        this.offerImage = offerImage;
    }

    public String getOfferDescript() {
        return offerDescript;
    }

    public void setOfferDescript(String offerDescript) {
        this.offerDescript = offerDescript;
    }
}
