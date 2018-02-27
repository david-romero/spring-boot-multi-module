package io.manco.maxim.sbmm.web.controllers;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.manco.maxim.sbmm.core.domain.MyEntity;
import io.manco.maxim.sbmm.core.service.EntityService;

@RestController
public class EntityController {

	private final EntityService entityService;

	public EntityController(EntityService entityService) {
		this.entityService = entityService;
	}
	
	@GetMapping("/api/entities")
	public Collection<MyEntity> findAll(){
		return this.entityService.findAll();
	}
	
	
	
}
