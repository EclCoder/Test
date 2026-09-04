package r7;

import android.os.Bundle;
import android.view.View;
import bm.r;
import com.facebook.appevents.o0;
import com.facebook.h0;
import com.facebook.internal.e1;
import com.facebook.j0;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements View.OnClickListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f51138e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set f51139f = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View.OnClickListener f51140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f51141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference f51142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f51143d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(String str, String str2, float[] fArr) {
            if (e.f(str)) {
                new o0(h0.m()).e(str, str2);
            } else if (e.e(str)) {
                h(str, str2, fArr);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean f(String str, final String str2) {
            final String strD = b.d(str);
            if (strD == null) {
                return false;
            }
            if (s.c(strD, "other")) {
                return true;
            }
            e1.E0(new Runnable() { // from class: r7.i
                @Override // java.lang.Runnable
                public final void run() {
                    j.a.g(strD, str2);
                }
            });
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(String queriedEvent, String buttonText) {
            s.h(queriedEvent, "$queriedEvent");
            s.h(buttonText, "$buttonText");
            j.f51138e.e(queriedEvent, buttonText, new float[0]);
        }

        private final void h(String str, String str2, float[] fArr) {
            Bundle bundle = new Bundle();
            try {
                bundle.putString("event_name", str);
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb2 = new StringBuilder();
                for (float f10 : fArr) {
                    sb2.append(f10);
                    sb2.append(",");
                }
                jSONObject.put("dense", sb2.toString());
                jSONObject.put("button_text", str2);
                bundle.putString(TtmlNode.TAG_METADATA, jSONObject.toString());
                j0.c cVar = j0.f15486n;
                kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
                String str3 = String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[]{h0.n()}, 1));
                s.g(str3, "format(locale, format, *args)");
                j0 j0VarA = cVar.A(null, str3, null, null);
                j0VarA.G(bundle);
                j0VarA.k();
            } catch (JSONException unused) {
            }
        }

        public final void d(View hostView, View rootView, String activityName) {
            s.h(hostView, "hostView");
            s.h(rootView, "rootView");
            s.h(activityName, "activityName");
            int iHashCode = hostView.hashCode();
            if (j.b().contains(Integer.valueOf(iHashCode))) {
                return;
            }
            f7.f.r(hostView, new j(hostView, rootView, activityName, null));
            j.b().add(Integer.valueOf(iHashCode));
        }

        private a() {
        }
    }

    public /* synthetic */ j(View view, View view2, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, view2, str);
    }

    public static final /* synthetic */ Set b() {
        if (x7.a.c(j.class)) {
            return null;
        }
        try {
            return f51139f;
        } catch (Throwable th2) {
            x7.a.b(th2, j.class);
            return null;
        }
    }

    private final void c(final String str, final String str2, final JSONObject jSONObject) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            e1.E0(new Runnable() { // from class: r7.h
                @Override // java.lang.Runnable
                public final void run() {
                    j.d(jSONObject, str2, this, str);
                }
            });
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(JSONObject viewData, String buttonText, j this$0, String pathID) {
        String[] strArrQ;
        if (x7.a.c(j.class)) {
            return;
        }
        try {
            s.h(viewData, "$viewData");
            s.h(buttonText, "$buttonText");
            s.h(this$0, "this$0");
            s.h(pathID, "$pathID");
            try {
                String lowerCase = e1.v(h0.m()).toLowerCase();
                s.g(lowerCase, "this as java.lang.String).toLowerCase()");
                float[] fArrA = r7.a.a(viewData, lowerCase);
                String strC = r7.a.c(buttonText, this$0.f51143d, lowerCase);
                if (fArrA != null && (strArrQ = o7.f.q(o7.f.a.MTML_APP_EVENT_PREDICTION, new float[][]{fArrA}, new String[]{strC})) != null) {
                    String str = strArrQ[0];
                    b.a(pathID, str);
                    if (s.c(str, "other")) {
                        return;
                    }
                    f51138e.e(str, buttonText, fArrA);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            x7.a.b(th2, j.class);
        }
    }

    private final void e() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            View view = (View) this.f51141b.get();
            View view2 = (View) this.f51142c.get();
            if (view == null || view2 == null) {
                return;
            }
            try {
                String strD = c.d(view2);
                String strB = b.b(view2, strD);
                if (strB != null && !f51138e.f(strB, strD)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, c.b(view, view2));
                    jSONObject.put("screenname", this.f51143d);
                    c(strB, strD, jSONObject);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            if (x7.a.c(this)) {
                return;
            }
            try {
                s.h(view, "view");
                View.OnClickListener onClickListener = this.f51140a;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                e();
            } catch (Throwable th2) {
                x7.a.b(th2, this);
            }
        } catch (Throwable th3) {
            x7.a.b(th3, this);
        }
    }

    private j(View view, View view2, String str) {
        this.f51140a = f7.f.g(view);
        this.f51141b = new WeakReference(view2);
        this.f51142c = new WeakReference(view);
        String lowerCase = str.toLowerCase();
        s.g(lowerCase, "this as java.lang.String).toLowerCase()");
        this.f51143d = r.I(lowerCase, "activity", "", false, 4, null);
    }
}
