package gp;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f39829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f39830b;

    public a() {
        this(null);
    }

    @Override // gp.f
    public void a(String str, Object obj) {
        ip.a.h(str, "Id");
        if (obj != null) {
            this.f39830b.put(str, obj);
        } else {
            this.f39830b.remove(str);
        }
    }

    @Override // gp.f
    public Object getAttribute(String str) {
        f fVar;
        ip.a.h(str, "Id");
        Object obj = this.f39830b.get(str);
        return (obj != null || (fVar = this.f39829a) == null) ? obj : fVar.getAttribute(str);
    }

    public String toString() {
        return this.f39830b.toString();
    }

    public a(f fVar) {
        this.f39830b = new ConcurrentHashMap();
        this.f39829a = fVar;
    }
}
