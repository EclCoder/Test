package ep;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class b extends a implements Serializable, Cloneable {
    private static final long serialVersionUID = -7086398485908701455L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f38115a = new ConcurrentHashMap();

    public void b(d dVar) {
        for (Map.Entry entry : this.f38115a.entrySet()) {
            dVar.setParameter((String) entry.getKey(), entry.getValue());
        }
    }

    public Object clone() {
        b bVar = (b) super.clone();
        b(bVar);
        return bVar;
    }

    @Override // ep.d
    public d g() {
        try {
            return (d) clone();
        } catch (CloneNotSupportedException unused) {
            throw new UnsupportedOperationException("Cloning not supported");
        }
    }

    @Override // ep.d
    public Object getParameter(String str) {
        return this.f38115a.get(str);
    }

    @Override // ep.a, ep.e
    public Set m() {
        return new HashSet(this.f38115a.keySet());
    }

    @Override // ep.d
    public d setParameter(String str, Object obj) {
        if (str == null) {
            return this;
        }
        if (obj != null) {
            this.f38115a.put(str, obj);
            return this;
        }
        this.f38115a.remove(str);
        return this;
    }

    public String toString() {
        return "[parameters=" + this.f38115a + "]";
    }
}
