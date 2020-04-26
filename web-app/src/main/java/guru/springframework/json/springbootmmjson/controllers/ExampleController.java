package guru.springframework.json.springbootmmjson.controllers;

import guru.springframework.json.model.ShippingAddress;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project spring-boot-mm-json
 * Created by @Author Parinit on 4/26/2020
 * at 8:33 PM
 */
@RestController
public class ExampleController {

    @RequestMapping("/")
    public ShippingAddress getShippingAddress() {

        return new ShippingAddress();
    }
}