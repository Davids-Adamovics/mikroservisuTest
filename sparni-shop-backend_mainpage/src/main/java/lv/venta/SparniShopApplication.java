package lv.venta;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import lv.venta.model.Kontakti;
import lv.venta.model.MainPage_BiedribaDarbojas;
import lv.venta.repo.IKontaktiRepo;
import lv.venta.repo.IMainPageBiedribasDarbojasRepo;

@SpringBootApplication
public class SparniShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SparniShopApplication.class, args);
    }

    @Bean
    public CommandLineRunner testDatabase(IKontaktiRepo kontaktiRepo,
            IMainPageBiedribasDarbojasRepo mainPageBiedribaDarbojasRepo) {
        return new CommandLineRunner() {

            @Override
            public void run(String... args) throws Exception {


                // Kontakti
                Kontakti kontakt1 = new Kontakti("VentiņPūrlād", "\r\n"
                        + //
                        "Skolas iela 3, Ventspils, Latvia , LV-3601 \r\n"
                );
                kontaktiRepo.save(kontakt1);
                
                Kontakti kontakt2 = new Kontakti("Darba laiks ",
                        "Pirmdiena\r\n"
                        + //
                        "Nestrādā/Aizvērts\r\n"
                        + //
                        "Otrdiena\r\n"
                        + //
                        "10:00 - 18:00\r\n"
                        + //
                        "Trešdiena\r\n"
                        + //
                        "10:00 - 18:00\r\n"
                        + //
                        "Ceturtdiena\r\n"
                        + //
                        "10:00 - 18:00\r\n"
                        + //
                        "Piektdiena\r\n"
                        + //
                        "10:00 - 17:00\r\n"
                        + //
                        "Sestdiena\r\n"
                        + //
                        "10:00 - 17:00\r\n"
                        + //
                        "Svētdiena\r\n"
                        + //
                        "Nestrādā/Aizvērts");
                kontaktiRepo.save(kontakt2);

				Kontakti kontakt3 = new Kontakti("Facebook", "https://www.facebook.com/Ventinpurlad/");
                kontaktiRepo.save(kontakt3);

                Kontakti kontakt4 = new Kontakti("E-pasts", "ventinpurlad@inbox.lv");
                kontaktiRepo.save(kontakt4);

                // MainPage_BiedribaDarbojas
                MainPage_BiedribaDarbojas biedribadarbojas1 = new MainPage_BiedribaDarbojas(null, null, 0);
                mainPageBiedribaDarbojasRepo.save(biedribadarbojas1);

                MainPage_BiedribaDarbojas biedribadarbojas2 = new MainPage_BiedribaDarbojas(null, null, 0);
                mainPageBiedribaDarbojasRepo.save(biedribadarbojas2);

                MainPage_BiedribaDarbojas biedribadarbojas3 = new MainPage_BiedribaDarbojas(null, null, 0);
                mainPageBiedribaDarbojasRepo.save(biedribadarbojas3);

                MainPage_BiedribaDarbojas biedribadarbojas4 = new MainPage_BiedribaDarbojas(null, null, 0);
                mainPageBiedribaDarbojasRepo.save(biedribadarbojas4);

            }
        };

    }
}
