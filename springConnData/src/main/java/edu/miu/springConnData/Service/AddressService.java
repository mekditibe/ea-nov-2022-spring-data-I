package edu.miu.springConnData.Service;

import edu.miu.springConnData.Entity.Address;

import java.util.List;

public interface AddressService {

    List<Address> getAllAddress();
    Address getAddress(Long Id);
    void deleteAddress(Long Id);
    void saveAddress(Address address);
}
