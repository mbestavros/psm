package gov.medicaid.api.transformers;

import gov.medicaid.entities.Entity;
import gov.medicaid.entities.Organization;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.BooleanType;
import org.hl7.fhir.dstu3.model.Task;

import java.util.function.Function;

public class AcceptsEftToFhir
        implements Function<Entity, Task.ParameterComponent> {
    @Override
    public Task.ParameterComponent apply(Entity entity) {
        boolean isEftAccepted = false;

        // Organizations are the only entity type that can accept Eft
        if (entity instanceof Organization) {
            isEftAccepted = ((Organization) entity).isEftAccepted();
        }

        return new Task.ParameterComponent(
                new CodeableConcept().setText("Accepts EFT"),
                new BooleanType(isEftAccepted)
        );
    }
}
