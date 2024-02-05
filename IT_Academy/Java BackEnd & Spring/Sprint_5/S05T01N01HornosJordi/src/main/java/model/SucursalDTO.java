package model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;

public class SucursalDTO {
    @Setter
    @Getter
    private Integer id;

    @Getter
    @Setter
    private String paisSucursal;

    @Getter
    @Setter
    private String nameSucursal;

    @Getter
    @Setter
    private String tipoSucursal;
    private final static ArrayList<String> eu_paises = new ArrayList<>(Arrays.asList("Austria","Belgium","Bosnia and Herzegovina","Bulgaria","Croatia","Cyprus","Czech Republic","Denmark","Estonia","Finland","France","Georgia","Germany","Greece","Hungary","Iceland","Ireland","Italy","Spain"));

    public SucursalDTO(){
        this.tipoSucursal = isEuPais(paisSucursal)? "UE": "NOT UE";
    }

    public static boolean isEuPais(String pais){
        return eu_paises.contains(pais);
    }


}

