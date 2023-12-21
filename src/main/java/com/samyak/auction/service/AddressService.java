package com.samyak.auction.service;

import com.samyak.auction.domain.Address;
import com.samyak.auction.domain.User;
import com.samyak.auction.dto.AddressInfo;
import com.samyak.auction.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Optional;
import java.util.UUID;

@Service
public class AddressService implements IAddress {

    @Autowired
    private AddressRepository addressRepository;

    public void service() {
        
    }

    public void save(AddressInfo addressRequest, User user) {
        long currentTimestampMillis = System.currentTimeMillis();
        Address address = new Address();
        address.setCity(addressRequest.getCity());
        address.setContry(addressRequest.getCountry());
        address.setHouseNo(addressRequest.getHouseNo());
        address.setCreated(new Timestamp(currentTimestampMillis));
        address.setUserId(user.getUserId());
        address.setZipcode(addressRequest.getZipcode());
        address.setAddressId(UUID.randomUUID());
        address.setState(addressRequest.getState());
        address.setType(addressRequest.getType());
        address.setCreateBy("System");
        address.setUpdateBy("System");
        address.setActive(true);
        address.setUpdated(new Timestamp(currentTimestampMillis));
        addressRepository.save(address);
    }

    public Optional<Address> getAddressByUserId(UUID userId) {
        return addressRepository.getAddressByUserId(userId);
    }
}
