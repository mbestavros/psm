package gov.medicaid.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "dmf_automatic_screenings")
@NamedEntityGraph(
        name = "Screening with matches",
        attributeNodes = {@NamedAttributeNode("matches")}
)
public class DmfAutomaticScreening extends AutomaticScreening {
    @Column(
            name = "ssn_search_term",
            nullable = false
    )
    private String ssnSearchTerm;

    @OneToMany(
            mappedBy = "dmfAutomaticScreening",
            cascade = CascadeType.ALL
    )
    private List<DmfAutomaticScreeningMatch> matches = new ArrayList<>();

    public String getSsnSearchTerm() {
        return ssnSearchTerm;
    }

    public void setSsnSearchTerm(String ssnSearchTerm) {
        this.ssnSearchTerm = ssnSearchTerm;
    }

    public List<DmfAutomaticScreeningMatch> getMatches() {
        return matches;
    }

    public void setMatches(List<DmfAutomaticScreeningMatch> matches) {
        this.matches = matches;
    }

    public void addMatch(DmfAutomaticScreeningMatch match) {
        match.setDmfAutomaticScreening(this);
        matches.add(match);
    }
}
