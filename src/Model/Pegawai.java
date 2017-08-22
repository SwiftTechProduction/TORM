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
public class Pegawai implements Serializable 
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long kodePegawai;
    private String namaPegawai;
    private String alamatPegawai;
    private Long telpPegawai;

    public Long getId() 
    {
        return id;
    }

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getKodePegawai() 
    {
        return kodePegawai;
    }

    public void setKodePegawai(Long kodePegawai) 
    {
        this.kodePegawai = kodePegawai;
    }

    public String getNamaPegawai() 
    {
        return namaPegawai;
    }

    public void setNamaPegawai(String namaPegawai) 
    {
        this.namaPegawai = namaPegawai;
    }

    public String getAlamatPegawai() 
    {
        return alamatPegawai;
    }

    public void setAlamatPegawai(String alamatPegawai) 
    {
        this.alamatPegawai = alamatPegawai;
    }

    public Long getTelpPegawai()
    {
        return telpPegawai;
    }

    public void setTelpPegawai(Long telpPegawai) 
    {
        this.telpPegawai = telpPegawai;
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
        if (!(object instanceof Pegawai)) 
        {
            return false;
        }
        Pegawai other = (Pegawai) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString() 
    {
        return "Model.Pegawai[ id=" + id + " ]";
    }
    
}
