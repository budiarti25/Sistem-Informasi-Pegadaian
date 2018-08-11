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
@Table(name = "DETAIL_JENIS_MERK")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetailJenisMerk.findAll", query = "SELECT d FROM DetailJenisMerk d")
    , @NamedQuery(name = "DetailJenisMerk.findByIdDetail", query = "SELECT d FROM DetailJenisMerk d WHERE d.idDetail = :idDetail")})
public class DetailJenisMerk implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_DETAIL")
    private String idDetail;
    @JoinColumn(name = "ID_JENIS", referencedColumnName = "ID_JENIS")
    @ManyToOne(fetch = FetchType.LAZY)
    private JenisBarang idJenis;
    @JoinColumn(name = "ID_MERK", referencedColumnName = "ID_MERK")
    @ManyToOne(fetch = FetchType.LAZY)
    private Merk idMerk;
    @OneToMany(mappedBy = "idDetail", fetch = FetchType.LAZY)
    private List<Barang> barangList;

    public DetailJenisMerk() {
    }

    public DetailJenisMerk(String idDetail, JenisBarang idJenis, Merk idMerk) {
        this.idDetail = idDetail;
        this.idJenis = idJenis;
        this.idMerk = idMerk;
    }

    
    public DetailJenisMerk(String idDetail) {
        this.idDetail = idDetail;
    }

    public String getIdDetail() {
        return idDetail;
    }

    public void setIdDetail(String idDetail) {
        this.idDetail = idDetail;
    }

    public JenisBarang getIdJenis() {
        return idJenis;
    }

    public void setIdJenis(JenisBarang idJenis) {
        this.idJenis = idJenis;
    }

    public Merk getIdMerk() {
        return idMerk;
    }

    public void setIdMerk(Merk idMerk) {
        this.idMerk = idMerk;
    }

    @XmlTransient
    public List<Barang> getBarangList() {
        return barangList;
    }

    public void setBarangList(List<Barang> barangList) {
        this.barangList = barangList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetail != null ? idDetail.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetailJenisMerk)) {
            return false;
        }
        DetailJenisMerk other = (DetailJenisMerk) object;
        if ((this.idDetail == null && other.idDetail != null) || (this.idDetail != null && !this.idDetail.equals(other.idDetail))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.DetailJenisMerk[ idDetail=" + idDetail + " ]";
    }
    
}
