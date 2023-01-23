package Билет13_;

class ListNode13 {
    public int data;
    public ListNode13 next;

    public ListNode13() {
    }

    public ListNode13(int data) {
        this.data = data;
    }

    public ListNode13(int data, ListNode13 next) {
        this.data = data;
        this.next = next;
    }


}
public class task13 {
    public static void main(String[] args) {
        ListNode13 list = new ListNode13(1, new ListNode13(2));
        list.next.next = new ListNode13(3);

    }

}
