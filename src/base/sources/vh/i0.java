package vh;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class i0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static e f55599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Boolean f55600f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f55601a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f55602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f55603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Boolean f55604d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a implements e {
        a() {
        }
    }

    private i0(Context context) {
        this.f55602b = context;
    }

    public static e a() {
        if (f55599e == null) {
            f55599e = new a();
        }
        return f55599e;
    }

    private boolean c(Context context) {
        if (this.f55604d == null) {
            if (f55600f == null) {
                f55600f = Boolean.valueOf(e0.n(context));
            }
            this.f55604d = f55600f;
        }
        return this.f55604d.booleanValue();
    }

    public static boolean d(Context context, List list) {
        return k.g(context, list);
    }

    public static boolean e(Context context, String... strArr) {
        return d(context, e0.b(strArr));
    }

    public static void i(Activity activity, List list, i iVar) {
        if (list.isEmpty()) {
            g0.d(activity, c0.b(activity));
        } else {
            d0.b(activity, (ArrayList) list, iVar);
        }
    }

    public static i0 j(Context context) {
        return new i0(context);
    }

    public static i0 k(Fragment fragment) {
        return j(fragment.getActivity());
    }

    public i0 b(e eVar) {
        this.f55603c = eVar;
        return this;
    }

    public i0 f(List list) {
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!e0.f(this.f55601a, str)) {
                    this.f55601a.add(str);
                }
            }
        }
        return this;
    }

    public i0 g(String... strArr) {
        return f(e0.b(strArr));
    }

    public void h(h hVar) {
        if (this.f55602b == null) {
            return;
        }
        if (this.f55603c == null) {
            this.f55603c = a();
        }
        Context context = this.f55602b;
        e eVar = this.f55603c;
        ArrayList arrayList = new ArrayList(this.f55601a);
        boolean zC = c(context);
        Activity activityH = e0.h(context);
        if (l.a(activityH, zC) && l.j(arrayList, zC)) {
            if (zC) {
                vh.a aVarJ = e0.j(context);
                l.g(context, arrayList);
                l.l(context, arrayList, aVarJ);
                l.b(arrayList);
                l.c(arrayList);
                l.k(activityH, arrayList, aVarJ);
                l.i(arrayList, aVarJ);
                l.h(arrayList, aVarJ);
                l.m(context, arrayList);
                l.f(context, arrayList, aVarJ);
            }
            l.n(arrayList);
            if (!k.g(context, arrayList)) {
                eVar.d(activityH, arrayList, hVar);
            } else if (hVar != null) {
                eVar.a(activityH, arrayList, arrayList, true, hVar);
                eVar.c(activityH, arrayList, true, hVar);
            }
        }
    }
}
