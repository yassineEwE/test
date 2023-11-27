package tn.esprit.examenblancspring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@Slf4j
@EnableScheduling
@EnableAspectJAutoProxy
public class ExamenBlancSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExamenBlancSpringApplication.class, args);
    }

}
































//    @Scheduled(fixedRate = 20000)
//    public void fixedRateMethod() {
//        log.info("Method with fixed Rate");
//    }
//    @Scheduled(cron = "*/10 * * * * *" )
//    public void cronMethod() {
//        log.info("10 10 10 10 10 10");
//    }



































//    @Query("SELECT e FROM Entreprise e WHERE e.adresse =:adresse")
//    List<Entreprise> retrieveEntreprisesByAdresse(@Param("adresse") String adresse);