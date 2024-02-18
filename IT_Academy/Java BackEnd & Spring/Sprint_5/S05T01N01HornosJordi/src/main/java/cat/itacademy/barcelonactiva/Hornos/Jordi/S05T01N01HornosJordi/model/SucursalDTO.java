package cat.itacademy.barcelonactiva.Hornos.Jordi.S05T01N01HornosJordi.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;

@Setter
@Getter
public class SucursalDTO {
    private Integer id;

    private String paisSucursal;

    private String nameSucursal;

    private String tipoSucursal;

    public SucursalDTO(Integer id, String nameSucursal, String paisSucursal) {
        this.id = id;
        this.nameSucursal = nameSucursal;
        this.paisSucursal = paisSucursal;
        tipoSucursal = isEuPais(paisSucursal)? "UE": "NOT UE";

    }
    private final static ArrayList<String> eu_paises = new ArrayList<>(Arrays.asList("Austria","Belgium","Bosnia and Herzegovina","Bulgaria","Croatia","Cyprus","Czech Republic","Denmark","Estonia","Finland","France","Georgia","Germany","Greece","Hungary","Iceland","Ireland","Italy","Spain"));

    public SucursalDTO(){
        this.tipoSucursal = isEuPais(paisSucursal)? "UE": "NOT UE";
    }

    public static boolean isEuPais(String pais){
        return eu_paises.contains(pais);
    }


}

