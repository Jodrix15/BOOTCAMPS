package cat.itacademy.barcelonactiva.Hornos.Jordi.S05T01N01HornosJordi.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SucursalRepository extends JpaRepository<Sucursal, Integer> {
    public Sucursal findByNameSucursal(String sucursalName);
}
