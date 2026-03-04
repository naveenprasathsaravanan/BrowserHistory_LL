import java.util.*;

public class BrowserHistory {
    static class Node {
        String link;
        Node prev;
        Node next;

        Node(String link) {
            this.link = link;
            this.prev = null;
            this.next = null;
        }
    }

    static class Browserhis {
        private Node curr;

        public Browserhis(String home) {
            curr = new Node(home);
        }

        public void visit(String link) {
            Node temp = new Node(link);
            curr.next = null;
            temp.prev = curr;
            curr.next = temp;
            curr = temp;
            System.out.println("you entered to:" + link);
        }

        public void goback() {
            if (curr.prev != null) {
                curr = curr.prev;
                System.out.println("previous page is:" + curr.link);
            } else {
                System.out.println("there is no previous page");
            }
        }

        public void nextpage() {
            if (curr.next != null) {
                curr = curr.next;
                System.out.println("the next page is:" + curr.link);
            } else {
                System.out.println("there is no next page");
            }
        }

        public void currentpage() {
            System.out.print("Current page is:" + curr.link);
        }

        public void printhistory() {
            Node temp = curr;
            while (temp.prev != null) {
                temp = temp.prev;
            }
            System.out.println("\n Browser History");
            while (temp != null) {
                if (temp == curr) {
                    System.out.print("[" + temp.link + "]" + "->");
                } else {
                    System.out.print(temp.link + "->");
                }
                temp = temp.next;
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter HomePage: ");
        String homepage = sc.nextLine();
        Browserhis obj = new Browserhis(homepage);
        int options;
        do {
            System.out.println("\n===== Browser Menu =====");
            System.out.println("1. Visit New Page");
            System.out.println("2. Back");
            System.out.println("3. Forward");
            System.out.println("4. Show Current Page");
            System.out.println("5. Print History");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            options = sc.nextInt();
            sc.nextLine();
            switch (options) {
                case 1:
                    System.out.print("Enter URL: ");
                    String link = sc.nextLine();
                    obj.visit(link);
                    break;
                case 2:
                    obj.goback();
                    break;
                case 3:
                    obj.nextpage();
                    break;
                case 4:
                    obj.currentpage();
                    break;
                case 5:
                    obj.printhistory();
                    break;
                case 6:
                    System.out.println("Exiting Browser");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (options != 6);

        sc.close();

    }
}
