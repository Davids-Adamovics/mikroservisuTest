package lv.venta.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "PASAKUMI_TABLE")
@Entity
public class Pasakumi {

    @Id
    @Column(name = "ID_Pasakumi")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter(value = AccessLevel.NONE)
    private int idPasakumi;  // Updated to use camelCase

    @ManyToOne
    @JoinColumn(name = "ID_Pasakumi_Kategorijas", referencedColumnName = "idpk")
    private Pasakumi_kategorijas idPasakumiKategorijas;

    @Column(name = "SAKUMA_DATUMS")
    private LocalDateTime sakumaDatums;

    @Column(name = "BEIGU_DATUMS")
    private LocalDateTime beiguDatums;

    @Column(name = "NOSAUKUMS")
    private String nosaukums;

    @Column(name = "LAIKS")
    private LocalDateTime laiks;

    @Column(name = "VIETA")
    private String vieta;

    @Column(name = "APRAKSTS")
    private String apraksts;

    @Column(name = "BILDES_URL")
    private String bildesUrl;

    public Pasakumi(LocalDateTime sakumaDatums, LocalDateTime beiguDatums, String nosaukums, LocalDateTime laiks,
                    String vieta, String apraksts, String bildesUrl) {
        setSakumaDatums(sakumaDatums);
        setBeiguDatums(beiguDatums);
        setNosaukums(nosaukums);
        setLaiks(laiks);
        setVieta(vieta);
        setApraksts(apraksts);
        setBildesUrl(bildesUrl);
    }
}
