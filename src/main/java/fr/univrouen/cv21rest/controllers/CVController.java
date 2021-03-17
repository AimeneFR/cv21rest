package fr.univrouen.cv21rest.controllers;

import java.util.Formatter;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.CV;

@RestController
public class CVController {
	
	@GetMapping("/resume")
	public String getListCVinXML() {
		return "Envoi de la liste des CV";
	}
	@GetMapping("/id")
	public String getCVinXML(
		@RequestParam(value = "name") String texte) {
		return ("Détail du CV demandé : " + texte);
	}
	@GetMapping("/test")
	public String getTestParams(
		@RequestParam(value = "texte") String texte,
		@RequestParam(value = "nb") int nb
		) {
		return String.format("Test :%nid = %d%ntitre = %s", nb, texte);
	}
	
}