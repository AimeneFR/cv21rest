package fr.univrouen.cv21rest.controllers;

import java.io.IOException;
import java.util.Formatter;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.CV;
import model.TestCV;

@RestController
public class CVPostController {
	@RequestMapping(
			value = "/testpost", method = RequestMethod.POST,
			consumes = "application/xml"
			)
	public String postTest(@RequestBody String cv) {
		return ("<result><response>Message reçu : </response>" + cv + "</result>");
	}
	
	@PostMapping(value = "/postcv", produces = MediaType.APPLICATION_XML_VALUE)
	@ResponseBody
	public String postCV() throws IOException {
	TestCV cv = new TestCV();
	return cv.loadFileXML();
	}
	
	@RequestMapping(value = "/xml", produces = MediaType.APPLICATION_XML_VALUE)
	public @ResponseBody CV getXML() {
	CV cv = new CV("HAMILTON","Margaret","1969/07/21","Appollo11@nasa.us");
	return cv;
	}
}