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
@Table(name = "AKUN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Akun.findAll", query = "SELECT a FROM Akun a")
    , @NamedQuery(name = "Akun.findByNik", query = "SELECT a FROM Akun a WHERE a.nik = :nik")
    , @NamedQuery(name = "Akun.findByNama", query = "SELECT a FROM Akun a WHERE a.nama = :nama")
    , @NamedQuery(name = "Akun.findByJenisKelamin", query = "SELECT a FROM Akun a WHERE a.jenisKelamin = :jenisKelamin")
    , @NamedQuery(name = "Akun.findByAlamat", query = "SELECT a FROM Akun a WHERE a.alamat = :alamat")
    , @NamedQuery(name = "Akun.findByRtRw", query = "SELECT a FROM Akun a WHERE a.rtRw = :rtRw")
    , @NamedQuery(name = "Akun.findByDesa", query = "SELECT a FROM Akun a WHERE a.desa = :desa")
    , @NamedQuery(name = "Akun.findByKecamatan", query = "SELECT a FROM Akun a WHERE a.kecamatan = :kecamatan")
    , @NamedQuery(name = "Akun.findByKabupaten", query = "SELECT a FROM Akun a WHERE a.kabupaten = :kabupaten")
    , @NamedQuery(name = "Akun.findByProvinsi", query = "SELECT a FROM Akun a WHERE a.provinsi = :provinsi")})
public class Akun implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NIK")
    private String nik;
    @Column(name = "NAMA")
    private String nama;
    @Column(name = "JENIS_KELAMIN")
    private Character jenisKelamin;
    @Column(name = "ALAMAT")
    private String alamat;
    @Column(name = "RT_RW")
    private String rtRw;
    @Column(name = "DESA")
    private String desa;
    @Column(name = "KECAMATAN")
    private String kecamatan;
    @Column(name = "KABUPATEN")
    private String kabupaten;
    @Column(name = "PROVINSI")
    private String provinsi;
    @OneToMany(mappedBy = "nik", fetch = FetchType.LAZY)
    private List<Pengajuan> pengajuanList;
    @JoinColumn(name = "ID_ROLE", referencedColumnName = "ID_ROLE")
    @ManyToOne(fetch = FetchType.LAZY)
    private Role idRole;

    public Akun() {
    }

    public Akun(String nik, String nama, Character jenisKelamin, String alamat, String rtRw, String desa, String kecamatan, String kabupaten, String provinsi, Role idRole) {
        this.nik = nik;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        this.rtRw = rtRw;
        this.desa = desa;
        this.kecamatan = kecamatan;
        this.kabupaten = kabupaten;
        this.provinsi = provinsi;
        this.idRole = idRole;
    }

    
    public Akun(String nik) {
        this.nik = nik;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Character getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(Character jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getRtRw() {
        return rtRw;
    }

    public void setRtRw(String rtRw) {
        this.rtRw = rtRw;
    }

    public String getDesa() {
        return desa;
    }

    public void setDesa(String desa) {
        this.desa = desa;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getKabupaten() {
        return kabupaten;
    }

    public void setKabupaten(String kabupaten) {
        this.kabupaten = kabupaten;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    @XmlTransient
    public List<Pengajuan> getPengajuanList() {
        return pengajuanList;
    }

    public void setPengajuanList(List<Pengajuan> pengajuanList) {
        this.pengajuanList = pengajuanList;
    }

    public Role getIdRole() {
        return idRole;
    }

    public void setIdRole(Role idRole) {
        this.idRole = idRole;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nik != null ? nik.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Akun)) {
            return false;
        }
        Akun other = (Akun) object;
        if ((this.nik == null && other.nik != null) || (this.nik != null && !this.nik.equals(other.nik))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Akun[ nik=" + nik + " ]";
    }
    
}
