/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author budiarti
 */
@Entity
@Table(name = "PENGAJUAN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pengajuan.findAll", query = "SELECT p FROM Pengajuan p")
    , @NamedQuery(name = "Pengajuan.findByIdPengajuan", query = "SELECT p FROM Pengajuan p WHERE p.idPengajuan = :idPengajuan")
    , @NamedQuery(name = "Pengajuan.findByTanggalPengajuan", query = "SELECT p FROM Pengajuan p WHERE p.tanggalPengajuan = :tanggalPengajuan")
    , @NamedQuery(name = "Pengajuan.findByStatus", query = "SELECT p FROM Pengajuan p WHERE p.status = :status")})
public class Pengajuan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_PENGAJUAN")
    private String idPengajuan;
    @Column(name = "TANGGAL_PENGAJUAN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tanggalPengajuan;
    @Column(name = "STATUS")
    private Character status;
    @JoinColumn(name = "NIK", referencedColumnName = "NIK")
    @ManyToOne(fetch = FetchType.LAZY)
    private Akun nik;
    @JoinColumn(name = "ID_BARANG", referencedColumnName = "ID_BARANG")
    @ManyToOne(fetch = FetchType.LAZY)
    private Barang idBarang;
    @OneToMany(mappedBy = "idPengajuan", fetch = FetchType.LAZY)
    private List<Transaksi> transaksiList;

    public Pengajuan() {
    }

    public Pengajuan(String idPengajuan, Date tanggalPengajuan, Character status, Akun nik, Barang idBarang) {
        this.idPengajuan = idPengajuan;
        this.tanggalPengajuan = tanggalPengajuan;
        this.status = status;
        this.nik = nik;
        this.idBarang = idBarang;
    }

    
    public Pengajuan(String idPengajuan) {
        this.idPengajuan = idPengajuan;
    }

    public String getIdPengajuan() {
        return idPengajuan;
    }

    public void setIdPengajuan(String idPengajuan) {
        this.idPengajuan = idPengajuan;
    }

    public Date getTanggalPengajuan() {
        return tanggalPengajuan;
    }

    public void setTanggalPengajuan(Date tanggalPengajuan) {
        this.tanggalPengajuan = tanggalPengajuan;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public Akun getNik() {
        return nik;
    }

    public void setNik(Akun nik) {
        this.nik = nik;
    }

    public Barang getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(Barang idBarang) {
        this.idBarang = idBarang;
    }

    @XmlTransient
    public List<Transaksi> getTransaksiList() {
        return transaksiList;
    }

    public void setTransaksiList(List<Transaksi> transaksiList) {
        this.transaksiList = transaksiList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPengajuan != null ? idPengajuan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pengajuan)) {
            return false;
        }
        Pengajuan other = (Pengajuan) object;
        if ((this.idPengajuan == null && other.idPengajuan != null) || (this.idPengajuan != null && !this.idPengajuan.equals(other.idPengajuan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Pengajuan[ idPengajuan=" + idPengajuan + " ]";
    }
    
}
