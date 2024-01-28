package cat.itacademy.barcelonactiva.hornos.jordi.s04.t01.n01.S04T01N01HornosJordi.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	
	//http://localhost:9000/HelloWorld?nom=El meu nom
	@GetMapping("/HelloWorld")
	public String saluda(@RequestParam(value = "nom", defaultValue = "UNKNOWN") String nom) {
		return "Hola, "+nom+". Estas ejecutando un proyecto Maven";
	}
	
	//http://localhost:9000/HelloWorld2/el meu nom
	@GetMapping("/HelloWorld2/{nom}")
	public String saluda2(@PathVariable(required=false) String nom) {
		if (nom == null) {
			nom = "UNKNOWN";
		}
		return "Hola, "+nom+". Estas ejecutando un proyecto Maven";
	}

}
