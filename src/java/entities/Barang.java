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
@Table(name = "BARANG")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Barang.findAll", query = "SELECT b FROM Barang b")
    , @NamedQuery(name = "Barang.findByIdBarang", query = "SELECT b FROM Barang b WHERE b.idBarang = :idBarang")
    , @NamedQuery(name = "Barang.findByHargaPerkiraan", query = "SELECT b FROM Barang b WHERE b.hargaPerkiraan = :hargaPerkiraan")
    , @NamedQuery(name = "Barang.findByFoto", query = "SELECT b FROM Barang b WHERE b.foto = :foto")
    , @NamedQuery(name = "Barang.findByDeskripsi", query = "SELECT b FROM Barang b WHERE b.deskripsi = :deskripsi")})
public class Barang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_BARANG")
    private String idBarang;
    @Column(name = "HARGA_PERKIRAAN")
    private Long hargaPerkiraan;
    @Column(name = "FOTO")
    private String foto;
    @Column(name = "DESKRIPSI")
    private String deskripsi;
    @OneToMany(mappedBy = "idBarang", fetch = FetchType.LAZY)
    private List<Pengajuan> pengajuanList;
    @JoinColumn(name = "ID_DETAIL", referencedColumnName = "ID_DETAIL")
    @ManyToOne(fetch = FetchType.LAZY)
    private DetailJenisMerk idDetail;

    public Barang() {
    }

    public Barang(String idBarang, Long hargaPerkiraan, String foto, String deskripsi, DetailJenisMerk idDetail) {
        this.idBarang = idBarang;
        this.hargaPerkiraan = hargaPerkiraan;
        this.foto = foto;
        this.deskripsi = deskripsi;
        this.idDetail = idDetail;
    }

    
    public Barang(String idBarang) {
        this.idBarang = idBarang;
    }

    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public Long getHargaPerkiraan() {
        return hargaPerkiraan;
    }

    public void setHargaPerkiraan(Long hargaPerkiraan) {
        this.hargaPerkiraan = hargaPerkiraan;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    @XmlTransient
    public List<Pengajuan> getPengajuanList() {
        return pengajuanList;
    }

    public void setPengajuanList(List<Pengajuan> pengajuanList) {
        this.pengajuanList = pengajuanList;
    }

    public DetailJenisMerk getIdDetail() {
        return idDetail;
    }

    public void setIdDetail(DetailJenisMerk idDetail) {
        this.idDetail = idDetail;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBarang != null ? idBarang.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Barang)) {
            return false;
        }
        Barang other = (Barang) object;
        if ((this.idBarang == null && other.idBarang != null) || (this.idBarang != null && !this.idBarang.equals(other.idBarang))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Barang{" + "idBarang=" + idBarang + ", hargaPerkiraan=" + hargaPerkiraan + ", foto=" + foto + ", deskripsi=" + deskripsi + ", pengajuanList=" + pengajuanList + ", idDetail=" + idDetail + '}';
    }
    
}
