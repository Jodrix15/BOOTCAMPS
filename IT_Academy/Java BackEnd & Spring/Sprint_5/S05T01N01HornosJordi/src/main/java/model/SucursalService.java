package model;

public interface SucursalService {
    public void addSucursal(Sucursal sucursal);
    public void updateSucursal(Sucursal sucursal);
    public void deleteSucursal(Long id);
    public Sucursal getOneSucursal(Long id);
    public List<SucursalDTO> getAllSucursal();
    public SucursalDTO sucursalToDTO(Sucursal sucursal);
    public Sucursal findByName(String nomSucursal);
}
