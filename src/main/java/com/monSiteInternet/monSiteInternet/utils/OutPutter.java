package com.monSiteInternet.monSiteInternet.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.monSiteInternet.monSiteInternet.entities.Animal;
import com.monSiteInternet.monSiteInternet.repositories.AnimalDao;


@Component
public class OutPutter implements CommandLineRunner {
	
	private Logger LOG = LoggerFactory.getLogger("Wilder");

	@Autowired
    private AnimalDao animalDao;
	
    @Override
    public void run(String... args) throws Exception {

      
        LOG.info("******************");
        LOG.info("Objects in DB : " + animalDao.count());

        // Crée un nouvel utilisateur et l'enregistre dans la BDD
        Animal animal1 = new Animal("Franck", "Chien", 2, 7);
        animalDao.save(animal1);
        
        // Crée un second utilisateur et l'enregistre dans la BDD
        Animal animal2 = new Animal("Julien", "Mouton");
        animalDao.save(animal2);
        
        // Crée un nouvel utilisateur et l'enregistre dans la BDD
        Animal animal3 = new Animal("Zak", "Chien");
        animalDao.save(animal3);
        
        // Crée un second utilisateur et l'enregistre dans la BDD
        Animal animal4 = new Animal("Alexandre", "Panda", 4, 13 );
        animalDao.save(animal4);
        
        LOG.info("******************");
        LOG.info("Users in list are ");
        for(Animal myUser : animalDao.findAll()) {
            LOG.info(myUser.toString());
            };

        
     // Supprime le 3eme utilisateur de la BDD
        animalDao.deleteById(3L); 


        LOG.info("******************");
        LOG.info("Users in list are ");
        for(Animal myUser : animalDao.findAll()) {
        LOG.info(myUser.toString());
        };
        
        animal1.setName("Eliott");
        animal1.setRace("Extra-terrestre");
        animal1.setAge(20);
        animalDao.save(animal1);
        
        LOG.info("******************");
        LOG.info("Users in list are ");
        for(Animal myUser : animalDao.findAll()) {
            LOG.info(myUser.toString());
            };
    }   

}
