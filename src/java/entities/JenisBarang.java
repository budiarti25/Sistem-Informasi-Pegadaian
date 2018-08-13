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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "JENIS_BARANG")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "JenisBarang.findAll", query = "SELECT j FROM JenisBarang j")
    , @NamedQuery(name = "JenisBarang.findByIdJenis", query = "SELECT j FROM JenisBarang j WHERE j.idJenis = :idJenis")
    , @NamedQuery(name = "JenisBarang.findByNamaJenis", query = "SELECT j FROM JenisBarang j WHERE j.namaJenis = :namaJenis")})
public class JenisBarang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_JENIS")
    private String idJenis;
    @Column(name = "NAMA_JENIS")
    private String namaJenis;
    @JoinColumn(name = "ID_KATEGORI", referencedColumnName = "ID_KATEGORI")
    @ManyToOne(fetch = FetchType.LAZY)
    private KategoriBarang idKategori;
    @OneToMany(mappedBy = "idJenis", fetch = FetchType.LAZY)
    private List<DetailJenisMerk> detailJenisMerkList;

    public JenisBarang() {
    }

    public JenisBarang(String idJenis, String namaJenis, KategoriBarang idKategori) {
        this.idJenis = idJenis;
        this.namaJenis = namaJenis;
        this.idKategori = idKategori;
    }

    
    public JenisBarang(String idJenis) {
        this.idJenis = idJenis;
    }

    public String getIdJenis() {
        return idJenis;
    }

    public void setIdJenis(String idJenis) {
        this.idJenis = idJenis;
    }

    public String getNamaJenis() {
        return namaJenis;
    }

    public void setNamaJenis(String namaJenis) {
        this.namaJenis = namaJenis;
    }

    public KategoriBarang getIdKategori() {
        return idKategori;
    }

    public void setIdKategori(KategoriBarang idKategori) {
        this.idKategori = idKategori;
    }

    @XmlTransient
    public List<DetailJenisMerk> getDetailJenisMerkList() {
        return detailJenisMerkList;
    }

    public void setDetailJenisMerkList(List<DetailJenisMerk> detailJenisMerkList) {
        this.detailJenisMerkList = detailJenisMerkList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idJenis != null ? idJenis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof JenisBarang)) {
            return false;
        }
        JenisBarang other = (JenisBarang) object;
        if ((this.idJenis == null && other.idJenis != null) || (this.idJenis != null && !this.idJenis.equals(other.idJenis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.JenisBarang[ idJenis=" + idJenis + " ]";
    }
    
}
