package com.noovitec.mpb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.noovitec.mpb.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Long> {
}