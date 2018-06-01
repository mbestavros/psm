package gov.medicaid.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dmf_automatic_screening_matches")
public class DmfAutomaticScreeningMatch {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "dmf_automatic_screening_match_id")
    private long id;

    @ManyToOne
    @JoinColumn(
            name = "dmf_automatic_screening_id",
            nullable = false
    )
    private DmfAutomaticScreening dmfAutomaticScreening;

    @Column(
            name = "resource_url",
            nullable = false
    )
    private String resourceUrl;

    private String ssn;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public DmfAutomaticScreening getDmfAutomaticScreening() {
        return dmfAutomaticScreening;
    }

    public void setDmfAutomaticScreening(DmfAutomaticScreening dmfAutomaticScreening) {
        this.dmfAutomaticScreening = dmfAutomaticScreening;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
