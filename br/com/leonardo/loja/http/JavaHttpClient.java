package br.com.leonardo.loja.http;


import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

import javax.management.RuntimeErrorException;

public class JavaHttpClient implements HttpAdapter {

    @Override
    public void post(String url, Map<String, Object> dados) {
        try {
            URL ulrDaApi = new URL(url);
            URLConnection openConnection = ulrDaApi.openConnection();
            openConnection.connect();
        } catch (Exception e) {
            throw new RuntimeErrorException(null, "Erro ao enviar requisicao HTTP");
        }
        
    }
    
}
