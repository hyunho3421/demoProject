import java.io.File;

/**
 *
 * 윈도우 디스크 용량 체크 예제
 *
 */
public class DiskReadExample {
    public static void main(String[] args) {
        long freeSpace = new File("D:").getFreeSpace();
        long totalSpace = new File("D:").getTotalSpace();
        long usableSpace = new File("D:").getUsableSpace();
        System.out.println(freeSpace);
        System.out.println(totalSpace);
        System.out.println(usableSpace);

        File[] roots = File.listRoots();

        for (File file : roots) {
            double free = file.getFreeSpace() / Math.pow(1024, 3);
            double total = file.getTotalSpace() / Math.pow(1024, 3);
            double usable = total - free;

            System.out.println(file.getPath() + " : " + String.format("%.2f", free) + "GB");
            System.out.println(file.getPath() + " : " + String.format("%.2f", usable) + "GB");
            System.out.println(file.getPath() + " : " + String.format("%.2f", total) + "GB");
        }
    }
}
