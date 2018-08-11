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
@Table(name = "TRANSAKSI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transaksi.findAll", query = "SELECT t FROM Transaksi t")
    , @NamedQuery(name = "Transaksi.findByIdTransaksi", query = "SELECT t FROM Transaksi t WHERE t.idTransaksi = :idTransaksi")
    , @NamedQuery(name = "Transaksi.findByTanggalTansaksi", query = "SELECT t FROM Transaksi t WHERE t.tanggalTansaksi = :tanggalTansaksi")
    , @NamedQuery(name = "Transaksi.findByDanaCair", query = "SELECT t FROM Transaksi t WHERE t.danaCair = :danaCair")})
public class Transaksi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_TRANSAKSI")
    private String idTransaksi;
    @Column(name = "TANGGAL_TANSAKSI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tanggalTansaksi;
    @Column(name = "DANA_CAIR")
    private Long danaCair;
    @OneToMany(mappedBy = "idTransaksi", fetch = FetchType.LAZY)
    private List<Angsuran> angsuranList;
    @JoinColumn(name = "ID_PENGAJUAN", referencedColumnName = "ID_PENGAJUAN")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pengajuan idPengajuan;

    public Transaksi() {
    }

    public Transaksi(String idTransaksi, Date tanggalTansaksi, Long danaCair, Pengajuan idPengajuan) {
        this.idTransaksi = idTransaksi;
        this.tanggalTansaksi = tanggalTansaksi;
        this.danaCair = danaCair;
        this.idPengajuan = idPengajuan;
    }

    
    public Transaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public Date getTanggalTansaksi() {
        return tanggalTansaksi;
    }

    public void setTanggalTansaksi(Date tanggalTansaksi) {
        this.tanggalTansaksi = tanggalTansaksi;
    }

    public Long getDanaCair() {
        return danaCair;
    }

    public void setDanaCair(Long danaCair) {
        this.danaCair = danaCair;
    }

    @XmlTransient
    public List<Angsuran> getAngsuranList() {
        return angsuranList;
    }

    public void setAngsuranList(List<Angsuran> angsuranList) {
        this.angsuranList = angsuranList;
    }

    public Pengajuan getIdPengajuan() {
        return idPengajuan;
    }

    public void setIdPengajuan(Pengajuan idPengajuan) {
        this.idPengajuan = idPengajuan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTransaksi != null ? idTransaksi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transaksi)) {
            return false;
        }
        Transaksi other = (Transaksi) object;
        if ((this.idTransaksi == null && other.idTransaksi != null) || (this.idTransaksi != null && !this.idTransaksi.equals(other.idTransaksi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Transaksi[ idTransaksi=" + idTransaksi + " ]";
    }
    
}
