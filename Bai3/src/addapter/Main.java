package addapter;

public class Main {
    public static void main(String[] args) {
        // Tạo một đối tượng TextFile
        TextFile textFile = new TextFile();

        // Sử dụng adapter để chuyển đổi từ TextFile sang File interface
        File fileAdapter = new TextFileAdapter(textFile);

        // Gọi các phương thức của File interface
        fileAdapter.read();
        fileAdapter.write();
    }
}

