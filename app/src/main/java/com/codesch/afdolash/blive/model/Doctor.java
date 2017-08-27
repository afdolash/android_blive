package com.codesch.afdolash.blive.model;

/**
 * Created by Afdolash on 8/27/2017.
 */

public class Doctor {
    private String name, address, specialist, phone;

    public Doctor(String name, String specialist, String address, String phone) {
        this.name = name;
        this.address = address;
        this.specialist = specialist;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getSpecialist() {
        return specialist;
    }

    public String getPhone() {
        return phone;
    }
}
