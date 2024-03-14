package addapter;

// Adapter
public class TextFileAdapter implements File {
    private TextFile textFile;

    public TextFileAdapter(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public void read() {
        textFile.textRead();
    }

    @Override
    public void write() {
        textFile.textWrite();
    }
}
