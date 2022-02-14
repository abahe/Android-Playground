package com.pupanka.getapi;

import com.google.gson.annotations.SerializedName;

public class Results {

    @SerializedName("ip")
    private String ip;

    public Results(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }
}