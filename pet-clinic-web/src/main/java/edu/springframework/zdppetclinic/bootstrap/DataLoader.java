package edu.springframework.zdppetclinic.bootstrap;

import edu.springframework.zdppetclinic.model.Owner;
import edu.springframework.zdppetclinic.model.Vet;
import edu.springframework.zdppetclinic.services.OwnerService;
import edu.springframework.zdppetclinic.services.VetService;
import edu.springframework.zdppetclinic.services.map.OwnerServiceMap;
import edu.springframework.zdppetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Loads initial data to MapServices
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Zach");
        owner1.setLastName("Smith");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Zach");
        owner2.setLastName("Smith");

        ownerService.save(owner2);

        Vet owner3 = new Vet();
        owner3.setFirstName("Zach");
        owner3.setLastName("Smith");

        vetService.save(owner3);

        Vet owner4 = new Vet();
        owner4.setFirstName("Zach");
        owner4.setLastName("Smith");

        vetService.save(owner4);

    }
}
