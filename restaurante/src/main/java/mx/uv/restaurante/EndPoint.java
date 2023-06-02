package mx.uv.restaurante;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import https.t4is_uv_mx.usuario.UsuarioResponse;
import https.t4is_uv_mx.usuario.UsuarioRequest;
import https.t4is_uv_mx.usuario.BuscarIdResponse;
import https.t4is_uv_mx.usuario.ModificarUsuarioResponse;
import https.t4is_uv_mx.usuario.ModificarUsuarioRequest;
import https.t4is_uv_mx.usuario.EliminarUsuarioRequest;
import https.t4is_uv_mx.usuario.EliminarUsuarioResponse;

@Endpoint
public class EndPoint {
    @Autowired
    private Usuarios usuarios;
    @PayloadRoot(localPart = "UsuarioRequest", namespace = "https://t4is.uv.mx/usuario")
    

    @ResponsePayload
    public UsuarioResponse Empleado(@RequestPayload UsuarioRequest peticion){
        UsuarioResponse response = new UsuarioResponse();
        response.setRespuesta("Se ha registrado: " + peticion.getNombre()+" "+"Con rol: "+peticion.getRol());
        
       
        Usuario usuario = new Usuario();
        usuario.setNombre(peticion.getNombre());
        usuario.setRol(peticion.getRol());
        usuario.setCorreo(peticion.getCorreo());
        usuario.setPassword(peticion.getPassword());
        
        usuarios.save(usuario);
        
        
  
        return response;
    }

    @PayloadRoot(localPart = "BuscarIdRequest" ,namespace = "https://t4is.uv.mx/usuario")
    @ResponsePayload
    public BuscarIdResponse buscarEmpleado(){
        BuscarIdResponse respuesta = new BuscarIdResponse();
        Iterable<Usuario> lista= usuarios.findAll();
       
        
        for (Usuario usuario : lista) {
            BuscarIdResponse.Usuarios e = new BuscarIdResponse.Usuarios();
            e.setNombre(usuario.getNombre());
            
            e.setId(usuario.getId());
            e.setNombre(usuario.getNombre());
            e.setRol(usuario.getRol());
            respuesta.getUsuarios().add(e);
        }
        return respuesta;
    }

    @PayloadRoot(localPart = "ModificarUsuarioRequest" ,namespace = "https://t4is.uv.mx/usuario")
    @ResponsePayload
    public ModificarUsuarioResponse modificarEmpleado(@RequestPayload ModificarUsuarioRequest peticion){       
        ModificarUsuarioResponse respuesta = new ModificarUsuarioResponse(); 
        Usuario usuario = new Usuario();
        usuario.setId(peticion.getId());
        usuario.setNombre(peticion.getNombre());
        usuario.setPassword(peticion.getPassword());
        usuario.setCorreo(peticion.getCorreo());
        usuario.setRol(peticion.getRol());
        usuarios.save(usuario);
        respuesta.setRespuesta("El Usuario ha sido modificado");        
        return respuesta;
    }

    @PayloadRoot(localPart = "EliminarUsuarioRequest", namespace = "https://t4is.uv.mx/usuario")
    @ResponsePayload
    public EliminarUsuarioResponse eliminarUsuario(@RequestPayload EliminarUsuarioRequest peticion){
        EliminarUsuarioResponse respuesta = new EliminarUsuarioResponse();
        usuarios.deleteById(peticion.getId());
        respuesta.setRespuesta("Usuario eliminado");
        return respuesta;
    }

}