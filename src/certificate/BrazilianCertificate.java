package certificate;

public class BrazilianCertificate implements Certificate {
    @Override
    public String applyCertification() {
        return "\t- Calibrating Brazilian rules\n\t- Applying in Anatel Stamp";
    }
}
