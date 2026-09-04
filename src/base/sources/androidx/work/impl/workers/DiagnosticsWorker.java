package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.l;
import b5.i;
import i5.g;
import i5.h;
import i5.k;
import i5.p;
import i5.q;
import i5.t;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f7986a = l.f("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private static String a(p pVar, String str, Integer num, String str2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", pVar.f41040a, pVar.f41042c, num, pVar.f41041b.name(), str, str2);
    }

    private static String c(k kVar, t tVar, h hVar, List list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", "Job Id"));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            g gVarA = hVar.a(pVar.f41040a);
            sb2.append(a(pVar, TextUtils.join(",", kVar.a(pVar.f41040a)), gVarA != null ? Integer.valueOf(gVarA.f41018b) : null, TextUtils.join(",", tVar.b(pVar.f41040a))));
        }
        return sb2.toString();
    }

    @Override // androidx.work.Worker
    public ListenableWorker.a doWork() {
        WorkDatabase workDatabaseO = i.k(getApplicationContext()).o();
        q qVarB = workDatabaseO.B();
        k kVarZ = workDatabaseO.z();
        t tVarC = workDatabaseO.C();
        h hVarY = workDatabaseO.y();
        List listB = qVarB.b(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List listP = qVarB.p();
        List listJ = qVarB.j(200);
        if (listB != null && !listB.isEmpty()) {
            l lVarC = l.c();
            String str = f7986a;
            lVarC.d(str, "Recently completed work:\n\n", new Throwable[0]);
            l.c().d(str, c(kVarZ, tVarC, hVarY, listB), new Throwable[0]);
        }
        if (listP != null && !listP.isEmpty()) {
            l lVarC2 = l.c();
            String str2 = f7986a;
            lVarC2.d(str2, "Running work:\n\n", new Throwable[0]);
            l.c().d(str2, c(kVarZ, tVarC, hVarY, listP), new Throwable[0]);
        }
        if (listJ != null && !listJ.isEmpty()) {
            l lVarC3 = l.c();
            String str3 = f7986a;
            lVarC3.d(str3, "Enqueued work:\n\n", new Throwable[0]);
            l.c().d(str3, c(kVarZ, tVarC, hVarY, listJ), new Throwable[0]);
        }
        return ListenableWorker.a.c();
    }
}
