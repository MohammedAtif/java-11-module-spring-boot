package com.module.one.UserDataRepository;

import com.module.one.models.UserData;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserDataRepository extends CrudRepository<UserData, Long> {

}
