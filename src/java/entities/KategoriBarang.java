/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author budiarti
 */
@Entity
@Table(name = "KATEGORI_BARANG")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KategoriBarang.findAll", query = "SELECT k FROM KategoriBarang k")
    , @NamedQuery(name = "KategoriBarang.findByIdKategori", query = "SELECT k FROM KategoriBarang k WHERE k.idKategori = :idKategori")
    , @NamedQuery(name = "KategoriBarang.findByNamaKategori", query = "SELECT k FROM KategoriBarang k WHERE k.namaKategori = :namaKategori")})
public class KategoriBarang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_KATEGORI")
    private String idKategori;
    @Column(name = "NAMA_KATEGORI")
    private String namaKategori;
    @OneToMany(mappedBy = "idKategori", fetch = FetchType.LAZY)
    private List<JenisBarang> jenisBarangList;

    public KategoriBarang() {
    }

    public KategoriBarang(String idKategori, String namaKategori) {
        this.idKategori = idKategori;
        this.namaKategori = namaKategori;
    }

    public KategoriBarang(String idKategori) {
        this.idKategori = idKategori;
    }

    public String getIdKategori() {
        return idKategori;
    }

    public void setIdKategori(String idKategori) {
        this.idKategori = idKategori;
    }

    public String getNamaKategori() {
        return namaKategori;
    }

    public void setNamaKategori(String namaKategori) {
        this.namaKategori = namaKategori;
    }

    @XmlTransient
    public List<JenisBarang> getJenisBarangList() {
        return jenisBarangList;
    }

    public void setJenisBarangList(List<JenisBarang> jenisBarangList) {
        this.jenisBarangList = jenisBarangList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idKategori != null ? idKategori.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KategoriBarang)) {
            return false;
        }
        KategoriBarang other = (KategoriBarang) object;
        if ((this.idKategori == null && other.idKategori != null) || (this.idKategori != null && !this.idKategori.equals(other.idKategori))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.KategoriBarang[ idKategori=" + idKategori + " ]";
    }
    
}
