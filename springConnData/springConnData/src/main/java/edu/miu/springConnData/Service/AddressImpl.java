package edu.miu.springConnData.Service;

import edu.miu.springConnData.Entity.Address;
import edu.miu.springConnData.Repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressImpl implements AddressService{

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public List<Address> getAllAddress() {
        return addressRepository.findAll();
    }

    @Override
    public Address getAddress(Long Id) {
        return addressRepository.findById(Id).get();
    }

    @Override
    public void deleteAddress(Long Id) {
        addressRepository.deleteById(Id);
    }

    @Override
    public void saveAddress(Address address) {
        addressRepository.save(address);
    }

    @Override
    public void updateAddress(Address address) {
        addressRepository.save(address);
    }
}
