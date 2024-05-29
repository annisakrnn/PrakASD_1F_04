public class binarytreearray04 {
    int[] data;
    int idxLast;

    public binarytreearray04(){
        data = new int[10];
    }
    void populateData(int data[], int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }
    void traverseInOrder(int idxStart){
        if (idxStart<=idxLast) {
            traverseInOrder(2*idxStart+1);
            System.out.print(data[idxStart]+" ");
            traverseInOrder(2*idxStart+2);
        }
    }
void add(int data) {
    if (idxLast == this.data.length-1) {
        System.out.println("Tree sudah penuh");
    }else{
        this.data[idxLast++] = data;
            }
        }
        void traversePreOrder(int idxStart) {
            if (idxStart <=idxLast) {
                System.out.print("" + data[idxStart]+" ");
                traversePreOrder(2*idxStart+1);
                traversePreOrder(2*idxLast+2);
            }
        }
    
        void traversePostOrder(int idxStart) {
            if (idxStart < idxLast) {
                traversePreOrder(2*idxStart+1);
                traversePreOrder(2*idxLast+2);
                System.out.print("" + data[idxStart]+" ");
            }
        }
    }

