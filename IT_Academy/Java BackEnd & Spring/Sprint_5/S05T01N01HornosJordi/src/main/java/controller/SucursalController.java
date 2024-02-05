package controller;

import model.Sucursal;
import model.SucursalDTO;
import model.SucursalMapper;
import model.SucursalService;
import model.impl.SucursalServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@RestController
@RequestMapping("sucursalapi/v1")
public class SucursalController {

    @Autowired
    private SucursalService sucursalService;

    @PostMapping("/sucursales/add")
    public ResponseEntity<SucursalDTO> addSucursal(@RequestBody SucursalDTO sucursalDTO){
    SucursalDTO addSuc =  sucursalService.addSucursal(sucursalDTO);
    return new ResponseEntity<>(addSuc, HttpStatus.CREATED);
    }

    @GetMapping("sucursales/update/{id}")
    public String verUpdateForm(@PathVariable Integer id, Model model){
        model.addAttribute("sucursal", sucursalService.findById(id));
        return "actualizar";
    }

    @PostMapping("sucursales/{id}")
    public String updateSucursal(@PathVariable Integer id, @ModelAttribute("sucursal") SucursalDTO sucursalDTO){
        sucursalService.updateSucursal(id,sucursalDTO);

        return "redirect:/sucursalapi/v1/sucursales";
    }

    @GetMapping("/sucursales/delete/{id}")
    public String deleteSucursal(@PathVariable Integer id, RedirectAttributes redirectAttributes){
        sucursalService.deleteSucursal(id);
        redirectAttributes.addFlashAttribute("borrado", "sucursal eliminada");
        return "redirect:/sucursalapi/v1/sucursales";
    }

    @GetMapping("/sucursales/getOne/{id}")
    public String getOneSucursalById(@PathVariable Integer id, Model model){
        Sucursal sucursal = sucursalService.getOneSucursal(id);
        SucursalDTO sucursalDTO = SucursalMapper.MAPPER.sucursal2DTO(sucursal);
        model.addAttribute("sucursalDTO",sucursalDTO);
        return "verSucursales";
    }

    @GetMapping(path="/sucursal/getAll")
    public String getAllSucursales(Model model){
        List<SucursalDTO> sucursales = sucursalService.getAllSucursales();
        model.addAttribute("nombre", "sucursales");
        model.addAttribute("sucursales", sucursales);
        return "ver/sucursales";
    }

    @GetMapping("/sucursales")
    public String sucursalesList(Model model){
        List<SucursalDTO> list = sucursalService.getAllSucursales();
        model.addAttribute("Sucursales", list);
        return "sucursales";
    }

    @GetMapping ("/sucursales/add")
    public String showForm(Model model){
        model.addAttribute("sucursal", new SucursalDTO());
        return "crearSucursal";
    }


}
