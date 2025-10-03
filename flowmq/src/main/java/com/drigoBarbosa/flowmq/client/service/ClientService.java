package com.drigoBarbosa.flowmq.client.service;

import com.drigoBarbosa.flowmq.client.model.entity.Client;
import com.drigoBarbosa.flowmq.client.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    ClientRepository clientRepository;

    ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

}
