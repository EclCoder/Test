package ne;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.android.gms.common.util.ProcessUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f47156a = new d0();

    private d0() {
    }

    private final String c() throws Throwable {
        String processName;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 33) {
            String strMyProcessName = Process.myProcessName();
            kotlin.jvm.internal.s.g(strMyProcessName, "myProcessName(...)");
            return strMyProcessName;
        }
        if (i10 >= 28 && (processName = Application.getProcessName()) != null) {
            return processName;
        }
        String myProcessName = ProcessUtils.getMyProcessName();
        return myProcessName != null ? myProcessName : "";
    }

    public final List a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> listL;
        kotlin.jvm.internal.s.h(context, "context");
        int i10 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (listL = activityManager.getRunningAppProcesses()) == null) {
            listL = gl.r.l();
        }
        List listY = gl.r.Y(listL);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listY) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i10) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(gl.r.v(arrayList, 10));
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj2 = arrayList.get(i11);
            i11++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj2;
            String processName = runningAppProcessInfo.processName;
            kotlin.jvm.internal.s.g(processName, "processName");
            arrayList2.add(new c0(processName, runningAppProcessInfo.pid, runningAppProcessInfo.importance, kotlin.jvm.internal.s.c(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public final c0 b(Context context) {
        Object next;
        kotlin.jvm.internal.s.h(context, "context");
        int iMyPid = Process.myPid();
        Iterator it = a(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((c0) next).b() != iMyPid);
        c0 c0Var = (c0) next;
        return c0Var == null ? new c0(c(), iMyPid, 0, false) : c0Var;
    }
}
