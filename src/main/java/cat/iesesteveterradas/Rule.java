package cat.iesesteveterradas;

public class Rule {
    private String nom;
    private int port;
    private String tipus;
    private String aplicacio;
    private String usuari;
    private String direccioIP;
    private String accio;
    private String interficie;
    private String sentit;

    // Constructor
    public Rule(String nom, int port, String tipus, String aplicacio, String usuari, String direccioIP, String accio, String interficie, String sentit) {
        this.nom = nom;
        this.port = port;
        this.tipus = tipus;
        this.aplicacio = aplicacio;
        this.usuari = usuari;
        this.direccioIP = direccioIP;
        this.accio = accio;
        this.interficie = interficie;
        this.sentit = sentit;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public int getPort() {
        return port;
    }

    public String getTipus() {
        return tipus;
    }

    public String getAplicacio() {
        return aplicacio;
    }

    public String getUsuari() {
        return usuari;
    }

    public String getDireccioIP() {
        return direccioIP;
    }

    public String getAccio() {
        return accio;
    }

    public String getInterficie() {
        return interficie;
    }

    public String getSentit() {
        return sentit;
    }

    // Setters (si es necessari)

    // Altres mètodes, com validació de dades, es poden afegir segons sigui necessari
}
