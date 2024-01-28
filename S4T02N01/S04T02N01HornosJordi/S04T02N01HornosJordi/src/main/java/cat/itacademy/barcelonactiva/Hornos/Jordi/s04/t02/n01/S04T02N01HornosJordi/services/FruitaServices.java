package cat.itacademy.barcelonactiva.Hornos.Jordi.s04.t02.n01.S04T02N01HornosJordi.services;

import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.Hornos.Jordi.s04.t02.n01.S04T02N01HornosJordi.models.FruitaModel;
import cat.itacademy.barcelonactiva.Hornos.Jordi.s04.t02.n01.S04T02N01HornosJordi.repositories.IFruitaRepository;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class FruitaServices {
	
	@Autowired
	IFruitaRepository fruitaRepository;
	
	public ArrayList<FruitaModel> getFruites(){
		return (ArrayList<FruitaModel>) fruitaRepository.findAll();
	}
	
	public FruitaModel saveFruit(FruitaModel fruita) {
		return fruitaRepository.save(fruita);
	}
	
	public FruitaModel updateById(FruitaModel request, Long id){
		FruitaModel fruita = fruitaRepository.findById(id).get();
		
		fruita.setNom(request.getNom());
		fruita.setQuantitatQuilos(request.getQuantitatQuilos());
		
		return fruita;

	}
	
	public Optional<FruitaModel> getById(Long id){
		return fruitaRepository.findById(id);
	}
	
	public boolean deleteFruita (Long id) {
		boolean delete = false;
		try {
			fruitaRepository.deleteById(id);
			delete = true;
		
		}catch (Exception e) {
			System.out.println("No se ha borrado");
		}
		
		return delete;
	}
	

}
