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
@Table(name = "MERK")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Merk.findAll", query = "SELECT m FROM Merk m")
    , @NamedQuery(name = "Merk.findByIdMerk", query = "SELECT m FROM Merk m WHERE m.idMerk = :idMerk")
    , @NamedQuery(name = "Merk.findByNamaMerk", query = "SELECT m FROM Merk m WHERE m.namaMerk = :namaMerk")})
public class Merk implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_MERK")
    private String idMerk;
    @Column(name = "NAMA_MERK")
    private String namaMerk;
    @OneToMany(mappedBy = "idMerk", fetch = FetchType.LAZY)
    private List<DetailJenisMerk> detailJenisMerkList;

    public Merk() {
    }

    public Merk(String idMerk, String namaMerk) {
        this.idMerk = idMerk;
        this.namaMerk = namaMerk;
    }

    
    public Merk(String idMerk) {
        this.idMerk = idMerk;
    }

    public String getIdMerk() {
        return idMerk;
    }

    public void setIdMerk(String idMerk) {
        this.idMerk = idMerk;
    }

    public String getNamaMerk() {
        return namaMerk;
    }

    public void setNamaMerk(String namaMerk) {
        this.namaMerk = namaMerk;
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
        hash += (idMerk != null ? idMerk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Merk)) {
            return false;
        }
        Merk other = (Merk) object;
        if ((this.idMerk == null && other.idMerk != null) || (this.idMerk != null && !this.idMerk.equals(other.idMerk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Merk[ idMerk=" + idMerk + " ]";
    }
    
}
