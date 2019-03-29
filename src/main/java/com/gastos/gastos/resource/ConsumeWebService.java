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


@RestController
public class ConsumeWebService {
  
   @Autowired(required=true)
   RestTemplate restTemplate;

   @RequestMapping(value = "/template/consumeAlbums")
   public Disco getAlbunsList() {
	  String id = "41MnTivkwTO3UUJ8DrqEJJ";
      HttpHeaders headers = new HttpHeaders();
      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
      headers.add("Authorization", "Bearer BQBboI_VMEdPbFCFKjV4y078SswuCzeyPnoTrX0Jv13VztUDYVdsSUGqSSZRy39KuXqD2qK4mGxWIx1tBMuY0wzyohTYZsKJ0fgdrmBVsXZkzNzQqTuwjYATQ-dAVUca4LenYpZ-D2HiuCUQ8TBId2r7JA6DZY4NFZY8");
      HttpEntity <Disco> entity = new HttpEntity<Disco>(headers);
      
      return restTemplate.exchange("https://api.spotify.com/v1/albums/" + id, 
    		  HttpMethod.GET, entity, Disco.class).getBody();
   }
}
