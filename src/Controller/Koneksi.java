/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Lukas
 */
public class Koneksi
{
    private static EntityManagerFactory emf;
    
    public static EntityManager getEntityManager()
    {
        EntityManager em = null;
        try 
        {
            emf = Persistence.createEntityManagerFactory("TORM_672014094_IN316CPU");
            em = emf.createEntityManager();
        } 
        catch (Exception e) 
        {
            System.out.println("Gagal");
            e.printStackTrace();
        }
        return em;
    }
    
}
