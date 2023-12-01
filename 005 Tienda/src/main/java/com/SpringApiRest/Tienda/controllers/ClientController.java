package com.SpringApiRest.Tienda.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.SpringApiRest.Tienda.entities.Client;
import com.SpringApiRest.Tienda.entities.ClientDTO;
import com.SpringApiRest.Tienda.exceptions.MyException;
import com.SpringApiRest.Tienda.services.ClientService;

@RestController
@RequestMapping("/clientes")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public List<ClientDTO> getAllClients() {
        List<Client> clients = clientService.getAllClients();
        List<ClientDTO> clientDTOs = new ArrayList();

        for (Client client : clients) {
            ClientDTO clientDTO = clientService.getClientDTO(client);
            clientDTOs.add(clientDTO);
        }

        return clientDTOs;
    }

    @GetMapping("/{id}")
    public ClientDTO getClientById(@PathVariable Long id) {
        Client client = clientService.getClientById(id);
        if (client == null) {
            throw new MyException("Cliente no encontrado con id: " + id);
        }

        return clientService.getClientDTO(client);
    }

    @PostMapping
    public void createClient(@RequestBody ClientDTO clientDTO) throws MyException {
        clientService.crearCliente(clientDTO.getNombreCompleto(), clientDTO.geteMail(), clientDTO.getTelefono());
    }

    @PutMapping("/{id}")
    public void updateClient(@PathVariable Long id, @RequestBody ClientDTO clientDTO) throws MyException {
        Client client = clientService.getClientById(id);
        if (client == null) {
            throw new MyException("Cliente no encontrado con id: " + id);
        }

        client.setNombreCompleto(clientDTO.getNombreCompleto());
        client.seteMail(clientDTO.geteMail());
        client.setTelefono(clientDTO.getTelefono());

        clientService.saveClient(client);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id) {
        Client client = clientService.getClientById(id);
        if (client == null) {
            throw new MyException("Cliente no encontrado con id: " + id);
        }

        clientService.deleteClient(client);
    }
}
