//package Tries;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
///**
// * Created by tadessey on 2/26/18.
// */
//public class Tries {
//
//    public static void main(final String[] args) {
//        final Contact contact = new Contact();
//        final Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        for (int a0 = 0; a0 < n; a0++){
//            final String op = in.next();
//            final String contactName = in.next();
//            if ("add".equalsIgnoreCase(op)) {
//                contact.registerContact(contactName);
//            }
//            else if( "find".equalsIgnoreCase(op)) {
//                System.out.println(contact.searchContact(contactName));
//            }
//        }
//    }
//
//
//
//}
//class ContactNode {
//    final Map<Character, ContactNode> map = new HashMap<>();
//    int size;
//
//    void addIfAbsent(final char ch) {
//        map.put(ch, new ContactNode());
//    }
//
//    ContactNode getChildNode(final char ch) {
//        return map.get(ch);
//    }
//
//    void increaseSize() {
//        size = size + 1;
//    }
//
//}
//
//class Contact {
//
//    public Contact() {
//        this.node = node;
//    }
//
//    private  ContactNode node = new ContactNode();
//
//    public  void registerContact(final String contactName) {
//        ContactNode current = node;
//        for (char ch: contactName.toCharArray()) {
//            current.addIfAbsent(ch);
//            current.increaseSize();
//            current = current.getChildNode(ch);
//        }
//    }
//
//    public  int searchContact(final String partialName) {
//        ContactNode current  = node;
//        int size = 0;
//        for (char ch: partialName.toCharArray()) {
//            size = current.size;
//            current = current.getChildNode(ch);
//
//            if (null == current) {
//                return 0;
//            }
//        }
//        return size;
//    }
//}