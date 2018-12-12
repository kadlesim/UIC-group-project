package com.example.tevod.cargoshipment;

public class MyDataStorage {

    private static String typeOfCargo;
    private static int amount;
    private static String units;
    private static double suggestedPrice;
    private static String currency;
    private static String pickupPlace;
    private static String datetimeOfPickup;
    private static String paymentMethod;

    public static String getTypeOfCargo() {
        return typeOfCargo;
    }

    public static void setTypeOfCargo(String typeOfCargo) {
        MyDataStorage.typeOfCargo = typeOfCargo;
    }

    public static int getAmount() {
        return amount;
    }

    public static void setAmount(int amount) {
        MyDataStorage.amount = amount;
    }

    public static String getUnits() {
        return units;
    }

    public static void setUnits(String units) {
        MyDataStorage.units = units;
    }

    public static double getSuggestedPrice() {
        return suggestedPrice;
    }

    public static void setSuggestedPrice(double suggestedPrice) {
        MyDataStorage.suggestedPrice = suggestedPrice;
    }

    public static String getCurrency() {
        return currency;
    }

    public static void setCurrency(String currency) {
        MyDataStorage.currency = currency;
    }

    public static String getPickupPlace() {
        return pickupPlace;
    }

    public static void setPickupPlace(String pickupPlace) {
        MyDataStorage.pickupPlace = pickupPlace;
    }

    public static String getDatetimeOfPickup() {
        return datetimeOfPickup;
    }

    public static void setDatetimeOfPickup(String datetimeOfPickup) {
        MyDataStorage.datetimeOfPickup = datetimeOfPickup;
    }

    public static String getPaymentMethod() {
        return paymentMethod;
    }

    public static void setPaymentMethod(String paymentMethod) {
        MyDataStorage.paymentMethod = paymentMethod;
    }

    public static String myToString() {
        return "Type of cargo: " + getTypeOfCargo() + "\n" +
                "Amount: " + getAmount() + " " + getUnits() + "\n" +
                "Price per unit: " + getSuggestedPrice() + " " + getCurrency().substring(0,3) + "\n" +
                "Pickup place: " + getPickupPlace() + "\n" +
                "Date and time of pickup: " + getDatetimeOfPickup() + "\n" +
                "Payment method: " + getPaymentMethod();
    }
}
