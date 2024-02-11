package cat.itacademy.barcelonactiva.Hornos.Jordi.S05T01N01HornosJordi.model.impl;


import cat.itacademy.barcelonactiva.Hornos.Jordi.S05T01N01HornosJordi.Execption.SucursalNotFoundException;
import cat.itacademy.barcelonactiva.Hornos.Jordi.S05T01N01HornosJordi.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class SucursalServicesImpl implements SucursalService {

    @Autowired
    private SucursalRepository sucursalRepository;

    @Override
    public List<SucursalDTO> getAllSucursales() {
        List<Sucursal> sucursales = sucursalRepository.findAll();
        return sucursales.stream().map(SucursalMapper.MAPPER::sucursal2DTO)
                .collect(Collectors.toList());
    }

    @Override
    public Sucursal getOneSucursal(Integer id) {
        return sucursalRepository.findById(id)
                .orElseThrow(() -> new SucursalNotFoundException("Sucursal no encontrada con id: " + id));
    }

    @Override
    public SucursalDTO addSucursal(SucursalDTO sucursalDTO) {
        Sucursal sucursal = SucursalMapper.MAPPER.DTO2Sucursal(sucursalDTO);
        Sucursal saveSucursal = sucursalRepository.save(sucursal);

        return SucursalMapper.MAPPER.sucursal2DTO(saveSucursal);
    }

    @Override
    public SucursalDTO updateSucursal(Integer id, SucursalDTO sucursalDTO) {
        Sucursal sucursal = sucursalRepository.findById(id).orElseThrow(()-> new SucursalNotFoundException("sucursal no encontrada"));
        sucursal.setNameSucursal(sucursalDTO.getNameSucursal());
        sucursal.setPaisSucursal(sucursalDTO.getPaisSucursal());
        Sucursal updateSucursal = sucursalRepository.save(sucursal);
        return SucursalMapper.MAPPER.sucursal2DTO(updateSucursal);
    }

    @Override
    public void deleteSucursal(Integer id) {
        sucursalRepository.deleteById(id);

    }

    @Override
    public Sucursal findByName(String nameBranch) {
        return sucursalRepository.findByNameSucursal(nameBranch);
    }

    @Override
    public SucursalDTO findById(Integer id) {
        Sucursal sucursal = sucursalRepository.findById(id)
                .orElseThrow(()->new SucursalNotFoundException("sucursal no encontrada"));
        return SucursalMapper.MAPPER.sucursal2DTO(sucursal);
    }
}
