package com.papsign.example.api;

import com.google.gson.reflect.TypeToken;
import com.squareup.okhttp.Call;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Pair;
import io.swagger.client.auth.OAuth;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;

public class AuthProvider {

    public AuthProvider(String key, String secret) {
        this.key = key;
        this.secret = secret;
    }

    private String key;
    private String secret;

    public ApiClient setupClientWithAuth() {
        ApiClient client = new ApiClient();
        OAuth oauth = (OAuth) client.getAuthentication("papsign");
        Token token = requestAccessToken(client, key, secret);
        oauth.setAccessToken(token.access_token);
        return client;
    }

    private static Token requestAccessToken(ApiClient client, String apiKey, String apiSecret) {
        if (client == null) return null;

        HashMap<String, Object> form = new HashMap<>(2);

        form.put("grant_type", "client_credentials");
        form.put("scope", "SIGN FILE USER");
        Base64.Encoder encoder = Base64.getEncoder();
        String encoded = encoder.encodeToString((apiKey+":"+apiSecret).getBytes());

        HashMap<String, String> headers = new HashMap<String, String>(1);
        headers.put("Authorization", "Basic " + encoded);
        headers.put("Content-Type", "application/x-www-form-urlencoded");

        Call call;
        try {
            call = client.buildCall("/oauth/token", "POST", new ArrayList<Pair>(), new ArrayList<Pair>(), null, headers, form, new String[0], null);
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            e.printStackTrace();
            return null;
        }

        Type localVarReturnType = new TypeToken<Token>(){}.getType();
        ApiResponse<Token> result;
        try {
            result = client.execute(call, localVarReturnType);
        } catch (ApiException e) {
            System.err.println(e.getResponseBody());
            e.printStackTrace();
            return null;
        }
        return result.getData();
    }

    static class Token {

        public Token(String access_token, String token_type, String expires_in, String refresh_token, String scope) {
            this.access_token = access_token;
            this.token_type = token_type;
            this.expires_in = expires_in;
            this.refresh_token = refresh_token;
            this.scope = scope;
        }

        public String access_token;
        public String token_type;
        public String expires_in;
        public String refresh_token;
        public String scope;

        @Override
        public String toString() {
            return "Token{" +
                    "access_token='" + access_token + '\'' +
                    ", token_type='" + token_type + '\'' +
                    ", expires_in='" + expires_in + '\'' +
                    ", refresh_token='" + refresh_token + '\'' +
                    ", scope='" + scope + '\'' +
                    '}';
        }
    }
}
