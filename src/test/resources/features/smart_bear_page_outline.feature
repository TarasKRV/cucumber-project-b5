Feature: Smart Bear Page Outline

  @docuport_login_outline@smoke
  Scenario Outline: Login Page Docuport
    Given user is on Docuport login page outline
    Then user enters username for "<user>"
    Then user enters password for "<user>"
    Then user clicks login button outline
    Then user should be able to see the home page for "<user>" with "<elements>"
    Examples:
      | user       | elements                                                                                                                |
      | client     | Home, Received docs, My uploads, Invitations                                                                  |
      | employee   | Home, Received docs, My uploads, Clients, Users, Bookkeeping, 1099 Form, Reconciliations                      |
      | advisor    | Home, Received docs, My uploads, Clients, Invitations, Users, Leads,  Bookkeeping, 1099 Form, Reconciliations |
      | supervisor | Home, Received docs, My uploads, Clients, Users, Leads,  Bookkeeping, 1099 Form, Reconciliations              |