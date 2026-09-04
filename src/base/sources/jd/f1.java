package jd;

import android.app.ApplicationExitInfo;
import android.content.Context;
import android.system.OsConstants;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i0 f42278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pd.h f42279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qd.b f42280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ld.f f42281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ld.o f42282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final r0 f42283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final kd.i f42284g;

    f1(i0 i0Var, pd.h hVar, qd.b bVar, ld.f fVar, ld.o oVar, r0 r0Var, kd.i iVar) {
        this.f42278a = i0Var;
        this.f42279b = hVar;
        this.f42280c = bVar;
        this.f42281d = fVar;
        this.f42282e = oVar;
        this.f42283f = r0Var;
        this.f42284g = iVar;
    }

    public static /* synthetic */ void a(f1 f1Var, md.h0.f.d dVar, ld.c cVar, boolean z10) {
        f1Var.getClass();
        gd.g.f().b("disk worker: log non-fatal event to persistence");
        f1Var.f42279b.A(dVar, cVar.b(), z10);
    }

    public static /* synthetic */ boolean c(ApplicationExitInfo applicationExitInfo) {
        return (applicationExitInfo.getReason() == 3 && applicationExitInfo.getDescription() != null && applicationExitInfo.getDescription().contains("OOM")) || (applicationExitInfo.getReason() == 2 && applicationExitInfo.getStatus() == OsConstants.SIGKILL);
    }

    public static /* synthetic */ Optional d(f1 f1Var, String str, List list) {
        return f1Var.u(str, list) ? Optional.of(7) : Optional.empty();
    }

    public static /* synthetic */ boolean g(ApplicationExitInfo applicationExitInfo) {
        return applicationExitInfo.getReason() == 6;
    }

    private md.h0.f.d h(md.h0.f.d dVar, ld.f fVar, ld.o oVar) {
        return i(dVar, fVar, oVar, Collections.EMPTY_MAP);
    }

    private md.h0.f.d i(md.h0.f.d dVar, ld.f fVar, ld.o oVar, Map map) {
        md.h0.f.d.b bVarH = dVar.h();
        String strC = fVar.c();
        if (strC != null) {
            bVarH.d(md.h0.f.d.AbstractC0707d.a().b(strC).a());
        } else {
            gd.g.f().i("No log data to include with this event.");
        }
        List listS = s(oVar.f(map));
        List listS2 = s(oVar.g());
        if (!listS.isEmpty() || !listS2.isEmpty()) {
            bVarH.b(dVar.b().i().e(listS).g(listS2).a());
        }
        return bVarH.a();
    }

    private md.h0.f.d j(md.h0.f.d dVar, Map map) {
        return k(i(dVar, this.f42281d, this.f42282e, map), this.f42282e);
    }

    private md.h0.f.d k(md.h0.f.d dVar, ld.o oVar) {
        List listH = oVar.h();
        if (listH.isEmpty()) {
            return dVar;
        }
        md.h0.f.d.b bVarH = dVar.h();
        bVarH.e(md.h0.f.d.AbstractC0708f.a().b(listH).a());
        return bVarH.a();
    }

    private static md.h0.a l(ApplicationExitInfo applicationExitInfo) {
        String strM = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                strM = m(traceInputStream);
            }
        } catch (IOException e10) {
            gd.g.f().k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e10);
        }
        return md.h0.a.a().c(applicationExitInfo.getImportance()).e(applicationExitInfo.getProcessName()).g(applicationExitInfo.getReason()).i(applicationExitInfo.getTimestamp()).d(applicationExitInfo.getPid()).f(applicationExitInfo.getPss()).h(applicationExitInfo.getRss()).j(strM).a();
    }

    public static String m(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i10 = bufferedInputStream.read(bArr);
                    if (i10 == -1) {
                        String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return string;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            bufferedInputStream.close();
            throw th5;
        }
    }

    public static f1 n(Context context, r0 r0Var, pd.j jVar, a aVar, ld.f fVar, ld.o oVar, sd.d dVar, rd.j jVar2, w0 w0Var, m mVar, kd.i iVar) {
        return new f1(new i0(context, r0Var, aVar, dVar, jVar2), new pd.h(jVar, jVar2, mVar), qd.b.b(context, jVar2, w0Var), fVar, oVar, r0Var, iVar);
    }

    private j0 o(j0 j0Var) {
        if (j0Var.b().h() != null && j0Var.b().g() != null) {
            return j0Var;
        }
        q0 q0VarD = this.f42283f.d(true);
        return j0.a(j0Var.b().t(q0VarD.b()).s(q0VarD.a()), j0Var.d(), j0Var.c());
    }

    private ApplicationExitInfo r(String str, List list, Predicate predicate) {
        long jT = this.f42279b.t(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoA = j5.c.a(it.next());
            if (applicationExitInfoA.getTimestamp() >= jT && predicate.test(applicationExitInfoA)) {
                return applicationExitInfoA;
            }
        }
        return null;
    }

    private static List s(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(md.h0.c.a().b((String) entry.getKey()).c((String) entry.getValue()).a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: jd.b1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((md.h0.c) obj).b().compareTo(((md.h0.c) obj2).b());
            }
        });
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean x(Task task) {
        if (!task.isSuccessful()) {
            gd.g.f().l("Crashlytics report could not be enqueued to DataTransport", task.getException());
            return false;
        }
        j0 j0Var = (j0) task.getResult();
        gd.g.f().b("Crashlytics report successfully enqueued to DataTransport: " + j0Var.d());
        File fileC = j0Var.c();
        if (fileC.delete()) {
            gd.g.f().b("Deleted report file: " + fileC.getPath());
            return true;
        }
        gd.g.f().k("Crashlytics could not delete report file: " + fileC.getPath());
        return true;
    }

    private void y(Throwable th2, Thread thread, String str, final ld.c cVar, boolean z10) {
        final boolean zEquals = str.equals(AppMeasurement.CRASH_ORIGIN);
        final md.h0.f.d dVarJ = j(this.f42278a.d(th2, thread, str, cVar.c(), 4, 8, z10), cVar.a());
        if (z10) {
            this.f42279b.A(dVarJ, cVar.b(), zEquals);
        } else {
            this.f42284g.f43180b.e(new Runnable() { // from class: jd.y0
                @Override // java.lang.Runnable
                public final void run() {
                    f1.a(this.f42425a, dVarJ, cVar, zEquals);
                }
            });
        }
    }

    public void A(Throwable th2, Thread thread, ld.c cVar) {
        gd.g.f().i("Persisting non-fatal event for session " + cVar.b());
        y(th2, thread, "error", cVar, false);
    }

    public void B(final String str, List list, final List list2) {
        x0.a(list.stream().findFirst(), new Supplier() { // from class: jd.c1
            @Override // java.util.function.Supplier
            public final Object get() {
                return f1.d(this.f42259a, str, list2);
            }
        }).ifPresent(new Consumer() { // from class: jd.d1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f42265a.f42279b.B(md.h0.e.a().b(md.h0.e.b.a().b(((Integer) obj).intValue()).a()).a(), str);
            }
        });
    }

    public void C(String str, List list, ld.f fVar, ld.o oVar) {
        ApplicationExitInfo applicationExitInfoR = r(str, list, new Predicate() { // from class: jd.a1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return f1.g((ApplicationExitInfo) obj);
            }
        });
        if (applicationExitInfoR == null) {
            gd.g.f().i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        md.h0.f.d dVarC = this.f42278a.c(l(applicationExitInfoR));
        gd.g.f().b("Persisting anr for session " + str);
        this.f42279b.A(k(h(dVarC, fVar, oVar), oVar), str, true);
    }

    public void D() {
        this.f42279b.l();
    }

    public Task E(Executor executor) {
        return F(executor, null);
    }

    public Task F(Executor executor, String str) {
        List<j0> listY = this.f42279b.y();
        ArrayList arrayList = new ArrayList();
        for (j0 j0Var : listY) {
            if (str == null || str.equals(j0Var.d())) {
                arrayList.add(this.f42280c.c(o(j0Var), str != null).continueWith(executor, new Continuation() { // from class: jd.z0
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        return Boolean.valueOf(this.f42432a.x(task));
                    }
                }));
            }
        }
        return Tasks.whenAll(arrayList);
    }

    public void p(String str, List list, md.h0.a aVar) {
        gd.g.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            md.h0.d.b bVarA = ((u0) it.next()).a();
            if (bVarA != null) {
                arrayList.add(bVarA);
            }
        }
        this.f42279b.o(str, md.h0.d.a().b(Collections.unmodifiableList(arrayList)).a(), aVar);
    }

    public void q(long j10, String str) {
        this.f42279b.n(str, j10);
    }

    public boolean t() {
        return this.f42279b.u();
    }

    boolean u(String str, List list) {
        return r(str, list, new Predicate() { // from class: jd.e1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return f1.c((ApplicationExitInfo) obj);
            }
        }) != null;
    }

    public SortedSet v() {
        return this.f42279b.s();
    }

    public void w(String str, long j10) {
        this.f42279b.C(this.f42278a.e(str, j10));
    }

    public void z(Throwable th2, Thread thread, String str, long j10) {
        gd.g.f().i("Persisting fatal event for session " + str);
        y(th2, thread, AppMeasurement.CRASH_ORIGIN, new ld.c(str, j10), true);
    }
}
