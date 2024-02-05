package model;

import jakarta.persistence.*;

@Entity
@Table(name="sucursales")
public class Sucursal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pk_SucursalID;

    @Column(name="nameSucursal", nullable= false, length=50)
    private String nameSucursal;

    @Column(name="paisSucursal", nullable= false, length=50)
    private String paisSucursal;

    public Integer getPk_SucursalID() {
        return pk_SucursalID;
    }

    public void setPk_SucursalID(Integer pk_SucursalID) {
        this.pk_SucursalID = pk_SucursalID;
    }

    public String getNameSucursal() {
        return nameSucursal;
    }

    public void setNameSucursal(String nameSucursal) {
        this.nameSucursal = nameSucursal;
    }

    public String getPaisSucursal() {
        return paisSucursal;
    }

    public void setPaisSucursal(String paisSucursal) {
        this.paisSucursal = paisSucursal;
    }
}
