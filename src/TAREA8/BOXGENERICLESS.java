package TAREA8;
import java.util.Arrays;

public class BOXGENERICLESS {
    Object[] content;

    public BOXGENERICLESS() {
    }

    public BOXGENERICLESS(Object[] content) {
        this.content = content;
    }

    public void add(int pos, Object objeto){
        content[pos] = objeto;
    }

    public Object get(int pos){
        return content[pos];
    }

    @Override
    public String toString() {
        return "CajaSinGenericos{" +
                "content=" + Arrays.toString(content) +
                '}';
    }
}