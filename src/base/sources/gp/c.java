package gp;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedList f39833a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f39834b = new HashMap();

    private void e(Object obj) {
        Object objRemove = this.f39834b.remove(obj.getClass());
        if (objRemove != null) {
            this.f39833a.remove(objRemove);
        }
        this.f39834b.put(obj.getClass(), obj);
    }

    public c a(Object... objArr) {
        if (objArr != null) {
            for (Object obj : objArr) {
                c(obj);
            }
        }
        return this;
    }

    public c b(Object obj) {
        if (obj == null) {
            return this;
        }
        e(obj);
        this.f39833a.addFirst(obj);
        return this;
    }

    public c c(Object obj) {
        if (obj == null) {
            return this;
        }
        e(obj);
        this.f39833a.addLast(obj);
        return this;
    }

    public LinkedList d() {
        return new LinkedList(this.f39833a);
    }
}
