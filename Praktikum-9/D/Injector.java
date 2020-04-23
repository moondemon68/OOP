import java.lang.reflect.Field;
import java.util.List;
import java.util.ArrayList;

public class Injector {
    List<Object> objects;
    public Injector() {
        objects = new ArrayList<Object>();
    }
    // Menerima sebuah definisi dependencies
    // yang berupa sebuah instansiasi kelas
    // Catatan: Injector bisa menampung lebih dari 1 dependency,
    //          jadi injector bisa menginject banyak sekaligus.
    //          Jika ada 2 objek dengan kelas yang sama,
    //          inject dengan object terakhir yang di add ke daftar dependency
    void addDependencies(Object object) {
        objects.add(object);
    }
    /*
      Menginjeksi dependencies yang telah dibuat ke dalam objek
      Injeksi dilakukan dengan mengacu pada dependencies yang ditambah
      pada method addDependencies.
  
      Setiap field di object yang diinject, bila kelasnya
      sudah ditambahkan sebagai dependency, maka akan diset sebagai
      object yang sudah di add didependency.
    */
    void inject(Object object) throws Exception {
        Field[] fields = object.getClass().getDeclaredFields();
        for (Object o : objects) {
            for (Field f : fields) {
                if (f.getType() == o.getClass()) {
                    f.setAccessible(true);
                    f.set(object, o);
                }
            }
        }
    }
}