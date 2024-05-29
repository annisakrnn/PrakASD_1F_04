public class binarytreemain04 {
    public static void main(String[] args) {
        binarytree04 bta = new binarytree04();
        int[] data = {6,4,8,3,5,7,9,0,0,0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.print("\nInOrder travesal : ");
        bta.traverseInOrder(0);
        System.out.println("\n");
    }
}
