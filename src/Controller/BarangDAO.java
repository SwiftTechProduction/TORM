/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Barang;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Lukas
 */
public class BarangDAO 
{
    EntityManager em;
    
    public BarangDAO()
    {
        em = Koneksi.getEntityManager();
    }
    
    public List<Barang> getBarang()
    {
        return em.createQuery("SELECT m FROM Barang m").getResultList();
    }
    
    public void insertBarang(Barang m)
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
    
    public void updateBarang(Barang m)
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
    
    public void deleteBarang(Long kodeBarang) 
    {
        try 
        {
            em.getTransaction().begin();
            em.createQuery("DELETE FROM Barang m WHERE m.kodeBarang = :KodeBarang")
                .setParameter("KodeBarang", kodeBarang).executeUpdate();              
            em.getTransaction().commit();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public Barang getBarangByKode(String kodeBarang)
    {
        return (Barang) em.createQuery("SELECT m FROM Barang m WHERE m.kodeBarang ="+kodeBarang).getSingleResult();
    }
}