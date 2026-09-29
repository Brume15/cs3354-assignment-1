# cs3354-assignment-1

Alexander Rivas (uql14 / SuiteChaoa)
- Completed the restock and search method (09/28/2026)

Vivi Villarreal-Perez (vvivi18v)
- Completed the inventory display method and its Javadoc (09/28/2026)

Christopher Preddie (Uei8)
- -  Developed and integrated the InputValidator class for menu choice and restocking quantity validation, implemented Scanner buffer management, and conducted input validation testing.
## Testing & Validation
- **Menu Choice Validation (getValidIntRange):** Tested string inputs (abc) and out-of-bounds numbers (0, 5). Verified that the program re-prompts until a valid menu selection (1–4) is entered.
- **Scanner Buffer Handling:** Tested entering an item name ("Bananas") directly after integer selection to verify scanner.nextLine()` flushes the buffer cleanly without skipping inputs.
- **Quantity Validation (getPositiveInt):** Tested zero (0), negative values (-3), and valid positive quantities (4). Verified that only positive integers are accepted.

Brume Esabunor-Nukie (Brume15)
- Set up the GitHub repository and initial Java project structure (09/24/2026)
- Created the feature-menu branch for the user menu and final integration (09/28/2026)
- Implemented the Scanner-based menu with a while loop for viewing inventory, restocking items, and exiting (09/28/2026)
- Added starting inventory, connected the display and restock methods, and checked menu input and stock updates (09/28/2026)
