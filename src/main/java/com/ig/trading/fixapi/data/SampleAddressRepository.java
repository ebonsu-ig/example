package com.ig.trading.fixapi.data;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SampleAddressRepository
        extends
            JpaRepository<SampleAddress, Long>,
            JpaSpecificationExecutor<SampleAddress> {

}
