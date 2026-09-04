package tj;

import gl.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import oj.g;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f53433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f53434b;

    public c(HashMap commandHistory, List headerHistory) {
        s.h(commandHistory, "commandHistory");
        s.h(headerHistory, "headerHistory");
        this.f53433a = commandHistory;
        this.f53434b = headerHistory;
    }

    public final g a(int i10) {
        for (g gVar : r.u0(this.f53434b)) {
            if (gVar.a().a() == i10) {
                return gVar;
            }
        }
        return null;
    }

    public final String b(int i10) {
        return (String) this.f53433a.get(Integer.valueOf(i10));
    }

    public final void c() {
        this.f53433a.clear();
        this.f53434b.clear();
    }

    public final void d(int i10, String name) {
        s.h(name, "name");
        this.f53433a.put(Integer.valueOf(i10), name);
    }

    public final void e(g header) {
        s.h(header, "header");
        this.f53434b.add(header);
    }

    public /* synthetic */ c(HashMap map, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new HashMap() : map, (i10 & 2) != 0 ? new ArrayList() : list);
    }
}
