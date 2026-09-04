package rm;

import gl.r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f51378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f51379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f51380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f51381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f51382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f51383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f51384g;

    public a(String serialName) {
        s.h(serialName, "serialName");
        this.f51378a = serialName;
        this.f51379b = r.l();
        this.f51380c = new ArrayList();
        this.f51381d = new HashSet();
        this.f51382e = new ArrayList();
        this.f51383f = new ArrayList();
        this.f51384g = new ArrayList();
    }

    public static /* synthetic */ void b(a aVar, String str, f fVar, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = r.l();
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        aVar.a(str, fVar, list, z10);
    }

    public final void a(String elementName, f descriptor, List annotations, boolean z10) {
        s.h(elementName, "elementName");
        s.h(descriptor, "descriptor");
        s.h(annotations, "annotations");
        if (this.f51381d.add(elementName)) {
            this.f51380c.add(elementName);
            this.f51382e.add(descriptor);
            this.f51383f.add(annotations);
            this.f51384g.add(Boolean.valueOf(z10));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + elementName + "' is already registered in " + this.f51378a).toString());
    }

    public final List c() {
        return this.f51379b;
    }

    public final List d() {
        return this.f51383f;
    }

    public final List e() {
        return this.f51382e;
    }

    public final List f() {
        return this.f51380c;
    }

    public final List g() {
        return this.f51384g;
    }

    public final void h(List list) {
        s.h(list, "<set-?>");
        this.f51379b = list;
    }
}
