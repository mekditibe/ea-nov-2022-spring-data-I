package edu.miu.springConnData.Controller;

import edu.miu.springConnData.Entity.Address;
import edu.miu.springConnData.Service.AddressImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/address")
@RestController
public class AddressController {

    @Autowired
    private AddressImpl addressImpl;

    @GetMapping
    public List<Address> getAllAddress(){
        return addressImpl.getAllAddress();
    }
    @GetMapping("/{Id}")
    public Address getAddress(@PathVariable Long Id){
        return addressImpl.getAddress(Id);
    }

    @DeleteMapping("/{Id}")
    public void deleteAddress(@PathVariable Long Id){
        addressImpl.deleteAddress(Id);
    }

    @PostMapping
    public void  addAddress(@RequestBody Address address){
        addressImpl.saveAddress(address);
    }


}
