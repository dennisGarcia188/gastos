package com.gastos.gastos.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.gastos.gastos.entity.Disco;
import com.gastos.gastos.repository.DiscosRepository;

@RestController
public class ConsumeWebService {

	@Autowired(required = true)
	RestTemplate restTemplate;

	@Autowired(required = true)
	private DiscosRepository DiscosRepository;

	/*
	 * método para buscar um album na api do spotify e salvar no banco como entidade
	 * disco
	 */
	@RequestMapping(value = "/template/consumeAlbums")
	public Disco getAlbunsList1(@RequestParam("idAlbum") String idAlbum, @RequestParam("token") String token) {
		try {
			Disco disco = new Disco();
			HttpHeaders headers = new HttpHeaders();
			headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
			headers.add("Authorization", "Bearer " + token);
			HttpEntity<Disco> entity = new HttpEntity<Disco>(headers);

			disco = restTemplate
					.exchange("https://api.spotify.com/v1/albums/" + idAlbum, HttpMethod.GET, entity, Disco.class)
					.getBody();

			DiscosRepository.save(disco);

			return disco;
		} catch (RestClientException e) {
			System.out.println("erro: " + e);
			Disco disco = new Disco();
			return disco;
		}
	}

	/*
	 * método para buscar e salvar no banco uma lista de discos(albuns) por genero
	 */

	// TODO faltou implementar o consumo dos 50 por generos
	@RequestMapping(value = "/template/consumeAll")
	public List<Disco> getAllByGenres() {
		List<Disco> listaDiscos = new ArrayList<Disco>();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.add("Authorization",
				"Bearer BQCHcn1XZUM0zTdf9_unnPXFsp3K5wXHdul7VgX09109nSPWSTLdrUNgLoEnffm940aJSjibX3JG9CQpEMkjP9dcjKSQcP0lrtHJi6XpDWm16bpSYnC7QOa9UVdxM1dzVNTf0Q0RC6gsQ2VANT-qPMnc9koX25dKyRxy");
		HttpEntity<Disco> entity = new HttpEntity<Disco>(headers);

		ResponseEntity<List<Disco>> response = restTemplate.exchange("https://api.spotify.com/v1/albums/",
				HttpMethod.GET, entity, new ParameterizedTypeReference<List<Disco>>() {
				});
		// https://api.spotify.com/v1/search?q=genre:sertanejo&type=album&limit=50

		listaDiscos = response.getBody();

		for (Disco disco : listaDiscos) {
			DiscosRepository.save(disco);
		}

		return listaDiscos;

	}
}
