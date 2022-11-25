package movist;

public class Main {
    public static void main(String[] args) {
        StreamAPI streamAPI = new StreamAPI();
        /*System.out.println(streamAPI.filterMethod(120000));
        System.out.println(streamAPI.mapMethod());
        System.out.println(streamAPI.forEachMethod(1.25));
        System.out.println(streamAPI.mapMethod());
        System.out.println(streamAPI.filterMethod(120000));
        System.out.println(streamAPI.sortedMethod());
        System.out.println(streamAPI.mapMethod());
        System.out.println(streamAPI.collectMethod());*/
        System.out.println("\n\n" + "streamAPI.mapMethod()" + streamAPI.mapMethod());
        System.out.println("\n\n" + "streamAPI.filterMethod()" + streamAPI.filterMethod(130000));
        System.out.println("\n\n" + "streamAPI.forEachMethod()" + streamAPI.forEachMethod(1.25));
        System.out.println("\n\n" + "streamAPI.sortedMethod()" + streamAPI.sortedMethod());
        System.out.println("\n\n" + "streamAPI.collectMethod()" + streamAPI.collectMethod());
    }
}