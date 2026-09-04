package vh;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m f55605a;

    static {
        if (c.f()) {
            f55605a = new x();
            return;
        }
        if (c.e()) {
            f55605a = new w();
            return;
        }
        if (c.d()) {
            f55605a = new v();
            return;
        }
        if (c.c()) {
            f55605a = new u();
            return;
        }
        if (c.o()) {
            f55605a = new t();
            return;
        }
        if (c.n()) {
            f55605a = new s();
            return;
        }
        if (c.l()) {
            f55605a = new r();
            return;
        }
        if (c.j()) {
            f55605a = new q();
            return;
        }
        if (c.i()) {
            f55605a = new p();
        } else if (c.h()) {
            f55605a = new o();
        } else {
            f55605a = new n();
        }
    }

    static boolean a(List list) {
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (j((String) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    static List b(List list, int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (iArr[i10] == -1) {
                arrayList.add(list.get(i10));
            }
        }
        return arrayList;
    }

    static List c(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (f(context, str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    static List d(List list, int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (iArr[i10] == 0) {
                arrayList.add(list.get(i10));
            }
        }
        return arrayList;
    }

    static Intent e(Context context, String str) {
        return f55605a.c(context, str);
    }

    static boolean f(Context context, String str) {
        return f55605a.a(context, str);
    }

    static boolean g(Context context, List list) {
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!f(context, (String) it.next())) {
                return false;
            }
        }
        return true;
    }

    static boolean h(Activity activity, String str) {
        return f55605a.b(activity, str);
    }

    static boolean i(Activity activity, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (h(activity, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    static boolean j(String str) {
        return e0.p(str);
    }
}
