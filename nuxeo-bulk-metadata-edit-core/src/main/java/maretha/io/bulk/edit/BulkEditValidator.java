package maretha.io.bulk.edit;

import org.nuxeo.ecm.core.bulk.message.BulkCommand;
import org.nuxeo.ecm.core.bulk.validation.SetPropertiesValidation;

public class BulkEditValidator extends SetPropertiesValidation {
    
    @Override
    public void validate(BulkCommand command) throws IllegalArgumentException {
      // implement your custom validation logic here
      // take a look at the out of the box methods you can use in AbstractBulkActionValidation
    }

}
