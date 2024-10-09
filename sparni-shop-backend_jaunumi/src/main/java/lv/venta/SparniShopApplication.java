package lv.venta;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lv.venta.model.Pasakumi;
import lv.venta.repo.IPasakumiKategorijasRepo;
import lv.venta.repo.IPasakumiRepo;

@SpringBootApplication
public class SparniShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SparniShopApplication.class, args);
    }
    

    @Bean
    public CommandLineRunner testDatabase(IPasakumiRepo pasakumiRepo,
            IPasakumiKategorijasRepo pasakumiKategorijasRepo
            ) {
        return new CommandLineRunner() {

            @Override
            public void run(String... args) throws Exception {

                // Pasakumi
                Pasakumi pasakumi1 = new Pasakumi(
                        LocalDateTime.of(2024, 6, 30, 18, 0), // sakumaDatums
                        LocalDateTime.of(2024, 6, 30, 20, 0), // beiguDatums
                        "Summer Concert", // nosaukums
                        LocalDateTime.of(2024, 6, 30, 19, 0), // laiks
                        "Riga Concert Hall", // vieta
                        "Join us for an evening of music!", // apraksts
                        "https://oak-islandnc.com/wp-content/uploads/2020/06/Oak-Island-Summer-Concerts.jpg" // bildesUrl
                );
                pasakumiRepo.save(pasakumi1);
                Pasakumi pasakumi2 = new Pasakumi(
                        LocalDateTime.of(2024, 7, 15, 19, 30), // sakumaDatums
                        LocalDateTime.of(2024, 7, 15, 22, 0), // beiguDatums
                        "Summer Jazz Night", // nosaukums
                        LocalDateTime.of(2024, 7, 15, 20, 0), // laiks
                        "Riga Jazz Club", // vieta
                        "Enjoy an evening of smooth jazz melodies!", // apraksts
                        "https://media-cdn.tripadvisor.com/media/photo-s/10/21/7c/c3/pashkevich-jazz-club.jpg" // bildesUrl
                );
                pasakumiRepo.save(pasakumi2);
                Pasakumi pasakumi3 = new Pasakumi(
                        LocalDateTime.of(2024, 8, 5, 18, 0), // sakumaDatums
                        LocalDateTime.of(2024, 8, 5, 21, 0), // beiguDatums
                        "Art Exhibition", // nosaukums
                        LocalDateTime.of(2024, 8, 5, 19, 0), // laiks
                        "Riga Art Gallery", // vieta
                        "Explore captivating artworks by local artists.", // apraksts
                        "https://cdn11.bigcommerce.com/s-81oa1bc/images/stencil/1600x700/t/print%20decor%20gallery%2020__22187.original.jpg" // bildesUrl
                );
                pasakumiRepo.save(pasakumi3);
                Pasakumi pasakumi4 = new Pasakumi(
                        LocalDateTime.of(2024, 9, 10, 17, 0), // sakumaDatums
                        LocalDateTime.of(2024, 9, 10, 21, 0), // beiguDatums
                        "Food Festival", // nosaukums
                        LocalDateTime.of(2024, 9, 10, 18, 0), // laiks
                        "Riga Central Park", // vieta
                        "Savor delicious dishes from around the world!", // apraksts
                        "https://us.123rf.com/450wm/ynos999/ynos9991909/ynos999190900126/142675619-city-riga-latvia-republic-riga-central-park-with-tourists-and-flowers-resting-place-18-aug-2019.jpg" // bildesUrl
                );
                pasakumiRepo.save(pasakumi4);

                Pasakumi pasakumi5 = new Pasakumi(
                        LocalDateTime.of(2024, 9, 10, 17, 0), // sakumaDatums
                        LocalDateTime.of(2024, 9, 10, 21, 0), // beiguDatums
                        "Zeķu adīšana", // nosaukums
                        LocalDateTime.of(2024, 9, 10, 18, 0), // laiks
                        "Majas", // vieta
                        "Stradajam un adam!", // apraksts
                        "https://gitaozola.wordpress.com/wp-content/uploads/2014/11/wpid-dsc_01172.jpg" // bildesUrl
                );
                pasakumiRepo.save(pasakumi5);

                Pasakumi pasakumi6 = new Pasakumi(
                        LocalDateTime.of(2024, 9, 10, 17, 0), // sakumaDatums
                        LocalDateTime.of(2024, 9, 10, 21, 0), // beiguDatums
                        "Maratons", // nosaukums
                        LocalDateTime.of(2024, 9, 10, 18, 0), // laiks
                        "Lemberga hūte", // vieta
                        "Skrienam daudz!", // apraksts
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRmPVsGwzGHhaZcq6c4xvoV8AzdoNa4G0bG5w&s" // bildesUrl
                );
                pasakumiRepo.save(pasakumi6);

                Pasakumi pasakumi7 = new Pasakumi(
                        LocalDateTime.of(2024, 9, 10, 17, 0), // sakumaDatums
                        LocalDateTime.of(2024, 9, 10, 21, 0), // beiguDatums
                        "Pikniks", // nosaukums
                        LocalDateTime.of(2024, 9, 10, 18, 0), // laiks
                        "Plava", // vieta
                        "Ēdam!", // apraksts
                        "https://www.greatbritishfoodawards.com/assets/images/main/picnic_photo.jpg" // bildesUrl
                );
                pasakumiRepo.save(pasakumi7);

                Pasakumi pasakumi8 = new Pasakumi(
                        LocalDateTime.of(2024, 9, 10, 17, 0), // sakumaDatums
                        LocalDateTime.of(2024, 9, 10, 21, 0), // beiguDatums
                        "Radošās darbnīcas", // nosaukums
                        LocalDateTime.of(2024, 9, 10, 18, 0), // laiks
                        "Plava", // vieta
                        "Radoši darbi ar zeķēm!", // apraksts
                        "https://altona.riga.lv/wp-content/uploads/2022/10/Meistarklases_2.jpg" // bildesUrl
                );
                pasakumiRepo.save(pasakumi8);

            }
        };

    }
}
