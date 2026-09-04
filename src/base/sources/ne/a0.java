package ne;

import android.content.Context;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f47092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fl.k f47093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f47094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final fl.k f47095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final fl.k f47096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f47097f;

    public a0(Context appContext, final z0 uuidGenerator) {
        kotlin.jvm.internal.s.h(appContext, "appContext");
        kotlin.jvm.internal.s.h(uuidGenerator, "uuidGenerator");
        this.f47092a = appContext;
        this.f47093b = fl.l.b(new tl.a() { // from class: ne.x
            @Override // tl.a
            public final Object invoke() {
                return a0.p(this.f47308a);
            }
        });
        this.f47094c = Process.myPid();
        this.f47095d = fl.l.b(new tl.a() { // from class: ne.y
            @Override // tl.a
            public final Object invoke() {
                return a0.q(uuidGenerator);
            }
        });
        this.f47096e = fl.l.b(new tl.a() { // from class: ne.z
            @Override // tl.a
            public final Object invoke() {
                return a0.o(this.f47311a);
            }
        });
    }

    private final List j() {
        return d0.f47156a.a(this.f47092a);
    }

    private final c0 l() {
        return (c0) this.f47096e.getValue();
    }

    private final boolean n(c0 c0Var, ProcessData processData) {
        if (kotlin.jvm.internal.s.c(a(), c0Var.c())) {
            return (c0Var.b() == processData.getPid() && kotlin.jvm.internal.s.c(m(), processData.getUuid())) ? false : true;
        }
        return c0Var.b() != processData.getPid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c0 o(a0 a0Var) {
        return d0.f47156a.b(a0Var.f47092a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String p(a0 a0Var) {
        return a0Var.l().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String q(z0 z0Var) {
        String string = z0Var.next().toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        return string;
    }

    @Override // ne.w
    public String a() {
        return (String) this.f47093b.getValue();
    }

    @Override // ne.w
    public boolean b(Map processDataMap) {
        kotlin.jvm.internal.s.h(processDataMap, "processDataMap");
        ProcessData processData = (ProcessData) processDataMap.get(a());
        return (processData != null && processData.getPid() == k() && kotlin.jvm.internal.s.c(processData.getUuid(), m())) ? false : true;
    }

    @Override // ne.w
    public Map c(Map map) {
        Map mapV;
        if (map != null && (mapV = gl.l0.v(map)) != null) {
            mapV.put(a(), new ProcessData(Process.myPid(), m()));
            Map mapT = gl.l0.t(mapV);
            if (mapT != null) {
                return mapT;
            }
        }
        return gl.l0.f(fl.w.a(a(), new ProcessData(Process.myPid(), m())));
    }

    @Override // ne.w
    public void d() {
        this.f47097f = true;
    }

    @Override // ne.w
    public boolean e(Map processDataMap) {
        kotlin.jvm.internal.s.h(processDataMap, "processDataMap");
        if (this.f47097f) {
            return false;
        }
        List<c0> listJ = j();
        ArrayList arrayList = new ArrayList();
        for (c0 c0Var : listJ) {
            ProcessData processData = (ProcessData) processDataMap.get(c0Var.c());
            fl.q qVar = processData != null ? new fl.q(c0Var, processData) : null;
            if (qVar != null) {
                arrayList.add(qVar);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            fl.q qVar2 = (fl.q) obj;
            if (!n((c0) qVar2.d(), (ProcessData) qVar2.g())) {
                return false;
            }
        }
        return true;
    }

    @Override // ne.w
    public Map f() {
        return w.a.a(this);
    }

    public int k() {
        return this.f47094c;
    }

    public String m() {
        return (String) this.f47095d.getValue();
    }
}
