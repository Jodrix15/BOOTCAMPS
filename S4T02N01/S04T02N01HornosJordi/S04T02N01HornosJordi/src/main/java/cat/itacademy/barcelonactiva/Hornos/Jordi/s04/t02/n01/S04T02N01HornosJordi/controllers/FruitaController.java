package cat.itacademy.barcelonactiva.Hornos.Jordi.s04.t02.n01.S04T02N01HornosJordi.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cat.itacademy.barcelonactiva.Hornos.Jordi.s04.t02.n01.S04T02N01HornosJordi.models.FruitaModel;
import cat.itacademy.barcelonactiva.Hornos.Jordi.s04.t02.n01.S04T02N01HornosJordi.services.FruitaServices;

@RestController
@RequestMapping("api/h2/fruita")
public class FruitaController {
	
	@Autowired
	private FruitaServices fruitaService;
	
	@GetMapping(path = "/getAll")
	public ArrayList<FruitaModel> getFruitas(){
		return this.fruitaService.getFruites();
	}
	
	@PostMapping(path = "/add")
	public FruitaModel saveFruita(@RequestBody FruitaModel fruita) {
		return this.fruitaService.saveFruit(fruita);
		
	}
	
	@GetMapping(path = "getOne/{id}")
	public Optional<FruitaModel> getFruitaById(@PathVariable Long id){
		return this.fruitaService.getById(id);
	}
	
	@PutMapping(path = "/update/{id}")
	public FruitaModel updateById(@RequestBody FruitaModel request, Long id) {
		return this.fruitaService.updateById(request, id);
		
	}
	
	@DeleteMapping(path = "/delete/{id}")
	public String deleteById(@PathVariable("id") Long id) {
		boolean ok = this.fruitaService.deleteFruita(id);
		String msj = "";
		
		if(ok) {
			msj = "fruita con id" + id + " borrado";
		}else {
			msj = "error";
		}
		
		return msj;
	}
	
	

}
