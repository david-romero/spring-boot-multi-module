package io.manco.maxim.sbmm.web.controllers;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

	@GetMapping("/api/dummy")
	public List<String> getDummyData(){
		return IntStream.range(0, 10).boxed().map( i -> i.toString().concat(" index"))
				.collect(Collectors.toList());
	}
	
}
