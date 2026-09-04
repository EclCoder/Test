package l7;

import android.os.Bundle;
import com.facebook.appevents.p0;
import com.facebook.appevents.q0;
import com.facebook.h0;
import com.facebook.internal.a0;
import fl.w;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f44021a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f44022b = gl.r.e("fb_currency");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List f44023c = gl.r.e("_valueToSum");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f44024d = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final List f44025e = gl.r.o(w.a("fb_iap_product_id", gl.r.e("fb_iap_product_id")), w.a("fb_iap_product_description", gl.r.e("fb_iap_product_description")), w.a("fb_iap_product_title", gl.r.e("fb_iap_product_title")), w.a("fb_iap_purchase_token", gl.r.e("fb_iap_purchase_token")));

    private p() {
    }

    public final fl.q a(Bundle bundle, Bundle bundle2, p0 p0Var) {
        Bundle bundle3;
        p0 p0Var2;
        if (bundle == null) {
            return new fl.q(bundle2, p0Var);
        }
        try {
            bundle3 = bundle2;
            p0Var2 = p0Var;
            for (String key : bundle.keySet()) {
                try {
                    String string = bundle.getString(key);
                    if (string != null) {
                        p0.a aVar = p0.f14972b;
                        q0 q0Var = q0.IAPParameters;
                        kotlin.jvm.internal.s.g(key, "key");
                        fl.q qVarB = aVar.b(q0Var, key, string, bundle3, p0Var2);
                        Bundle bundle4 = (Bundle) qVarB.d();
                        p0Var2 = (p0) qVarB.g();
                        bundle3 = bundle4;
                    }
                } catch (Exception unused) {
                    bundle2 = bundle3;
                    p0Var = p0Var2;
                    bundle3 = bundle2;
                    p0Var2 = p0Var;
                }
            }
        } catch (Exception unused2) {
        }
        return new fl.q(bundle3, p0Var2);
    }

    public final Currency b(Bundle bundle) {
        Iterator it = c().iterator();
        while (true) {
            String string = null;
            if (!it.hasNext()) {
                return null;
            }
            String str = (String) it.next();
            if (bundle != null) {
                try {
                    string = bundle.getString(str);
                    if (string != null && string.length() != 0) {
                        return Currency.getInstance(string);
                    }
                } catch (Exception unused) {
                    continue;
                }
            } else {
                if (string != null) {
                    return Currency.getInstance(string);
                }
                continue;
            }
        }
    }

    public final List c() {
        com.facebook.internal.w wVarF = a0.f(h0.n());
        return ((wVarF != null ? wVarF.e() : null) == null || wVarF.e().isEmpty()) ? f44022b : wVarF.e();
    }

    public final List d(boolean z10) {
        com.facebook.internal.w wVarF = a0.f(h0.n());
        if ((wVarF != null ? wVarF.n() : null) == null || wVarF.n().isEmpty()) {
            return f44025e;
        }
        if (!z10) {
            return wVarF.n();
        }
        ArrayList arrayList = new ArrayList();
        for (fl.q qVar : wVarF.n()) {
            Iterator it = ((List) qVar.i()).iterator();
            while (it.hasNext()) {
                arrayList.add(new fl.q((String) it.next(), gl.r.e(qVar.h())));
            }
        }
        return arrayList;
    }

    public final long e() {
        Long lF;
        com.facebook.internal.w wVarF = a0.f(h0.n());
        return ((wVarF != null ? wVarF.f() : null) == null || ((lF = wVarF.f()) != null && lF.longValue() == 0)) ? f44024d : wVarF.f().longValue();
    }

    public final List f(boolean z10) {
        List listZ;
        com.facebook.internal.w wVarF = a0.f(h0.n());
        if (wVarF == null || (listZ = wVarF.z()) == null || listZ.isEmpty()) {
            return null;
        }
        if (!z10) {
            return wVarF.z();
        }
        ArrayList arrayList = new ArrayList();
        for (fl.q qVar : wVarF.z()) {
            Iterator it = ((List) qVar.i()).iterator();
            while (it.hasNext()) {
                arrayList.add(new fl.q((String) it.next(), gl.r.e(qVar.h())));
            }
        }
        return arrayList;
    }

    public final Double g(Double d10, Bundle bundle) {
        if (d10 != null) {
            return d10;
        }
        Iterator it = h().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (bundle != null) {
                try {
                    return Double.valueOf(bundle.getDouble(str));
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return null;
    }

    public final List h() {
        com.facebook.internal.w wVarF = a0.f(h0.n());
        return ((wVarF != null ? wVarF.p() : null) == null || wVarF.p().isEmpty()) ? f44023c : wVarF.p();
    }
}
