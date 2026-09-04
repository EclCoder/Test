package gd;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import gl.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.s;
import md.h0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f39126a = new i();

    private i() {
    }

    public static /* synthetic */ h0.f.d.a.c c(i iVar, String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            z10 = false;
        }
        return iVar.b(str, i10, i11, z10);
    }

    private final String f() {
        String processName;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 33) {
            return (i10 < 28 || (processName = Application.getProcessName()) == null) ? "" : processName;
        }
        String strMyProcessName = Process.myProcessName();
        s.e(strMyProcessName);
        return strMyProcessName;
    }

    public final h0.f.d.a.c a(String processName, int i10, int i11) {
        s.h(processName, "processName");
        return c(this, processName, i10, i11, false, 8, null);
    }

    public final h0.f.d.a.c b(String processName, int i10, int i11, boolean z10) {
        s.h(processName, "processName");
        h0.f.d.a.c cVarA = h0.f.d.a.c.a().e(processName).d(i10).c(i11).b(z10).a();
        s.g(cVarA, "build(...)");
        return cVarA;
    }

    public final List d(Context context) {
        List<ActivityManager.RunningAppProcessInfo> listL;
        s.h(context, "context");
        int i10 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (listL = activityManager.getRunningAppProcesses()) == null) {
            listL = r.l();
        }
        List listY = r.Y(listL);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listY) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i10) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r.v(arrayList, 10));
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj2;
            arrayList2.add(h0.f.d.a.c.a().e(runningAppProcessInfo.processName).d(runningAppProcessInfo.pid).c(runningAppProcessInfo.importance).b(s.c(runningAppProcessInfo.processName, str)).a());
        }
        return arrayList2;
    }

    public final h0.f.d.a.c e(Context context) {
        Object next;
        s.h(context, "context");
        int iMyPid = Process.myPid();
        Iterator it = d(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((h0.f.d.a.c) next).c() != iMyPid);
        h0.f.d.a.c cVar = (h0.f.d.a.c) next;
        return cVar == null ? c(this, f(), iMyPid, 0, false, 12, null) : cVar;
    }
}
