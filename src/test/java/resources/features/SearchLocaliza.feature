@LocalizaHome
Feature: As an admin user I want to validate the search for a localization so I can see the list of available cars to rent

  @InvalidLocalization
  Scenario Outline:
    Given  The user is in localiza home page
    When   Fills the search field with "<invalidLocalization>"
    Then   An error "<message>" should be displayed to the user
    Examples:
      | invalidLocalization | message                                                |
      | Tangamandapio       | Não foram encontradas agências para o termo informado. |

  @ValidLocalization
  Scenario Outline:
    Given  The user is in localiza home page
    When   Fills the search field with "<localization>"
    Then   A list with <localizationQuantity> locations is displayed
    Examples:
      | localization | localizationQuantity |
      | Joao Pessoa  | 0                     |