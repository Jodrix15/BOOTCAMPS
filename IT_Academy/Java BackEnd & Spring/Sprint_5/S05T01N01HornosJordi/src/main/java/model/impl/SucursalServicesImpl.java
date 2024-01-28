package model.impl;


import model.SucursalModel;
import model.SucursalRepository;
import model.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class SucursalServicesImpl implements SucursalService {

   private SucursalRepository sucursalRepository;

   public SucursalServicesImpl(SucursalRepository sucursalRepository){
       this.sucursalRepository = sucursalRepository;
   }

    @Override
    public void addSucursal(Sucursal sucursal) {
       sucursalRepository.save(sucursal);

    }

    @Override
    public void updateSucursal(Sucursal sucursal) {
       sucursalRepository.save(sucursal);

    }

    @Override
    public void deleteSucursal(Long id) {
        Optional<Sucursal> sucursal = sucursalRepository.findById(id);
        if(sucursal.isPresent()){
            sucursalRepository.deleteById(id);
        }
        else{
            throw new EntityNotFoundException();
        }

    }

    @Override
    public Sucursal getOneSucursal(Long id) {
        Optional<Sucursal> sucursal = sucursalRepository.findById(id);
        if(sucursal.isPresent()){
            return sucursal.get();
        }
        else{
            throw new EntityNotFoundException();
    }

    @Override
    public List<SucursalDTO> getAllSucursal() {
        List<SucursalDTO> allSucursalDTO = new ArrayList<>();
        sucursalRepository.findAll().forEach(s-> allSucursalDTO.add(sucursalToDTO(s)));
        return allSucursalDTO;
    }

    @Override
    public SucursalDTO sucursalToDTO(Sucursal sucursal) {
        return new SucursalDTO(sucursal);
    }

    @Override
    public Sucursal findByName(String nombreSucursal) {
        return sucursalRepository.findByNomSucursal(nom_sucursal);
    }
}
