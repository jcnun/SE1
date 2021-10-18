package org.hbrs.se1.ws21.uebung2;

import com.sun.source.tree.MemberReferenceTree;

public class Uebung02 {
    public static void main(String[] args) {
        Container c = new Container();

        // Test1: Leerer Container
        if (c.size() != 0) {
            System.err.println("Neu erstellter Container ist nicht leer!");
        }

        MemberTest m1 = new MemberTest(1);
        MemberTest m2 = new MemberTest(2);
        MemberTest m3 = new MemberTest(3);

        // Test2: Hinzufügen (ok)
        try {
            c.addMember(m1);
            c.addMember(m2);
            c.addMember(m3);
        } catch(ContainerException e) {
            System.err.println("addMember Fehler: " + e.getMessage());
        }

        // Test3: Hinzufügen (nicht ok)
        try {
            c.addMember(m1);
            // Prüfe, ob c.size() == 1
            c.addMember(m2);
            // Prüfe, ob c.size() == 2
            c.addMember(m3);
            // Prüfe, ob c.size() == 3
            c.dump();
        } catch(ContainerException e) {
            System.err.println("addMember Fehlschlag-Test erfolgreich: " + e.getMessage());
        }

        // Löschen: M3 (ok)
        String erg = c.deleteMember(3);
        if (!erg.isEmpty()) {
            System.err.println("deleteMember Fehler: " + erg);
        }
        if (c.size() != 2) {
            System.err.println("deleteMember Fehler: Größe stimmt nicht");
        }
        c.dump();

        // Löschung: M3 (nicht mehr ok)
        erg = c.deleteMember(3);
        if (!erg.isEmpty()) {
            System.err.println("deleteMember Fehlschlag-Test erfolgreich: " + erg);
        }
        if (c.size() != 2) {
            System.err.println("deleteMember Fehler: Größe stimmt nicht");
        }
        c.dump();
    }
}
