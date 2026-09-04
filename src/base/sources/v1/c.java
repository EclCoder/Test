package v1;

import android.os.Bundle;
import android.text.Spannable;
import android.text.Spanned;
import java.util.ArrayList;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f55097a = c0.s0(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f55098b = c0.s0(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f55099c = c0.s0(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f55100d = c0.s0(3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f55101e = c0.s0(4);

    public static ArrayList a(Spanned spanned) {
        ArrayList arrayList = new ArrayList();
        for (e eVar : (e[]) spanned.getSpans(0, spanned.length(), e.class)) {
            arrayList.add(b(spanned, eVar, 1, eVar.b()));
        }
        for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
            arrayList.add(b(spanned, gVar, 2, gVar.b()));
        }
        for (d dVar : (d[]) spanned.getSpans(0, spanned.length(), d.class)) {
            arrayList.add(b(spanned, dVar, 3, null));
        }
        return arrayList;
    }

    private static Bundle b(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f55097a, spanned.getSpanStart(obj));
        bundle2.putInt(f55098b, spanned.getSpanEnd(obj));
        bundle2.putInt(f55099c, spanned.getSpanFlags(obj));
        bundle2.putInt(f55100d, i10);
        if (bundle != null) {
            bundle2.putBundle(f55101e, bundle);
        }
        return bundle2;
    }

    public static void c(Bundle bundle, Spannable spannable) {
        int i10 = bundle.getInt(f55097a);
        int i11 = bundle.getInt(f55098b);
        int i12 = bundle.getInt(f55099c);
        int i13 = bundle.getInt(f55100d, -1);
        Bundle bundle2 = bundle.getBundle(f55101e);
        if (i13 == 1) {
            spannable.setSpan(e.a((Bundle) w1.a.e(bundle2)), i10, i11, i12);
        } else if (i13 == 2) {
            spannable.setSpan(g.a((Bundle) w1.a.e(bundle2)), i10, i11, i12);
        } else {
            if (i13 != 3) {
                return;
            }
            spannable.setSpan(new d(), i10, i11, i12);
        }
    }
}
