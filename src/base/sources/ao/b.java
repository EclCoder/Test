package ao;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class b implements Serializable {
    private static final long serialVersionUID = -6024911025449780478L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Throwable f8021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f8022b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f8023c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f8024d = new HashMap();

    public b(Throwable th2) {
        this.f8021a = th2;
    }

    private String b(Locale locale, String str) {
        StringBuilder sb2 = new StringBuilder();
        int size = this.f8022b.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            sb2.append(new MessageFormat(((c) this.f8022b.get(i11)).f(locale), locale).format((Object[]) this.f8023c.get(i11)));
            i10++;
            if (i10 < size) {
                sb2.append(str);
            }
        }
        return sb2.toString();
    }

    private void c(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        int i10 = objectInputStream.readInt();
        this.f8024d = new HashMap();
        for (int i11 = 0; i11 < i10; i11++) {
            this.f8024d.put((String) objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void d(ObjectInputStream objectInputStream) throws IOException {
        int i10 = objectInputStream.readInt();
        this.f8022b = new ArrayList(i10);
        this.f8023c = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f8022b.add((c) objectInputStream.readObject());
            int i12 = objectInputStream.readInt();
            Object[] objArr = new Object[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                objArr[i13] = objectInputStream.readObject();
            }
            this.f8023c.add(objArr);
        }
    }

    private String j(Object obj) {
        return "[Object could not be serialized: " + obj.getClass().getName() + "]";
    }

    private void k(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f8024d.keySet().size());
        for (String str : this.f8024d.keySet()) {
            objectOutputStream.writeObject(str);
            Object obj = this.f8024d.get(str);
            if (obj instanceof Serializable) {
                objectOutputStream.writeObject(obj);
            } else {
                objectOutputStream.writeObject(j(obj));
            }
        }
    }

    private void l(ObjectOutputStream objectOutputStream) throws IOException {
        int size = this.f8022b.size();
        objectOutputStream.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            objectOutputStream.writeObject((c) this.f8022b.get(i10));
            Object[] objArr = (Object[]) this.f8023c.get(i10);
            objectOutputStream.writeInt(objArr.length);
            for (Object obj : objArr) {
                if (obj instanceof Serializable) {
                    objectOutputStream.writeObject(obj);
                } else {
                    objectOutputStream.writeObject(j(obj));
                }
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.f8021a = (Throwable) objectInputStream.readObject();
        d(objectInputStream);
        c(objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.f8021a);
        l(objectOutputStream);
        k(objectOutputStream);
    }

    public void a(c cVar, Object... objArr) {
        this.f8022b.add(cVar);
        this.f8023c.add(a.a(objArr));
    }

    public String g() {
        return i(Locale.getDefault());
    }

    public String h() {
        return i(Locale.US);
    }

    public String i(Locale locale) {
        return b(locale, ": ");
    }
}
