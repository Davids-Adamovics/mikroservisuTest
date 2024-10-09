package lv.venta;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lv.venta.model.Atlaide;
import lv.venta.model.Veikals_kategorijas;
import lv.venta.model.Veikals_prece;
import lv.venta.repo.IAtlaideRepo;
import lv.venta.repo.IPreceRepo;
import lv.venta.repo.IVeikalsKategorijasRepo;

@SpringBootApplication
public class SparniShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SparniShopApplication.class, args);
    }

    @Bean
    public CommandLineRunner testDatabase(IAtlaideRepo atlaideRepo, IPreceRepo preceRepo,
            IVeikalsKategorijasRepo veikalsKategorijasRepo) {
        return new CommandLineRunner() {

            @Override
            public void run(String... args) throws Exception {

                Atlaide a1 = new Atlaide(70, LocalDateTime.of(2024, 05, 10, 15, 30),
                        LocalDateTime.of(2024, 05, 15, 15, 31));
                atlaideRepo.save(a1);
                Atlaide a2 = new Atlaide(50, LocalDateTime.of(2024, 05, 10, 15, 30),
                        LocalDateTime.of(2024, 05, 15, 15, 31));
                atlaideRepo.save(a2);
                Atlaide a3 = new Atlaide(50, LocalDateTime.of(2024, 05, 10, 15, 30),
                        LocalDateTime.of(2024, 05, 15, 15, 31));
                atlaideRepo.save(a3);
                Atlaide a4 = new Atlaide(50, LocalDateTime.of(2024, 05, 10, 15, 30),
                        LocalDateTime.of(2024, 05, 15, 15, 31));
                atlaideRepo.save(a4);


                Veikals_prece prece1 = new Veikals_prece(
                        "Pilnīgs Gaļaks Cepure", // nosaukums
                        "100% cotton", // apraksts
                        74, // daudzums
                        19.99f, // cena
                        null, // pirkums_Elements
                        null, // veikals_kategorijas
                        "https://printtoo.com/cdn/shop/files/pilnigsgalaks-melnaziemascepure.png?v=1705062180&width=640", // veikals_prece_bildes
                        null // idAtlaide
                );
                preceRepo.save(prece1);

                Veikals_prece prece2 = new Veikals_prece(
                        "Darba cimdi ECO", // nosaukums
                        "Labi darba cimdi", // apraksts
                        50, // daudzums
                        7.99f, // cena
                        null, // pirkums_Elements
                        null, // veikals_kategorijas
                        "https://www.gandrs.lv/content/items/2024-01/cimdi-yaras-warm-gloves-2000x1400.jpg", // veikals_prece_bildes
                        null // idAtlaide
                );
                preceRepo.save(prece2);

                Veikals_prece prece3 = new Veikals_prece(
                        "Ŗudens Šalle", // nosaukums
                        "Laba rudens šalle", // apraksts
                        20, // daudzums
                        25.99f, // cena
                        null, // pirkums_Elements
                        null, // veikals_kategorijas
                        "https://milbaza.lv/wp-content/uploads/2022/12/eng_pl_Mil-Tec-Shemagh-Scarf-Skull-Coyote-19103_1.jpg", // veikals_prece_bildes
                        null // idAtlaide
                );

                preceRepo.save(prece3);
                Veikals_prece prece4 = new Veikals_prece(
                        "Aproce Latvija", // nosaukums
                        "Laba aproce", // apraksts
                        100, // daudzums
                        2.99f, // cena
                        null, // pirkums_Elements
                        null, // veikals_kategorijas
                        "https://visivar.lv/cdn/shop/products/EJP_7173._Visi_var_jpg_1024x1024.jpg?v=1635360889", // veikals_prece_bildes
                        null // idAtlaide
                );
                preceRepo.save(prece4);

                Veikals_prece prece5 = new Veikals_prece(
                        "Dzintars S izmērs", // nosaukums
                        "Labi saglabājies, apstrādāts dzintars", // apraksts
                        3, // daudzums
                        7.00f, // cena
                        null, // pirkums_Elements
                        null, // veikals_kategorijas
                        "https://pic.latvijasradio.lv/public/assets/media/f/9/mlarge_5ca30e1d.jpg", // veikals_prece_bildes
                        null // idAtlaide
                );
                preceRepo.save(prece5);

                Veikals_prece prece6 = new Veikals_prece(
                        "Koka pulkstenis #7", // nosaukums
                        "Amatnieku veidots koka pulkstenis", // apraksts
                        1, // daudzums
                        24.99f, // cena
                        null, // pirkums_Elements
                        null, // veikals_kategorijas
                        "https://www.parsteigumuagentura.lv/assets/images/Klasisks%20koka%20sienas%20pulkstenis%20ar%20grav%C4%93jumu%20nr.3.png", // veikals_prece_bildes
                        null // idAtlaide
                );
                preceRepo.save(prece6);

                Veikals_prece prece7 = new Veikals_prece(
                        "Adīts spilvens", // nosaukums
                        "100% vilnas spilvens", // apraksts
                        20, // daudzums
                        25.99f, // cena
                        null, // pirkums_Elements
                        null, // veikals_kategorijas
                        "https://lv2.pigugroup.eu/colours/132/252/69/13225269/spilvenu-spilvendranas-ar-rokam-adita-dizaina-3e906_reference.jpg", // veikals_prece_bildes
                        null // idAtlaide
                );
                preceRepo.save(prece7);

                // Veikals kategorijas
                Veikals_kategorijas kategorijas1 = new Veikals_kategorijas(
                        "Electronics", // nosaukums
                        "Electronic gadgets" // apraksts
                );

                veikalsKategorijasRepo.save(kategorijas1);

                Veikals_kategorijas kategorijas2 = new Veikals_kategorijas(
                        "Clothing", // nosaukums
                        "Fashion apparel" // apraksts
                );
                veikalsKategorijasRepo.save(kategorijas2);

                Veikals_kategorijas kategorijas3 = new Veikals_kategorijas(
                        "Books", // nosaukums
                        "Literary works" // apraksts
                );
                veikalsKategorijasRepo.save(kategorijas3);

                Veikals_kategorijas kategorijas4 = new Veikals_kategorijas(
                        "Home Decor", // nosaukums
                        "Interior furnishings" // apraksts
                );
                veikalsKategorijasRepo.save(kategorijas4);

            }
        };

    }
}
