package controller;

import java.util.Optional;

import model.SucursalModel;
import model.SucursalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("api/v1")
public class controller {

    @Autowired
    private SucursalServices sucursalServices;

    @PostMapping(path = "/add")
    public SucursalModel addSucursal(@RequestBody SucursalModel sucursal){
        return this.sucursalServices.addSucursal(sucursal);
    }

    @GetMapping(path = "getOne/{id}")
    public Optional<SucursalModel> getSucursalById(@PathVariable Long id){
        return this.sucursalServices.getById(id);
    }

    @GetMapping(path = "/getAll")
    public ArrayList<SucursalModel> getSucursal(){
        return this.sucursalServices.getSucursales();
    }

    @GetMapping(path = "/update")
    public SucursalModel updateById(@RequestBody SucursalModel request, Long id){
        return sucursalServices.updateById(request, id);
    }

    @DeleteMapping(path = "/delete/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean borradoCorrectamente = this.sucursalServices.deleteSucursal(id);
        String msj = "";
        return msj;
    }

}
