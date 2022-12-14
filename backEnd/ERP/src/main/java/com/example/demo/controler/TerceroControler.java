package com.example.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Tercero;
import com.example.demo.dto.Usuario;
import com.example.demo.service.TerceroImpl.TerceroImpl;
import com.example.demo.service.TerceroImpl.UsuarioImpl;

@RestController
@RequestMapping("/api")
public class TerceroControler {

	@Autowired
	TerceroImpl terceroServiceImpl;
	UsuarioImpl usuarioImpl;
	
	
	@GetMapping("/tercero")
	public List<Tercero> listarTercero(){
		return terceroServiceImpl.listarTercero();
	}
	
	@PostMapping("/tercero")
	public Tercero salvarTercero(@RequestBody Tercero tercero) {
	return terceroServiceImpl.guardarTercero(tercero);
	}
	
	// por desarrollar
	
//	@GetMapping("/usuario")
//	public List<Usuario> listarUsuario(){
//		return usuarioImpl.listarUsuarios();
//	}
	
}
