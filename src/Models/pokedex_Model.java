package Models;
import javax.persistence.*;

@Entity

@Table(name = "Pokedex")
public class pokedex_Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nome", nullable = false, length = 50)
    private String Nome;


    @Column(name = "misc")
    private String Misc;


    @Column(name = "peso", precision = 10, scale = 2)
    private double Peso;




    public int getId() {
        return id;
    }

    public String getMisc() {
        return Misc;
    }

    public double getPeso() {
        return Peso;
    }

    public String getNome() {
        return Nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMisc(String misc) {
        Misc = misc;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    @Override
    public String toString() {
        return "Gatos{" +
                "id=" + id +
                ", nome='" + Nome + '\'' +
                ", peso=" + Peso +
                ", Misc='" + Misc + '\'' +
                '}';
    }




}
