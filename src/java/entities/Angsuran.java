/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author budiarti
 */
@Entity
@Table(name = "ANGSURAN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Angsuran.findAll", query = "SELECT a FROM Angsuran a")
    , @NamedQuery(name = "Angsuran.findByIdAngsuran", query = "SELECT a FROM Angsuran a WHERE a.idAngsuran = :idAngsuran")
    , @NamedQuery(name = "Angsuran.findByTanggalBayar", query = "SELECT a FROM Angsuran a WHERE a.tanggalBayar = :tanggalBayar")
    , @NamedQuery(name = "Angsuran.findByNominalAngsuran", query = "SELECT a FROM Angsuran a WHERE a.nominalAngsuran = :nominalAngsuran")
    , @NamedQuery(name = "Angsuran.findByStatus", query = "SELECT a FROM Angsuran a WHERE a.status = :status")})
public class Angsuran implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_ANGSURAN")
    private String idAngsuran;
    @Column(name = "TANGGAL_BAYAR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tanggalBayar;
    @Column(name = "NOMINAL_ANGSURAN")
    private Long nominalAngsuran;
    @Column(name = "STATUS")
    private Character status;
    @JoinColumn(name = "ID_TRANSAKSI", referencedColumnName = "ID_TRANSAKSI")
    @ManyToOne(fetch = FetchType.LAZY)
    private Transaksi idTransaksi;

    public Angsuran() {
    }

    public Angsuran(String idAngsuran, Date tanggalBayar, Long nominalAngsuran, Character status, Transaksi idTransaksi) {
        this.idAngsuran = idAngsuran;
        this.tanggalBayar = tanggalBayar;
        this.nominalAngsuran = nominalAngsuran;
        this.status = status;
        this.idTransaksi = idTransaksi;
    }

    
    public Angsuran(String idAngsuran) {
        this.idAngsuran = idAngsuran;
    }

    public String getIdAngsuran() {
        return idAngsuran;
    }

    public void setIdAngsuran(String idAngsuran) {
        this.idAngsuran = idAngsuran;
    }

    public Date getTanggalBayar() {
        return tanggalBayar;
    }

    public void setTanggalBayar(Date tanggalBayar) {
        this.tanggalBayar = tanggalBayar;
    }

    public Long getNominalAngsuran() {
        return nominalAngsuran;
    }

    public void setNominalAngsuran(Long nominalAngsuran) {
        this.nominalAngsuran = nominalAngsuran;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public Transaksi getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(Transaksi idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAngsuran != null ? idAngsuran.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Angsuran)) {
            return false;
        }
        Angsuran other = (Angsuran) object;
        if ((this.idAngsuran == null && other.idAngsuran != null) || (this.idAngsuran != null && !this.idAngsuran.equals(other.idAngsuran))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Angsuran[ idAngsuran=" + idAngsuran + " ]";
    }
    
}
