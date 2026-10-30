package Models;
import java.sql.Date;

public class Adestrador_model {
    int id;
    String Nome;
    Date Nacemento;

    public Adestrador_model(Date nacemento, String nome) {
        Nacemento = nacemento;
        Nome = nome;
    }

    public Adestrador_model(int id, Date nacemento, String nome) {
        this.id = id;
        Nacemento = nacemento;
        Nome = nome;
    }

    public int getId() {
        return id;
    }

    public Date getNacemento() {
        return Nacemento;
    }

    public String getNome() {
        return Nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNacemento(Date nacemento) {
        Nacemento = nacemento;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
}
