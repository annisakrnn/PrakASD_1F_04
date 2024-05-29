public class binarytreearraymain04 {
    public static void main(String[] args) {
        binarytreearray04 bta = new binarytreearray04();
        int[] data = {6,4,8,3,5,7,9,0,0,0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.print("\nInOrder travesal : ");
        bta.traverseInOrder(0);
        System.out.println("\n");
    }
}
