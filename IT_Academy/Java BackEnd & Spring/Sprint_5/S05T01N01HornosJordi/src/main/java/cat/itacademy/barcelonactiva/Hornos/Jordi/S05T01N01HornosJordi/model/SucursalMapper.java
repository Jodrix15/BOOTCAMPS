package cat.itacademy.barcelonactiva.Hornos.Jordi.S05T01N01HornosJordi.model;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
@Mapper
public interface SucursalMapper {
    SucursalMapper MAPPER = Mappers.getMapper(SucursalMapper.class);

    @Mapping(source = "pk_SucursalID", target = "id")
    SucursalDTO sucursal2DTO(Sucursal sucursal);

    @Mapping(source = "id", target = "pk_SucursalID")
    Sucursal DTO2Sucursal(SucursalDTO sucursalDTO);


    @AfterMapping
    default void setSucursalTipo(@MappingTarget SucursalDTO sucursalDTO, Sucursal sucursal){
        sucursalDTO.setTipoSucursal(sucursalDTO.getPaisSucursal());
    }
}
