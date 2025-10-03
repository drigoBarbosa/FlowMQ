package com.drigoBarbosa.flowmq.client.controller;

import com.drigoBarbosa.flowmq.client.model.entity.Client;
import com.drigoBarbosa.flowmq.client.service.ClientService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

    ClientService clientService;

    ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("create")
    public Client createClient(Client client) {
        return clientService.createClient(client);
    }


}
