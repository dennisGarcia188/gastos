package com.gastos.gastos.resource;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.gastos.gastos.entity.Disco;
import com.gastos.gastos.repository.DiscosRepository;


@RestController
public class ConsumeWebService {
  
   @Autowired(required=true)
   RestTemplate restTemplate;
   
   @Autowired(required=true)
   private DiscosRepository DiscosRepository;

   @RequestMapping(value = "/template/consumeAlbums")
   public Disco getAlbunsList() {
	   Disco disco = new Disco();
	  String id = "41MnTivkwTO3UUJ8DrqEJJ";
      HttpHeaders headers = new HttpHeaders();
      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
      headers.add("Authorization", "Bearer BQAxRVrH8jKf9oKna-lwhuCeIO4cKAIJItURMe2opS8PwMlCavjiaSNmFnikSEgRoxMd6HOSgMcWND41_4to6GzT-M4EHRyv_laN2gUxh8bqwNk7KA8I7gZ3zcaIpe49Vdkq6HFKJgz3UMzLK5mpP1Kdsl3h6WCT2QP9");
      HttpEntity <Disco> entity = new HttpEntity<Disco>(headers);
      
      disco = restTemplate.exchange("https://api.spotify.com/v1/albums/" + id, 
    		  HttpMethod.GET, entity, Disco.class).getBody();
      
      DiscosRepository.save(disco);
      
      return disco;
      
   }
}
