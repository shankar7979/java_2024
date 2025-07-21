package com.coforge.main;

import com.coforge.dao.LibraryDao;
import com.coforge.model.Library;
import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryDao dao = new LibraryDao();
        String ch = "y";
        Library library;

        while (ch.equals("y")) {
            System.out.println("1.add Record");
            System.out.println("2.show all Record");
            System.out.println("3.search Record");
            System.out.println("4.remove Record");
            System.out.println("5.update Record");

            int operation = scanner.nextInt();
            switch (operation) {
                case 1:
                    library = null;
                    library = new Library();
                    System.out.println("Enter  library  id name and location");
                    library.setLibraryId(scanner.nextInt());
                    library.setLibraryName(scanner.next());
                    library.setLibraryLocation(scanner.next());
                    if(dao.addLibrary(library))
                        System.out.println("library object added");
                    else
                        System.out.println("library object with id "+library.getLibraryId()+" is already present");
                    break;
                case 2:
                     dao.getAllLibrary().forEach(a-> System.out.println(a));
                    break;
                case 3:
                    System.out.println("enter id ");
                    Library library1 = dao.searchLibrary(scanner.nextInt());
                    if(library1!=null)
                        System.out.println("found  with id "+library1);
                    else
                        System.out.println("not found  with id ");
                    break;
                case 4:
                    System.out.println("enter id ");
                     if(dao.removeLibrary(scanner.nextInt()))
                        System.out.println("removed  with id ");
                    else
                        System.out.println("not found  with id ");
                    break;
                case 5:
                    library = null;
                    library = new Library();
                    System.out.println("Enter  library id name and location");
                    library.setLibraryId(scanner.nextInt());
                    library.setLibraryName(scanner.next());
                    library.setLibraryLocation(scanner.next());
                    if(dao.updateLibrary(library))
                        System.out.println("library object updated");
                    else
                        System.out.println("library object with id "+library.getLibraryId()+" not present");
                    break;
                default:
                    System.out.println("wrong operation  number try again");
                    break;
            }
            System.out.println("continue y\\n");
            ch= scanner.next();
        }


    }
}
