public class SingleLinkedList04 {
    Node04 head, tail;

    boolean isEmpty(){
        return head == null;
    }

    void print(){
        if(!isEmpty()){
            Node04 tmp = head;
            System.out.println("Isi Linked List");
            while(tmp != null){
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(int input){
        Node04 ndInput = new Node04(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        }else{
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input){
        Node04 ndInput = new Node04(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input){
        Node04 ndInput = new Node04(input, null);
        Node04 temp = head;
        while(temp != null){
            if(temp.data == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null){
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
    }

    void insertAt(int index, int input){
        Node04 ndInput = new Node04(input, null);
        if(index < 0){
            System.out.println("perbaiki logikanya!"
                        + "kalau indeksnya -1 bagaimana??");
        }else if(index == 0){
            addFirst(input);
        }else{
            Node04 temp = head;
            for(int i = 0; i < index; i++){
                temp = temp.next;
            }
            temp.next = new Node04(input, temp.next);
                if(temp.next.next == null){
                    tail = ndInput;
                }
            }
        }
    }


        
