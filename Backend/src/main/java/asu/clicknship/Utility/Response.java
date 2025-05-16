package asu.clicknship.Utility;

import com.google.gson.GsonBuilder;

public class Response {

    public static String send(Object object) {
        return new GsonBuilder().setPrettyPrinting().create().toJson(object);
    }
}
