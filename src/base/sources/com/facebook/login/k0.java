package com.facebook.login;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Parcel;
import androidx.fragment.app.Fragment;
import com.facebook.FacebookException;
import com.facebook.FacebookServiceException;
import com.facebook.internal.e1;
import com.facebook.internal.x0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k0 extends g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.facebook.l f15639d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(w loginClient) {
        super(loginClient);
        kotlin.jvm.internal.s.h(loginClient, "loginClient");
        this.f15639d = com.facebook.l.FACEBOOK_APPLICATION_WEB;
    }

    private final boolean C(Intent intent) {
        List<ResolveInfo> listQueryIntentActivities = com.facebook.h0.m().getPackageManager().queryIntentActivities(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        kotlin.jvm.internal.s.g(listQueryIntentActivities, "getApplicationContext()\n…nager.MATCH_DEFAULT_ONLY)");
        return !listQueryIntentActivities.isEmpty();
    }

    private final void D(final w.e eVar, final Bundle bundle) {
        if (!bundle.containsKey("code") || e1.e0(bundle.getString("code"))) {
            B(eVar, bundle);
        } else {
            com.facebook.h0.v().execute(new Runnable() { // from class: com.facebook.login.j0
                @Override // java.lang.Runnable
                public final void run() {
                    k0.E(this.f15630a, eVar, bundle);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(k0 this$0, w.e request, Bundle extras) {
        kotlin.jvm.internal.s.h(this$0, "this$0");
        kotlin.jvm.internal.s.h(request, "$request");
        kotlin.jvm.internal.s.h(extras, "$extras");
        try {
            this$0.B(request, this$0.o(request, extras));
        } catch (FacebookServiceException e10) {
            com.facebook.x requestError = e10.getRequestError();
            this$0.A(request, requestError.e(), requestError.c(), String.valueOf(requestError.b()));
        } catch (FacebookException e11) {
            this$0.A(request, null, e11.getMessage(), null);
        }
    }

    private final void v(w.f fVar) {
        if (fVar != null) {
            e().j(fVar);
        } else {
            e().G();
        }
    }

    protected void A(w.e eVar, String str, String str2, String str3) {
        if (str != null && kotlin.jvm.internal.s.c(str, "logged_out")) {
            c.f15565l = true;
            v(null);
        } else if (gl.r.U(x0.d(), str)) {
            v(null);
        } else if (gl.r.U(x0.e(), str)) {
            v(w.f.f15803i.a(eVar, null));
        } else {
            v(w.f.f15803i.c(eVar, str, str2, str3));
        }
    }

    protected void B(w.e request, Bundle extras) {
        kotlin.jvm.internal.s.h(request, "request");
        kotlin.jvm.internal.s.h(extras, "extras");
        try {
            g0.a aVar = g0.f15612c;
            v(w.f.f15803i.b(request, aVar.b(request.v(), extras, y(), request.b()), aVar.d(extras, request.u())));
        } catch (FacebookException e10) {
            v(w.f.c.d(w.f.f15803i, request, null, e10.getMessage(), null, 8, null));
        }
    }

    protected boolean F(Intent intent, int i10) {
        f.c cVarW;
        if (intent == null || !C(intent)) {
            return false;
        }
        Fragment fragmentP = e().p();
        fl.g0 g0Var = null;
        a0 a0Var = fragmentP instanceof a0 ? (a0) fragmentP : null;
        if (a0Var != null && (cVarW = a0Var.w()) != null) {
            cVarW.b(intent);
            g0Var = fl.g0.f38750a;
        }
        return g0Var != null;
    }

    @Override // com.facebook.login.g0
    public boolean n(int i10, int i11, Intent intent) {
        w.e eVarU = e().u();
        if (intent == null) {
            v(w.f.f15803i.a(eVarU, "Operation canceled"));
        } else if (i11 == 0) {
            z(eVarU, intent);
        } else if (i11 != -1) {
            v(w.f.c.d(w.f.f15803i, eVarU, "Unexpected resultCode from authorization.", null, null, 8, null));
        } else {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                v(w.f.c.d(w.f.f15803i, eVarU, "Unexpected null from returned authorization data.", null, null, 8, null));
                return true;
            }
            String strW = w(extras);
            Object obj = extras.get("error_code");
            String string = obj != null ? obj.toString() : null;
            String strX = x(extras);
            String string2 = extras.getString("e2e");
            if (!e1.e0(string2)) {
                j(string2);
            }
            if (strW == null && string == null && strX == null && eVarU != null) {
                D(eVarU, extras);
            } else {
                A(eVarU, strW, strX, string);
            }
        }
        return true;
    }

    protected String w(Bundle bundle) {
        String string;
        if (bundle != null && (string = bundle.getString("error")) != null) {
            return string;
        }
        if (bundle != null) {
            return bundle.getString("error_type");
        }
        return null;
    }

    protected String x(Bundle bundle) {
        String string;
        if (bundle != null && (string = bundle.getString("error_message")) != null) {
            return string;
        }
        if (bundle != null) {
            return bundle.getString("error_description");
        }
        return null;
    }

    public com.facebook.l y() {
        return this.f15639d;
    }

    protected void z(w.e eVar, Intent data) {
        Object obj;
        kotlin.jvm.internal.s.h(data, "data");
        Bundle extras = data.getExtras();
        String strW = w(extras);
        String string = (extras == null || (obj = extras.get("error_code")) == null) ? null : obj.toString();
        if (kotlin.jvm.internal.s.c(x0.c(), string)) {
            v(w.f.f15803i.c(eVar, strW, x(extras), string));
        } else {
            v(w.f.f15803i.a(eVar, strW));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(Parcel source) {
        super(source);
        kotlin.jvm.internal.s.h(source, "source");
        this.f15639d = com.facebook.l.FACEBOOK_APPLICATION_WEB;
    }
}
