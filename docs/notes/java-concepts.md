## Constructor

**What it is:** Special method, same class name, no return type.
Automatically called when an object is created with 'new'.

**What is it for:**
Initialize the object's states, make it ready and valid.

**Used for:**
- Receive external data (via parameters)
- Set internal default values
- Ensure that the object is born consistent

**Example of my code:**
The **Task** constructor takes id and description, and sets status = TODO and the dates automatically.
So every Task is born valid.


The **TaskManager** constructor takes no parameters.
But initialize the first id and creates the **Task List.**

**Related:** Default constructor, overload, this.

---
