package cat.itacademy.barcelonactiva.Hornos.Jordi.S05T01N01HornosJordi.Execption;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@ControllerAdvice
public class ExceptionHandlerAdvice {
    @ExceptionHandler(SucursalNotFoundException.class)
    public String handleBranchNotFoundException(SucursalNotFoundException exception, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("ErrorMessage", exception.getMessage());
        return "redirect:/Sucurasalapi/v1/sucursales";
    }


}

