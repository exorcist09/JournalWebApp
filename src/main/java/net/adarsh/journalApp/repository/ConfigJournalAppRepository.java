package net.adarsh.journalApp.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import net.adarsh.journalApp.entity.ConfigJournalAppEntity;
import net.adarsh.journalApp.entity.User;

public interface ConfigJournalAppRepository extends MongoRepository<ConfigJournalAppEntity, ObjectId> {

}
