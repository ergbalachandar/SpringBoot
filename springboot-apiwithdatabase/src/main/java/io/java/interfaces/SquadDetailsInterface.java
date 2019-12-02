package io.java.interfaces;

import org.springframework.data.repository.CrudRepository;

import io.java.dto.SquadDetails;

public interface SquadDetailsInterface extends CrudRepository<SquadDetails, String> {

}
