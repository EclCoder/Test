package j5;

import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import androidx.work.u;
import androidx.work.w;
import i5.p;
import i5.q;
import i5.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f42013c = androidx.work.l.f("EnqueueRunnable");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b5.g f42014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b5.c f42015b = new b5.c();

    public b(b5.g gVar) {
        this.f42014a = gVar;
    }

    private static boolean b(b5.g gVar) {
        boolean zC = c(gVar.g(), gVar.f(), (String[]) b5.g.l(gVar).toArray(new String[0]), gVar.d(), gVar.b());
        gVar.k();
        return zC;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0135 A[PHI: r0 r8 r11 r12 r13
      0x0135: PHI (r0v1 java.lang.String[]) = 
      (r0v0 java.lang.String[])
      (r0v0 java.lang.String[])
      (r0v0 java.lang.String[])
      (r0v13 java.lang.String[])
      (r0v13 java.lang.String[])
     binds: [B:28:0x0061, B:29:0x0063, B:31:0x0071, B:81:0x0134, B:80:0x0132] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r8v2 boolean) = (r8v1 boolean), (r8v1 boolean), (r8v1 boolean), (r8v5 boolean), (r8v6 boolean) binds: [B:28:0x0061, B:29:0x0063, B:31:0x0071, B:81:0x0134, B:80:0x0132] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r11v2 boolean) = (r11v1 boolean), (r11v1 boolean), (r11v1 boolean), (r11v4 boolean), (r11v4 boolean) binds: [B:28:0x0061, B:29:0x0063, B:31:0x0071, B:81:0x0134, B:80:0x0132] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r12v2 boolean) = (r12v1 boolean), (r12v1 boolean), (r12v1 boolean), (r12v5 boolean), (r12v5 boolean) binds: [B:28:0x0061, B:29:0x0063, B:31:0x0071, B:81:0x0134, B:80:0x0132] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r13v2 boolean) = (r13v1 boolean), (r13v1 boolean), (r13v1 boolean), (r13v5 boolean), (r13v5 boolean) binds: [B:28:0x0061, B:29:0x0063, B:31:0x0071, B:81:0x0134, B:80:0x0132] A[DONT_GENERATE, DONT_INLINE]] */
    private static boolean c(b5.i iVar, List list, String[] strArr, String str, androidx.work.f fVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        String[] strArr2 = strArr;
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabaseO = iVar.o();
        boolean z14 = strArr2 != null && strArr2.length > 0;
        if (z14) {
            z10 = false;
            z11 = false;
            z12 = true;
            for (String str2 : strArr2) {
                p pVarG = workDatabaseO.B().g(str2);
                if (pVarG == null) {
                    androidx.work.l.c().b(f42013c, String.format("Prerequisite %s doesn't exist; not enqueuing", str2), new Throwable[0]);
                    return false;
                }
                u uVar = pVarG.f41041b;
                z12 &= uVar == u.SUCCEEDED;
                if (uVar == u.FAILED) {
                    z11 = true;
                } else if (uVar == u.CANCELLED) {
                    z10 = true;
                }
            }
        } else {
            z10 = false;
            z11 = false;
            z12 = true;
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if (zIsEmpty || z14) {
            z13 = false;
        } else {
            List<p.b> listM = workDatabaseO.B().m(str);
            if (listM.isEmpty()) {
                z13 = false;
            } else if (fVar == androidx.work.f.APPEND || fVar == androidx.work.f.APPEND_OR_REPLACE) {
                i5.b bVarT = workDatabaseO.t();
                List arrayList = new ArrayList();
                for (p.b bVar : listM) {
                    if (!bVarT.d(bVar.f41058a)) {
                        u uVar2 = bVar.f41059b;
                        boolean z15 = (uVar2 == u.SUCCEEDED) & z12;
                        if (uVar2 == u.FAILED) {
                            z11 = true;
                        } else if (uVar2 == u.CANCELLED) {
                            z10 = true;
                        }
                        arrayList.add(bVar.f41058a);
                        z12 = z15;
                    }
                }
                if (fVar == androidx.work.f.APPEND_OR_REPLACE && (z10 || z11)) {
                    q qVarB = workDatabaseO.B();
                    Iterator it = qVarB.m(str).iterator();
                    while (it.hasNext()) {
                        qVarB.delete(((p.b) it.next()).f41058a);
                    }
                    arrayList = Collections.EMPTY_LIST;
                    z10 = false;
                    z11 = false;
                }
                strArr2 = (String[]) arrayList.toArray(strArr2);
                z14 = strArr2.length > 0;
                z13 = false;
            } else {
                if (fVar == androidx.work.f.KEEP) {
                    Iterator it2 = listM.iterator();
                    while (it2.hasNext()) {
                        u uVar3 = ((p.b) it2.next()).f41059b;
                        if (uVar3 == u.ENQUEUED || uVar3 == u.RUNNING) {
                            return false;
                        }
                    }
                }
                a.c(str, iVar, false).run();
                q qVarB2 = workDatabaseO.B();
                Iterator it3 = listM.iterator();
                while (it3.hasNext()) {
                    qVarB2.delete(((p.b) it3.next()).f41058a);
                }
                z13 = true;
            }
        }
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            w wVar = (w) it4.next();
            p pVarC = wVar.c();
            if (!z14 || z12) {
                if (pVarC.d()) {
                    pVarC.f41053n = 0L;
                } else {
                    pVarC.f41053n = jCurrentTimeMillis;
                }
            } else if (z11) {
                pVarC.f41041b = u.FAILED;
            } else if (z10) {
                pVarC.f41041b = u.CANCELLED;
            } else {
                pVarC.f41041b = u.BLOCKED;
            }
            if (Build.VERSION.SDK_INT <= 25) {
                g(pVarC);
            }
            if (pVarC.f41041b == u.ENQUEUED) {
                z13 = true;
            }
            workDatabaseO.B().d(pVarC);
            if (z14) {
                int length = strArr2.length;
                int i10 = 0;
                while (i10 < length) {
                    workDatabaseO.t().c(new i5.a(wVar.a(), strArr2[i10]));
                    i10++;
                    strArr2 = strArr2;
                    it4 = it4;
                }
            }
            String[] strArr3 = strArr2;
            Iterator it5 = it4;
            Iterator it6 = wVar.b().iterator();
            while (it6.hasNext()) {
                workDatabaseO.C().a(new s((String) it6.next(), wVar.a()));
            }
            if (!zIsEmpty) {
                workDatabaseO.z().b(new i5.j(str, wVar.a()));
            }
            strArr2 = strArr3;
            it4 = it5;
        }
        return z13;
    }

    private static boolean e(b5.g gVar) {
        List<b5.g> listE = gVar.e();
        boolean z10 = false;
        if (listE != null) {
            boolean zE = false;
            for (b5.g gVar2 : listE) {
                if (gVar2.j()) {
                    androidx.work.l.c().h(f42013c, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", gVar2.c())), new Throwable[0]);
                } else {
                    zE |= e(gVar2);
                }
            }
            z10 = zE;
        }
        return b(gVar) | z10;
    }

    private static void g(p pVar) {
        androidx.work.c cVar = pVar.f41049j;
        String str = pVar.f41042c;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (cVar.f() || cVar.i()) {
            androidx.work.e.a aVar = new androidx.work.e.a();
            aVar.c(pVar.f41044e).e("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            pVar.f41042c = ConstraintTrackingWorker.class.getName();
            pVar.f41044e = aVar.a();
        }
    }

    public boolean a() {
        WorkDatabase workDatabaseO = this.f42014a.g().o();
        workDatabaseO.c();
        try {
            boolean zE = e(this.f42014a);
            workDatabaseO.r();
            return zE;
        } finally {
            workDatabaseO.g();
        }
    }

    public androidx.work.o d() {
        return this.f42015b;
    }

    public void f() {
        b5.i iVarG = this.f42014a.g();
        b5.f.b(iVarG.i(), iVarG.o(), iVarG.n());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f42014a.h()) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f42014a));
            }
            if (a()) {
                e.a(this.f42014a.g().h(), RescheduleReceiver.class, true);
                f();
            }
            this.f42015b.a(androidx.work.o.f7998a);
        } catch (Throwable th2) {
            this.f42015b.a(new androidx.work.o.b.a(th2));
        }
    }
}
