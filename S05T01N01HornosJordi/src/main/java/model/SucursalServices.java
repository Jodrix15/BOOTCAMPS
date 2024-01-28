package model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class SucursalServices {

    @Autowired
    ISucursalRepository sucursalRepository;

    public ArrayList<SucursalModel> getSucursales(){
        return (ArrayList<SucursalModel>) sucursalRepository.findAll();
    }

    public SucursalModel addSucursal(SucursalModel sucursal){
        return sucursalRepository.save(sucursal);
    }

    public SucursalModel updateById(SucursalModel request, Long id){
        SucursalModel sucursal = sucursalRepository.findById(id).get();

        return sucursal;
    }

    public Optional<SucursalModel> getById(Long id){
        return sucursalRepository.findById(id);
    }

    public boolean deleteSucursal(Long id){
        boolean delete = false;

        return delete;
    }

}
