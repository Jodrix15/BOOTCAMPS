package cat.itacademy.barcelonactiva.Hornos.Jordi.S05T01N01HornosJordi.model;

import java.util.List;

public interface SucursalService {
    public List<SucursalDTO> getAllSucursales();
    public Sucursal getOneSucursal(Integer id);
    public SucursalDTO addSucursal(SucursalDTO sucursalDTO);
    public SucursalDTO updateSucursal(Integer id, SucursalDTO sucursalDTO);
    public void deleteSucursal(Integer id);
    public Sucursal findByName(String nameBranch);
    public SucursalDTO findById(Integer id);
}
