package com.SpringApiRest.Tienda.mapping;

import com.SpringApiRest.Tienda.entities.Client;
import com.SpringApiRest.Tienda.entities.ClientDTO;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class ClientDTOConverter implements org.springframework.core.convert.converter.Converter<Client, ClientDTO> {

    @Override
    public ClientDTO convert(Client client) {
        if (client == null) {
            return null;
        }

        ClientDTO clientDTO = new ClientDTO();
        clientDTO.setDni(client.getDni());
        clientDTO.setNombreCompleto(client.getNombreCompleto());
        clientDTO.setTelefono(client.getTelefono());
        clientDTO.seteMail(client.geteMail());
        return clientDTO;
    }

    public Client getClient(ClientDTO clientDTO) {
        Client client = new Client();
        client.setDni(clientDTO.getDni());
        client.setNombreCompleto(clientDTO.getNombreCompleto());
        client.setTelefono(clientDTO.getTelefono());
        client.seteMail(clientDTO.geteMail());
        return client;
    }
}