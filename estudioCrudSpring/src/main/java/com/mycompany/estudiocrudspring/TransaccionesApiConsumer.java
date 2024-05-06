/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudiocrudspring;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author ramir
 */
public class TransaccionesApiConsumer implements CrudRepository<Transacciones>{

    private final String URL="http://localhost/estudioCrudSpring/apiRest.php";
    @Override
    public List<Transacciones> getTransacciones(Transacciones transacciones1) {
        RestTemplate restTemplate = new RestTemplate();
        Transacciones [] transacciones = restTemplate.getForObject(URL,Transacciones[].class);
        return transacciones != null ? Arrays.asList(transacciones): Collections.emptyList();
               
    }

    @Override
    public List<Transacciones> getTransacciones2(Transacciones entity, String cuenta, String fechIni, String fecFin) {
        RestTemplate restTemplate = new RestTemplate();
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(this.URL)
                .queryParam("numero_cuenta",cuenta )
                .queryParam("fecha_inicio", fechIni)
                .queryParam("fecha_fin", fecFin);
        String consultaURL = builder.toUriString();
        System.out.println(consultaURL);
         Transacciones [] transacciones = restTemplate.getForObject(consultaURL,Transacciones[].class);
        //ResponseEntity<Void> responseEntity = restTemplate.exchange(consultaURL, HttpMethod.GET, null, Void.class);
        return transacciones != null ? Arrays.asList(transacciones): Collections.emptyList();
        
                
        
    }
    
    
    
}
