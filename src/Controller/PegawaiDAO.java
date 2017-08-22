/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Pegawai;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Lukas
 */
public class PegawaiDAO 
{

    EntityManager em;

    public PegawaiDAO() 
    {
        em = Koneksi.getEntityManager();
    }

    public List<Pegawai> getPegawai() 
    {
        return em.createQuery("SELECT m FROM Pegawai m").getResultList();
    }

    public void insertPegawai(Pegawai m) 
    {
        try 
        {
            em.getTransaction().begin();
            em.persist(m);
            em.getTransaction().commit();
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    public void updatePegawai(Pegawai m) 
    {
        try 
        {
            em.getTransaction().begin();
            em.merge(m);
            em.getTransaction().commit();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    public void deletePegawai(Long kodePegawai) 
    {
        try 
        {
            em.getTransaction().begin();
            em.createQuery("DELETE FROM Pegawai m WHERE m.kodePegawai = :KodePegawai")
                    .setParameter("KodePegawai", kodePegawai).executeUpdate();
            em.getTransaction().commit();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    public Pegawai getPegawaiByKode(String kodePegawai)
    {
        return (Pegawai) em.createQuery
        ("SELECT m FROM Pegawai m WHERE m.kodePegawai ="+kodePegawai)
                .getSingleResult();
    }
}
