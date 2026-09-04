package e7;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.facebook.appevents.o;
import com.facebook.h0;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f37170a = new b();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private f7.a f37171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference f37172b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference f37173c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private View.OnClickListener f37174d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f37175e;

        public a(f7.a mapping, View rootView, View hostView) {
            s.h(mapping, "mapping");
            s.h(rootView, "rootView");
            s.h(hostView, "hostView");
            this.f37171a = mapping;
            this.f37172b = new WeakReference(hostView);
            this.f37173c = new WeakReference(rootView);
            this.f37174d = f7.f.g(hostView);
            this.f37175e = true;
        }

        public final boolean a() {
            return this.f37175e;
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
                    View.OnClickListener onClickListener = this.f37174d;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                    View view2 = (View) this.f37173c.get();
                    View view3 = (View) this.f37172b.get();
                    if (view2 == null || view3 == null) {
                        return;
                    }
                    b.d(this.f37171a, view2, view3);
                    return;
                } catch (Throwable th2) {
                    x7.a.b(th2, this);
                    return;
                }
                x7.a.b(th, this);
            } catch (Throwable th3) {
                x7.a.b(th3, this);
            }
        }
    }

    /* JADX INFO: renamed from: e7.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0559b implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private f7.a f37176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference f37177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference f37178c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private AdapterView.OnItemClickListener f37179d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f37180e;

        public C0559b(f7.a mapping, View rootView, AdapterView hostView) {
            s.h(mapping, "mapping");
            s.h(rootView, "rootView");
            s.h(hostView, "hostView");
            this.f37176a = mapping;
            this.f37177b = new WeakReference(hostView);
            this.f37178c = new WeakReference(rootView);
            this.f37179d = hostView.getOnItemClickListener();
            this.f37180e = true;
        }

        public final boolean a() {
            return this.f37180e;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            s.h(view, "view");
            AdapterView.OnItemClickListener onItemClickListener = this.f37179d;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i10, j10);
            }
            View view2 = (View) this.f37178c.get();
            AdapterView adapterView2 = (AdapterView) this.f37177b.get();
            if (view2 == null || adapterView2 == null) {
                return;
            }
            b.d(this.f37176a, view2, adapterView2);
        }
    }

    private b() {
    }

    public static final a b(f7.a mapping, View rootView, View hostView) {
        if (x7.a.c(b.class)) {
            return null;
        }
        try {
            s.h(mapping, "mapping");
            s.h(rootView, "rootView");
            s.h(hostView, "hostView");
            return new a(mapping, rootView, hostView);
        } catch (Throwable th2) {
            x7.a.b(th2, b.class);
            return null;
        }
    }

    public static final C0559b c(f7.a mapping, View rootView, AdapterView hostView) {
        if (x7.a.c(b.class)) {
            return null;
        }
        try {
            s.h(mapping, "mapping");
            s.h(rootView, "rootView");
            s.h(hostView, "hostView");
            return new C0559b(mapping, rootView, hostView);
        } catch (Throwable th2) {
            x7.a.b(th2, b.class);
            return null;
        }
    }

    public static final void d(f7.a mapping, View rootView, View hostView) {
        if (x7.a.c(b.class)) {
            return;
        }
        try {
            s.h(mapping, "mapping");
            s.h(rootView, "rootView");
            s.h(hostView, "hostView");
            final String strB = mapping.b();
            final Bundle bundleB = g.f37193f.b(mapping, rootView, hostView);
            f37170a.f(bundleB);
            h0.v().execute(new Runnable() { // from class: e7.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.e(strB, bundleB);
                }
            });
        } catch (Throwable th2) {
            x7.a.b(th2, b.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(String eventName, Bundle parameters) {
        if (x7.a.c(b.class)) {
            return;
        }
        try {
            s.h(eventName, "$eventName");
            s.h(parameters, "$parameters");
            o.f14964b.f(h0.m()).b(eventName, parameters);
        } catch (Throwable th2) {
            x7.a.b(th2, b.class);
        }
    }

    public final void f(Bundle parameters) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            s.h(parameters, "parameters");
            String string = parameters.getString("_valueToSum");
            if (string != null) {
                parameters.putDouble("_valueToSum", n7.h.f(string));
            }
            parameters.putString("_is_fb_codeless", "1");
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }
}
