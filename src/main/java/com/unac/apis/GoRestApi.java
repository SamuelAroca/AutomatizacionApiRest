package com.unac.apis;

import com.unac.restinteractions.RestInteractions;

public class GoRestApi {

    private static final String TOKEN = "270ee8ce7b5c015304c7c9c67ad1e80e47ec7afbf6fea997ca707545d3e371eb";
    private static String pathName = "name";

    public static void setBaseUrl(String baseUrl) {
        RestInteractions.setBaseUrl(baseUrl);
    }

    public static void executionGetToken(String endPoint, String idUser){
        RestInteractions.executionGetToken(endPoint,idUser,TOKEN);
    }

    public static void validateResponse(Integer statusCode, String name) {
    RestInteractions.validatecode(statusCode);
    RestInteractions.validateDataResponse(name,pathName);
    }
}
