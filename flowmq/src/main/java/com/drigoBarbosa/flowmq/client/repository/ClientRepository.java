package com.drigoBarbosa.flowmq.client.repository;

import com.drigoBarbosa.flowmq.client.model.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ClientRepository extends JpaRepository<Client, UUID> {

    Client save(Client client);

}
