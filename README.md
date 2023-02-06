# Reto técnico Klimber 
***
## Contenido
1. [Informacion General](#informacion-general)
2. [Pasos del Escenario de Prueba](#pasos-del-escenario-de-prueba)
3. [Instalacion](#Instalacion)
4. [Tecnologias](#tecnologias)
5. [FAQs](#faqs)

### Informacion General
***
Las pruebas estan Basada en la cotizacion de un seguro se salud para 2 adultos y un niño menor de 12 años.

### Pasos del Escenario de Prueba
***
```
 Scenario: User make a request to quote a health insurance
    Given I am in app main site
    And I wait for first step elements are loaded
    Then I fill following text boxes:
    | Nombre    | María Jose Ortiz Rodriguez |
    | Provincia | CABA                       |
    | Cód. área | 11                         |
    | Celular   | 22501118                   |
    And click on Cotizá button
    And I wait for second step elements are loaded
    Then I fill following text boxes:
      | Cantidad de adultos    | 2 |
      | Menores de 12 años     | 1 |
    And click on Sigui ente button
    And I wait for last step elements are loaded
    Then I fill registration form with values:
      | Nombre                  | Maria Jose                  |
      | Apellido                | Ortiz Rodrigez              |
      | Fecha de nacimiento     | 13/11/1994                  |
      | DNI                     | 95624541                    |
      | Sexo biológico          | Femenino                    |
      | Género                  | Femenino                    |
      | E-mail                  | ortizmarijo1311@gmail.com   |
      | Cód. área               | 11                          |
      | Celular                 | 22501118                    |
      | Calle                   | Av. Santa Fe                |
      | Número                  | 2306                        |
      | Piso                    | 2                           |
      | Departamento            | C                           |
      | Código Postal           | 1123                        |
      | Ciudad                  | C.A.B.A                     |
  ```
### Tecnologías
***
El proyecto esta basado en Cucumber Archetype
*https://cucumber.io/docs/guides/10-minute-tutorial/?lang=java*

```powershell
mvn archetype:generate                                  \
  -DarchetypeGroupId=io.cucumber                        \
  -DarchetypeArtifactId=cucumber-archetype              \
  -DarchetypeVersion=7.11.0                             \
```
### Intalación
***
**Repositorio**
```
$ git clone https://github.com/ortizmarijo/desafioKlimber.git
```
**Maven**
```
mvn clean intall
```
* Ejecicion de test
```
mvn test 
```
