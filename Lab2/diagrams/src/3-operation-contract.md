# Operation Contract
Define an operation contract for addAnnotation(..).
Clearly identify:
- Elements of the contract that form the obligation of the client.
- Elements of the contract form the obligation of the supplier.
- The different types of postconditions.
## addAnnotation(..)

**<ins>Contract</ins> CO4:** addAnnotation

**Operation:** addAnnotation(location: Location, description: Description)

**Cross References:** Use Case: Processing Annotations

**Preconditions:**
- Session needs to have started
- A valid Location was instantiated
- A valid Description was instantiated

**Postconditions:**
- An annotation instance `ano` was created **(instance creation)**
- The annotation object `ano` was associated to the Map **(association formed)**
- `ano.id` was set to a unique value **(attribute modification)**
- `ano.location` was set to the location (an object) parameter **(attribute modification)**
- `ano.description` was set to the description (an object) parameter **(attribute modification)**