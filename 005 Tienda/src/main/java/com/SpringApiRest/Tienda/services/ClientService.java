package com.SpringApiRest.Tienda.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.SpringApiRest.Tienda.entities.Client;
import com.SpringApiRest.Tienda.entities.ClientDTO;
import com.SpringApiRest.Tienda.exceptions.MyException;
import com.SpringApiRest.Tienda.mapping.ClientDTOConverter;
import com.SpringApiRest.Tienda.repositories.ClientRepository;

@Service
public class ClientService {
    
    @Autowired
    private ClientRepository clientRepo;

    @Transactional
    public void crearCliente(String nombreCompleto, String eMail, Long telefono) throws MyException{
        validarLong(telefono);
        validarString(eMail);
        validarString(nombreCompleto);
        Client cliente = new Client();
        cliente.setNombreCompleto(nombreCompleto);
        cliente.setTelefono(telefono);
        cliente.seteMail(eMail);
        clientRepo.save(cliente);
    }

    //validar dato tipo Long
    public void validarLong(Long dato) throws MyException{
        if (dato == null){
            throw new MyException("El dato no puede ser nulo");
        }
    }

    //validar dato tipo String
    public void validarString(String dato) throws MyException{
        if (dato.isEmpty()){
            throw new MyException("El dato no puede ser nulo");
        }
    }

    //Mapping de converters
    @Autowired
    private ClientDTOConverter clientDTOConverter;

    public ClientDTO getClientDTO(Client client) {
        return clientDTOConverter.convert(client);
    }

    public Client getClient(ClientDTO clientDTO) {
        return clientDTOConverter.getClient(clientDTO);
    }

    public List<Client> getAllClients() {
        return null;
    }

}
