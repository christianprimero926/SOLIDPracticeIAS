package software.ias.training.api.controller;

import software.ias.training.api.model.ServiceReport;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class ServiceController {
    @PostMapping
    public void storeServiceReport(@RequestBody ServiceReport report){
        System.out.println("report = " + report);
    }
}
