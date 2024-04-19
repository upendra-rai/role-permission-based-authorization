package com.upendra.rai.controllers;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Admin APIs", description = "This collection contains APIs for Admin resource")
@RestController
@RequestMapping("/api/v1/admin")
@PreAuthorize("hasRole('ADMIN')")
public class AdminController {

	@GetMapping
	@Operation(summary = "Get Admin API", description = "This API fetches Admin.")
	@PreAuthorize("hasAuthority('admin:read')")
	public String get() {
		return "GET:: admin controller";
	}

	@PostMapping
	@PreAuthorize("hasAuthority('admin:create')")
	@Hidden
	public String post() {
		return "POST:: admin controller";
	}

	@PutMapping
	@PreAuthorize("hasAuthority('admin:update')")
	@Hidden
	public String put() {
		return "PUT:: admin controller";
	}

	@DeleteMapping
	@PreAuthorize("hasAuthority('admin:delete')")
	@Operation(summary = "Delete Admin API", description = "This API Delete Admin.")
	public String delete() {
		return "DELETE:: admin controller";
	}
}
