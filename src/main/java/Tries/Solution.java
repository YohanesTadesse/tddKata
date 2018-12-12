package Tries;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(final String[] args) {
        final Contacts con = new Contacts();
        final Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int a0 = 0; a0 < n; a0++) {
            final String op = in.next();
            final String contact = in.next();
            if ("add".equalsIgnoreCase(op)) {
                addContact(contact, con);
            } else if ("find".equalsIgnoreCase(op))
                System.out.println(findContacts(contact, con));
        }
    }

    static void addContact(final String contactName, final Contacts root) {
        Contacts currentNode = root;
        for (char ch : contactName.toCharArray()) {
            currentNode = currentNode.addToMap(new Contacts.Name(ch, 1), new Contacts());
        }
    }

    static int findContacts(final String contactName, final Contacts root) {
        return root.findContact(contactName, root);
    }

    static class Contacts {
        Map<Name, Contacts> contacts = new HashMap<>();

        Contacts() {
        }


        private Contacts addToMap(final Name nameChar, final Contacts con) {
            if (null == contacts.get(nameChar)) {
                contacts.put(nameChar, con);
                return con;
            } else {
                contacts.keySet().stream().filter(e->e.equals(nameChar)).findFirst().ifPresent(Name::incrementMagnitude);
                return contacts.get(nameChar);
            }
        }

        private int findContact(final String contactName, final Contacts root) {
            Contacts currentNode = root;
            int magnitude = 0;
            for (char ch : contactName.toCharArray()) {
                if (null == currentNode.contacts.get(new Name(ch, 0))) {
                   return 0;
                } else {
                    final Optional<Integer> integer = currentNode.contacts.keySet().stream().filter(e -> e.getChar() == ch).map(Name::getMagnitude).findFirst();
                    if (!integer.isPresent())
                        return 0;
                    magnitude = integer.get();
                    currentNode = currentNode.contacts.get(new Name(ch, 0));
                }
            }
            return magnitude;
        }
        static class Name {

            char ch;
            int magnitude = 0;

            Name(final char ch, final int magnitude) {
                this.ch = ch;
                this.magnitude += magnitude;
            }

            public char getChar() {
                return ch;
            }

            public int getMagnitude() {
                return magnitude;
            }

            public void setChar(final char c) {
                this.ch = c;
            }

            public void incrementMagnitude() {
                magnitude = magnitude + 1;
            }

            @Override
            public boolean equals(final Object obj) {
                return this.ch == ((Name) obj).getChar();
            }

            @Override
            public int hashCode() {
                return (int) ch;
            }
        }
    }
}