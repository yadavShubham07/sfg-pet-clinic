package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.service.OwnerService;
import guru.springframework.sfgpetclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {

        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    @Override
    public void run(String... args) throws Exception {
        Owner owner = new Owner();
        owner.setFirstName("Shubham");
        owner.setLastName("yadav");
       // owner.setId(1L);

        ownerService.save(owner);
        System.out.println("Owners Loaded");
        Vet vet = new Vet();
       // vet.setId(2l);
        vet.setFirstName("Sam");
        vet.setLastName("Taylor");

        vetService.save(vet);
        System.out.println("Vet details Loaded");



    }
}
