package t0;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.jvm.internal.s;
import n0.w0;
import n0.x0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f52475a = c.f52479b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f52476b = c.f52478a;

    public static final void a(View view) {
        s.h(view, "<this>");
        Iterator it = x0.a(view).iterator();
        while (it.hasNext()) {
            c((View) it.next()).a();
        }
    }

    public static final void b(ViewGroup viewGroup) {
        s.h(viewGroup, "<this>");
        Iterator it = w0.a(viewGroup).iterator();
        while (it.hasNext()) {
            c((View) it.next()).a();
        }
    }

    private static final b c(View view) {
        int i10 = f52475a;
        b bVar = (b) view.getTag(i10);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        view.setTag(i10, bVar2);
        return bVar2;
    }

    public static final void d(View view, boolean z10) {
        s.h(view, "<this>");
        view.setTag(f52476b, Boolean.valueOf(z10));
    }
}
