package c7;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import bm.o;
import bm.r;
import com.facebook.appevents.o0;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import n7.h;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f9585e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map f9586f = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f9587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f9588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference f9589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f9590d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(String str, String str2) {
            return s.c("r2", str) ? new o("[^\\d.]").i(str2, "") : str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:17:0x0045  */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final void d(Map map, String str, String str2) {
            switch (str.hashCode()) {
                case 3585:
                    if (str.equals("r3")) {
                        str2 = (!r.N(str2, "m", false, 2, null) && !r.N(str2, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, false, 2, null) && !r.N(str2, "ge", false, 2, null)) ? "f" : "m";
                    }
                    break;
                case 3586:
                    if (str.equals("r4")) {
                        str2 = new o("[^a-z]+").i(str2, "");
                    }
                    break;
                case 3587:
                    if (str.equals("r5")) {
                        str2 = new o("[^a-z]+").i(str2, "");
                    }
                    break;
                case 3588:
                    if (str.equals("r6") && r.T(str2, "-", false, 2, null)) {
                        str2 = ((String[]) new o("-").j(str2, 0).toArray(new String[0]))[0];
                    }
                    break;
            }
            map.put(str, str2);
        }

        public final void e(Activity activity) {
            s.h(activity, "activity");
            int iHashCode = activity.hashCode();
            Map mapB = f.b();
            Integer numValueOf = Integer.valueOf(iHashCode);
            Object fVar = mapB.get(numValueOf);
            if (fVar == null) {
                fVar = new f(activity, null);
                mapB.put(numValueOf, fVar);
            }
            f.c((f) fVar);
        }

        private a() {
        }
    }

    public /* synthetic */ f(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    public static final /* synthetic */ Map b() {
        if (x7.a.c(f.class)) {
            return null;
        }
        try {
            return f9586f;
        } catch (Throwable th2) {
            x7.a.b(th2, f.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(f fVar) {
        if (x7.a.c(f.class)) {
            return;
        }
        try {
            fVar.h();
        } catch (Throwable th2) {
            x7.a.b(th2, f.class);
        }
    }

    private final void d(final View view) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            g(new Runnable() { // from class: c7.e
                @Override // java.lang.Runnable
                public final void run() {
                    f.e(view, this);
                }
            });
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(View view, f this$0) {
        if (x7.a.c(f.class)) {
            return;
        }
        try {
            s.h(view, "$view");
            s.h(this$0, "this$0");
            if (view instanceof EditText) {
                this$0.f(view);
            }
        } catch (Throwable th2) {
            x7.a.b(th2, f.class);
        }
    }

    private final void f(View view) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            s.f(view, "null cannot be cast to non-null type android.widget.EditText");
            String lowerCase = r.V0(((EditText) view).getText().toString()).toString().toLowerCase();
            s.g(lowerCase, "this as java.lang.String).toLowerCase()");
            if (lowerCase.length() != 0 && !this.f9587a.contains(lowerCase) && lowerCase.length() <= 100) {
                this.f9587a.add(lowerCase);
                HashMap map = new HashMap();
                List listB = c.b(view);
                List listA = null;
                for (d dVar : d.f9578d.c()) {
                    a aVar = f9585e;
                    String strC = aVar.c(dVar.c(), lowerCase);
                    if (dVar.d().length() <= 0 || c.f(strC, dVar.d())) {
                        if (c.e(listB, dVar.b())) {
                            aVar.d(map, dVar.c(), strC);
                        } else {
                            if (listA == null) {
                                listA = c.a(view);
                            }
                            if (c.e(listA, dVar.b())) {
                                aVar.d(map, dVar.c(), strC);
                            }
                        }
                    }
                }
                o0.f14970b.f(map);
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    private final void g(Runnable runnable) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.f9588b.post(runnable);
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    private final void h() {
        View viewD;
        if (x7.a.c(this)) {
            return;
        }
        try {
            if (!this.f9590d.getAndSet(true) && (viewD = h.d((Activity) this.f9589c.get())) != null) {
                ViewTreeObserver viewTreeObserver = viewD.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnGlobalFocusChangeListener(this);
                }
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View view, View view2) {
        if (x7.a.c(this)) {
            return;
        }
        if (view != null) {
            try {
                d(view);
            } catch (Throwable th2) {
                x7.a.b(th2, this);
                return;
            }
        }
        if (view2 != null) {
            d(view2);
        }
    }

    private f(Activity activity) {
        this.f9587a = new LinkedHashSet();
        this.f9588b = new Handler(Looper.getMainLooper());
        this.f9589c = new WeakReference(activity);
        this.f9590d = new AtomicBoolean(false);
    }
}
