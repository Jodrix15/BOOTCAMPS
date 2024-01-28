package model;

import jakarta.persistence.*;

@Entity
@Table(name="sucursales")
public class SucursalModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pk_SucursalID;

    @Column
    private String nomSucursal;

    @Column
    private String paisSucursal;

    public Integer getPk_SucursalID() {
        return pk_SucursalID;
    }

    public void setPk_SucursalID(Integer pk_SucursalID) {
        this.pk_SucursalID = pk_SucursalID;
    }

    public String getNomSucursal() {
        return nomSucursal;
    }

    public void setNomSucursal(String nomSucursal) {
        this.nomSucursal = nomSucursal;
    }

    public String getPaisSucursal() {
        return paisSucursal;
    }

    public void setPaisSucursal(String paisSucursal) {
        this.paisSucursal = paisSucursal;
    }
}
