package edu.springframework.zdppetclinic.bootstrap;

import edu.springframework.zdppetclinic.model.Owner;
import edu.springframework.zdppetclinic.model.Person;
import edu.springframework.zdppetclinic.model.Vet;
import edu.springframework.zdppetclinic.services.OwnerService;
import edu.springframework.zdppetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Loads initial data to MapServices
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
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
        owner2.setFirstName("Alison");
        owner2.setLastName("Prenatt");

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet owner3 = new Vet();
        owner3.setFirstName("Zachary");
        owner3.setLastName("Smith");

        vetService.save(owner3);

        Vet owner4 = new Vet();
        owner4.setFirstName("Zach. D");
        owner4.setLastName("Smith");

        vetService.save(owner4);

        List<Vet> bootstrapVets = Arrays.asList(owner3, owner4);

        System.out.println("Loaded Vets....");
    }
}
