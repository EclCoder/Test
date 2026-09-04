package b5;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.l;
import i5.p;
import i5.q;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f8424a = l.f("Schedulers");

    static e a(Context context, i iVar) {
        d5.b bVar = new d5.b(context, iVar);
        j5.e.a(context, SystemJobService.class, true);
        l.c().a(f8424a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        return bVar;
    }

    public static void b(androidx.work.b bVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        q qVarB = workDatabase.B();
        workDatabase.c();
        try {
            List listN = qVarB.n(bVar.h());
            List listJ = qVarB.j(200);
            if (listN != null && listN.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator it = listN.iterator();
                while (it.hasNext()) {
                    qVarB.l(((p) it.next()).f41040a, jCurrentTimeMillis);
                }
            }
            workDatabase.r();
            workDatabase.g();
            if (listN != null && listN.size() > 0) {
                p[] pVarArr = (p[]) listN.toArray(new p[listN.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    e eVar = (e) it2.next();
                    if (eVar.c()) {
                        eVar.e(pVarArr);
                    }
                }
            }
            if (listJ == null || listJ.size() <= 0) {
                return;
            }
            p[] pVarArr2 = (p[]) listJ.toArray(new p[listJ.size()]);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                e eVar2 = (e) it3.next();
                if (!eVar2.c()) {
                    eVar2.e(pVarArr2);
                }
            }
        } catch (Throwable th2) {
            workDatabase.g();
            throw th2;
        }
    }
}
