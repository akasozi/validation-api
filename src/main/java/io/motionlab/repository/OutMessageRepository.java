package io.motionlab.repository;

import org.springframework.data.repository.CrudRepository;

import io.motionlab.model.OutMessage;

public interface OutMessageRepository extends CrudRepository<OutMessage, Long> {

}
