public class Main {
    public static void main(String[] args) {
        DepartementHashSet gestionDepartements = new DepartementHashSet();

        Departement dep1 = new Departement(1, "Informatique", 25);
        Departement dep2 = new Departement(3, "RH", 15);
        Departement dep3 = new Departement(2, "Finance", 20);

        gestionDepartements.ajouterDepartement(dep1);
        gestionDepartements.ajouterDepartement(dep2);
        gestionDepartements.ajouterDepartement(dep3);

        System.out.println("Liste des départements :");
        gestionDepartements.displayDepartement();

        System.out.println("\nRecherche par nom (RH) : " + gestionDepartements.rechercherDepartement("FD"));

        System.out.println("\nTri par ID :");
        for (Departement d : gestionDepartements.trierDepartementById()) {
            System.out.println(d);
        }
    }
}
