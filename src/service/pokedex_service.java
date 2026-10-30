package service;
import Models.Pokemon_Model;
import org.hibernate.Session;
import org.hibernate.Transaction;
import Config.HibernateConfig;
import Models.pokedex_Model;

import java.util.List;

public class pokedex_service {
    public void crearpokedex(Integer id, String nome, String misc, double peso) {
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            pokedex_Model pokemon = new pokedex_Model();
            pokemon.setId(id);
            pokemon.setNome(nome);
            pokemon.setMisc(misc);
            pokemon.setPeso(peso);
            session.save(pokemon);
            transaction.commit();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void crearpokedexQuery(Integer id, String nome, String misc, double peso) {
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();            List<pokedex_Model> pokedex = session.createQuery("INSERT into Pokedex (nome,misc,peso) Value (?,?,?)", Gatos.class)
            pokedex_Model pokemon = new pokedex_Model();
            pokemon.setId(id);
            pokemon.setNome(nome);
            pokemon.setMisc(misc);
            pokemon.setPeso(peso);
            session.save(pokemon);
            transaction.commit();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }













    public void actualizarGato(pokedex_Model pokedex) {
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(pokedex);
            transaction.commit();
        } catch (Exception e) {
            System.out.println("Erro ao actualiza-lo gato: " + e.getMessage());
        }
    }


    public pokedex_Model lerPokedex(String nome) {
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            return session.get(pokedex_Model.class, nome);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return null;
        }
    }

    public void eliminarPokedex(Long id) {
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            pokedex_Model pokedex = session.get(pokedex_Model.class, id);
            if (pokedex != null) {
                session.delete(pokedex);
            } else {
                System.out.println("non se atopou a pokedex");
            }
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }








}
