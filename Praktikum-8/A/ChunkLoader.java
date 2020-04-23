import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ChunkLoader implements Runnable {
    Chunk chunk;
    String chunkDataFilename;
    // ... Anda boleh menambahkan atribut

    public ChunkLoader(Chunk chunk, String chunkDataFilename) {
        // ... Isilah constructor sesuai kebutuhan
        this.chunk = chunk;
        this.chunkDataFilename = chunkDataFilename;
    }

    @Override
    public void run() {
        // Membaca file dengan nama chunkDataFilename
        // Gunakan class CSVReader.
        // Contoh file chunkDataFilename:
        // x,y
        // 1,18
        // 10,8
        // 6,12
        // Untuk setiap x dan y, tambahkan tree ke Chunk
        try {
            CSVReader reader = new CSVReader(chunkDataFilename, ",");
            reader.setSkipHeader(true);
            List<String[]> lol = reader.read();
            for (String[] tes : lol) {
                Position p = new Position(Integer.parseInt(tes[0]), Integer.parseInt(tes[1]));
                chunk.addTree(p);
            }
        } catch (Exception e) {
            // kosong gan
        }
        // Jika ada IOException pada saat membaca reader, catch Exception
        // tidak ada tree yang ditambahkan pada Chunk (tidak dithrow lagi)
    }
}
