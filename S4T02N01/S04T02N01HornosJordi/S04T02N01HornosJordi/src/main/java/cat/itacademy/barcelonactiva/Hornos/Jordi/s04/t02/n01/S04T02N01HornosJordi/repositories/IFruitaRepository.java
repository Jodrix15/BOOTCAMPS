package cat.itacademy.barcelonactiva.Hornos.Jordi.s04.t02.n01.S04T02N01HornosJordi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cat.itacademy.barcelonactiva.Hornos.Jordi.s04.t02.n01.S04T02N01HornosJordi.models.FruitaModel;

@Repository
public interface IFruitaRepository extends JpaRepository<FruitaModel, Long>{

}
