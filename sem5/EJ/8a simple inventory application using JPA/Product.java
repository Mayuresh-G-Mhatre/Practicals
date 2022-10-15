package p1;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "product")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p"),
    @NamedQuery(name = "Product.findByPid", query = "SELECT p FROM Product p WHERE p.pid = :pid"),
    @NamedQuery(name = "Product.findByPname", query = "SELECT p FROM Product p WHERE p.pname = :pname"),
    @NamedQuery(name = "Product.findByPprice", query = "SELECT p FROM Product p WHERE p.pprice = :pprice"),
    @NamedQuery(name = "Product.findByPqty", query = "SELECT p FROM Product p WHERE p.pqty = :pqty")})
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pid")
    private Integer pid;
    @Size(max = 50)
    @Column(name = "pname")
    private String pname;
    @Column(name = "pprice")
    private Integer pprice;
    @Column(name = "pqty")
    private Integer pqty;
    public Product() {
    }
    public Product(Integer pid) {
        this.pid = pid;
    }

    public Integer getPid() {
        return pid;
    }
    public void setPid(Integer pid) {
        this.pid = pid;
    }
    public String getPname() {
        return pname;
    }
    public void setPname(String pname) {
        this.pname = pname;
    }
    public Integer getPprice() {
        return pprice;
    }
    public void setPprice(Integer pprice) {
        this.pprice = pprice;
    }
    public Integer getPqty() {
        return pqty;
    }
    public void setPqty(Integer pqty) {
        this.pqty = pqty;
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pid != null ? pid.hashCode() : 0);
        return hash;
    }
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.pid == null && other.pid != null) || (this.pid != null && !this.pid.equals(other.pid))) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "p1.Product[ pid=" + pid + " ]";
    }
}
