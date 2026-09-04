package e7;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.facebook.h0;
import com.facebook.internal.e1;
import com.facebook.internal.r0;
import com.facebook.j0;
import com.facebook.o0;
import com.mbridge.msdk.MBridgeConstans;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f37219e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f37220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static l f37221g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f37222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f37223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Timer f37224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f37225d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(o0 it) {
            s.h(it, "it");
            r0.f15352e.b(com.facebook.r0.APP_EVENTS, l.d(), "App index sent to FB!");
        }

        public final j0 b(String str, com.facebook.a aVar, String str2, String requestType) {
            s.h(requestType, "requestType");
            if (str == null) {
                return null;
            }
            j0.c cVar = j0.f15486n;
            kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
            String str3 = String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{str2}, 1));
            s.g(str3, "format(locale, format, *args)");
            j0 j0VarA = cVar.A(aVar, str3, null, null);
            Bundle bundleU = j0VarA.u();
            if (bundleU == null) {
                bundleU = new Bundle();
            }
            bundleU.putString("tree", str);
            bundleU.putString("app_version", n7.h.c());
            bundleU.putString("platform", "android");
            bundleU.putString("request_type", requestType);
            if (s.c(requestType, "app_indexing")) {
                bundleU.putString("device_session_id", e.g());
            }
            j0VarA.G(bundleU);
            j0VarA.C(new j0.b() { // from class: e7.k
                @Override // com.facebook.j0.b
                public final void a(o0 o0Var2) {
                    l.a.c(o0Var2);
                }
            });
            return j0VarA;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f37226a;

        public b(View rootView) {
            s.h(rootView, "rootView");
            this.f37226a = new WeakReference(rootView);
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            View view = (View) this.f37226a.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            s.g(bitmapCreateBitmap, "createBitmap(view.width,…t, Bitmap.Config.RGB_565)");
            view.draw(new Canvas(bitmapCreateBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            s.g(strEncodeToString, "encodeToString(outputStr…eArray(), Base64.NO_WRAP)");
            return strEncodeToString;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c extends TimerTask {
        c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                Activity activity = (Activity) l.c(l.this).get();
                View viewD = n7.h.d(activity);
                if (activity != null && viewD != null) {
                    String simpleName = activity.getClass().getSimpleName();
                    if (e.h()) {
                        if (com.facebook.internal.o0.b()) {
                            f7.e.a();
                            return;
                        }
                        FutureTask futureTask = new FutureTask(new b(viewD));
                        l.e(l.this).post(futureTask);
                        String str = "";
                        try {
                            str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                        } catch (Exception e10) {
                            Log.e(l.d(), "Failed to take screenshot.", e10);
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("screenname", simpleName);
                            jSONObject.put("screenshot", str);
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(f7.f.d(viewD));
                            jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, jSONArray);
                        } catch (JSONException unused) {
                            Log.e(l.d(), "Failed to create JSONObject");
                        }
                        String string = jSONObject.toString();
                        s.g(string, "viewTree.toString()");
                        l.f(l.this, string);
                    }
                }
            } catch (Exception e11) {
                Log.e(l.d(), "UI Component tree indexing failure!", e11);
            }
        }
    }

    static {
        String canonicalName = l.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        f37220f = canonicalName;
    }

    public l(Activity activity) {
        s.h(activity, "activity");
        this.f37223b = new WeakReference(activity);
        this.f37225d = null;
        this.f37222a = new Handler(Looper.getMainLooper());
        f37221g = this;
    }

    public static final /* synthetic */ WeakReference c(l lVar) {
        if (x7.a.c(l.class)) {
            return null;
        }
        try {
            return lVar.f37223b;
        } catch (Throwable th2) {
            x7.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ String d() {
        if (x7.a.c(l.class)) {
            return null;
        }
        try {
            return f37220f;
        } catch (Throwable th2) {
            x7.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ Handler e(l lVar) {
        if (x7.a.c(l.class)) {
            return null;
        }
        try {
            return lVar.f37222a;
        } catch (Throwable th2) {
            x7.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ void f(l lVar, String str) {
        if (x7.a.c(l.class)) {
            return;
        }
        try {
            lVar.j(str);
        } catch (Throwable th2) {
            x7.a.b(th2, l.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(l this$0, TimerTask indexingTask) {
        if (x7.a.c(l.class)) {
            return;
        }
        try {
            s.h(this$0, "this$0");
            s.h(indexingTask, "$indexingTask");
            try {
                Timer timer = this$0.f37224c;
                if (timer != null) {
                    timer.cancel();
                }
                this$0.f37225d = null;
                Timer timer2 = new Timer();
                timer2.scheduleAtFixedRate(indexingTask, 0L, 1000L);
                this$0.f37224c = timer2;
            } catch (Exception e10) {
                Log.e(f37220f, "Error scheduling indexing job", e10);
            }
        } catch (Throwable th2) {
            x7.a.b(th2, l.class);
        }
    }

    private final void j(final String str) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            h0.v().execute(new Runnable() { // from class: e7.j
                @Override // java.lang.Runnable
                public final void run() {
                    l.k(str, this);
                }
            });
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(String tree, l this$0) {
        if (x7.a.c(l.class)) {
            return;
        }
        try {
            s.h(tree, "$tree");
            s.h(this$0, "this$0");
            String strO0 = e1.o0(tree);
            com.facebook.a aVarE = com.facebook.a.f14853l.e();
            if (strO0 == null || !s.c(strO0, this$0.f37225d)) {
                this$0.g(f37219e.b(tree, aVarE, h0.n(), "app_indexing"), strO0);
            }
        } catch (Throwable th2) {
            x7.a.b(th2, l.class);
        }
    }

    public final void g(j0 j0Var, String str) {
        if (x7.a.c(this) || j0Var == null) {
            return;
        }
        try {
            o0 o0VarK = j0Var.k();
            try {
                JSONObject jSONObjectC = o0VarK.c();
                if (jSONObjectC == null) {
                    Log.e(f37220f, "Error sending UI component tree to Facebook: " + o0VarK.b());
                    return;
                }
                if (s.c("true", jSONObjectC.optString("success"))) {
                    r0.f15352e.b(com.facebook.r0.APP_EVENTS, f37220f, "Successfully send UI component tree to server");
                    this.f37225d = str;
                }
                if (jSONObjectC.has("is_app_indexing_enabled")) {
                    e.n(jSONObjectC.getBoolean("is_app_indexing_enabled"));
                }
            } catch (JSONException e10) {
                Log.e(f37220f, "Error decoding server response.", e10);
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public final void h() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            final c cVar = new c();
            try {
                h0.v().execute(new Runnable() { // from class: e7.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        l.i(this.f37215a, cVar);
                    }
                });
            } catch (RejectedExecutionException e10) {
                Log.e(f37220f, "Error scheduling indexing job", e10);
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public final void l() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            if (((Activity) this.f37223b.get()) == null) {
                return;
            }
            try {
                Timer timer = this.f37224c;
                if (timer != null) {
                    timer.cancel();
                }
                this.f37224c = null;
            } catch (Exception e10) {
                Log.e(f37220f, "Error unscheduling indexing job", e10);
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }
}
