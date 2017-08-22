/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Lukas
 */
@Entity
public class Barang implements Serializable 
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long kodeBarang;
    private String namaBarang;
    private Long hargaBarang;
    private Long stokBarang;

    public Long getId() 
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getKodeBarang()
    {
        return kodeBarang;
    }

    public void setKodeBarang(Long kodeBarang) 
    {
        this.kodeBarang = kodeBarang;
    }
    
    public String getNamaBarang()
    {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) 
    {
        this.namaBarang = namaBarang;
    }

    public Long getHargaBarang() 
    {
        return hargaBarang;
    }

    public void setHargaBarang(Long hargaBarang) 
    {
        this.hargaBarang = hargaBarang;
    }

    public Long getStokBarang() 
    {
        return stokBarang;
    }

    public void setStokBarang(Long stokBarang) 
    {
        this.stokBarang = stokBarang;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Barang)) 
        {
            return false;
        }
        Barang other = (Barang) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) 
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString() 
    {
        return "Model.Barang[ id=" + id + " ]";
    }
    
}

