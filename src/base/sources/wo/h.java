package wo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class h extends a implements Serializable {
    private static final long serialVersionUID = -2845454858205884623L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f56380b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient Charset f56381c;

    public h(Charset charset) {
        this.f56381c = charset == null ? co.b.f10155b : charset;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Charset charsetA = ip.d.a(objectInputStream.readUTF());
        this.f56381c = charsetA;
        if (charsetA == null) {
            this.f56381c = co.b.f10155b;
        }
        this.f56373a = (eo.i) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeUTF(this.f56381c.name());
        objectOutputStream.writeObject(this.f56373a);
    }
}
