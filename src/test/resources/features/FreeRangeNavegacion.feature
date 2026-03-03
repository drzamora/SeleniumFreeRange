@Navigation
Feature: Navegación
    Para ver las subpáginas
    Sin iniciar sesión
    Como usuario puedo acceder a los enlaces de la barra de navegación

    Background: I am on the Free Range Testers web without logging in.
        Given I navigate to www.freerangetesters.com

    Scenario Outline: Puedo acceder a las subpáginas a través de la barra de navegación.
        When I go to <section> using the navigation bar
        

        Examples:
            | section       |
            | Suscripciones |
            | Cursos        |
            | Mentorías     |
            | Talleres      |
            | Blog          |
            | Recursos      |

    @Courses
    Scenario: Visualización correcta de cursos para clientes potenciales
        When I go to Cursos using the navigation bar 
        And I select Introducción al Testing

    @Plans @Courses
    Scenario: Usuarios pueden seleccionar un plan cuando se registran
        When I select Elegir Plan 
        Then The client can validate the options in the checkout page

