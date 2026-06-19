package com.idoceb00.marketsimulator.users.infrastructure.persistence;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;

@DataJpaTest
class UserJpaRepositoryTest {

  @Autowired private UserJpaRepository userJpaRepository;

  @Test
  void saveAndFindById() {
    // TODO: save a UserJpaEntity, find by id, assert it exists
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @Test
  void findAllReturnsPagedResults() {
    // TODO: save multiple entities, findAll with Pageable, assert pagination
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @Test
  void deleteByIdRemovesEntity() {
    // TODO: save entity, delete by id, assert not present
    throw new UnsupportedOperationException("Not yet implemented");
  }
}
