package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static c f722a = new c(new d());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f723b = -100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static j0.k f724c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static j0.k f725d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Boolean f726e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f727f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final androidx.collection.b f728g = new androidx.collection.b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f729h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f730i = new Object();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class b {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class c implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f731a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Queue f732b = new ArrayDeque();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Executor f733c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Runnable f734d;

        c(Executor executor) {
            this.f733c = executor;
        }

        public static /* synthetic */ void a(c cVar, Runnable runnable) {
            cVar.getClass();
            try {
                runnable.run();
            } finally {
                cVar.b();
            }
        }

        protected void b() {
            synchronized (this.f731a) {
                try {
                    Runnable runnable = (Runnable) this.f732b.poll();
                    this.f734d = runnable;
                    if (runnable != null) {
                        this.f733c.execute(runnable);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f731a) {
                try {
                    this.f732b.add(new Runnable() { // from class: androidx.appcompat.app.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            h.c.a(this.f735a, runnable);
                        }
                    });
                    if (this.f734d == null) {
                        b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class d implements Executor {
        d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    h() {
    }

    static boolean A(Context context) {
        if (f726e == null) {
            try {
                Bundle bundle = AppLocalesMetadataHolderService.a(context).metaData;
                if (bundle != null) {
                    f726e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f726e = Boolean.FALSE;
            }
        }
        return f726e.booleanValue();
    }

    static void J(h hVar) {
        synchronized (f729h) {
            K(hVar);
        }
    }

    private static void K(h hVar) {
        synchronized (f729h) {
            try {
                Iterator it = f728g.iterator();
                while (it.hasNext()) {
                    h hVar2 = (h) ((WeakReference) it.next()).get();
                    if (hVar2 == hVar || hVar2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void M(j0.k kVar) {
        Objects.requireNonNull(kVar);
        if (Build.VERSION.SDK_INT >= 33) {
            Object objT = t();
            if (objT != null) {
                b.b(objT, a.a(kVar.g()));
                return;
            }
            return;
        }
        if (kVar.equals(f724c)) {
            return;
        }
        synchronized (f729h) {
            f724c = kVar;
            h();
        }
    }

    static void U(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (o().e()) {
                    String strB = androidx.core.app.e.b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        b.b(systemService, a.a(strB));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void V(final Context context) {
        if (A(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f727f) {
                    return;
                }
                f722a.execute(new Runnable() { // from class: androidx.appcompat.app.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.c(context);
                    }
                });
                return;
            }
            synchronized (f730i) {
                try {
                    j0.k kVar = f724c;
                    if (kVar == null) {
                        if (f725d == null) {
                            f725d = j0.k.b(androidx.core.app.e.b(context));
                        }
                        if (f725d.e()) {
                        } else {
                            f724c = f725d;
                        }
                    } else if (!kVar.equals(f725d)) {
                        j0.k kVar2 = f724c;
                        f725d = kVar2;
                        androidx.core.app.e.a(context, kVar2.g());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static /* synthetic */ void c(Context context) {
        U(context);
        f727f = true;
    }

    static void e(h hVar) {
        synchronized (f729h) {
            K(hVar);
            f728g.add(new WeakReference(hVar));
        }
    }

    private static void h() {
        Iterator it = f728g.iterator();
        while (it.hasNext()) {
            h hVar = (h) ((WeakReference) it.next()).get();
            if (hVar != null) {
                hVar.g();
            }
        }
    }

    public static h l(Activity activity, e eVar) {
        return new j(activity, eVar);
    }

    public static h m(Dialog dialog, e eVar) {
        return new j(dialog, eVar);
    }

    public static j0.k o() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object objT = t();
            if (objT != null) {
                return j0.k.i(b.a(objT));
            }
        } else {
            j0.k kVar = f724c;
            if (kVar != null) {
                return kVar;
            }
        }
        return j0.k.d();
    }

    public static int q() {
        return f723b;
    }

    static Object t() {
        Context contextP;
        Iterator it = f728g.iterator();
        while (it.hasNext()) {
            h hVar = (h) ((WeakReference) it.next()).get();
            if (hVar != null && (contextP = hVar.p()) != null) {
                return contextP.getSystemService("locale");
            }
        }
        return null;
    }

    static j0.k v() {
        return f724c;
    }

    static j0.k w() {
        return f725d;
    }

    public abstract void B(Configuration configuration);

    public abstract void C(Bundle bundle);

    public abstract void D();

    public abstract void E(Bundle bundle);

    public abstract void F();

    public abstract void G(Bundle bundle);

    public abstract void H();

    public abstract void I();

    public abstract boolean L(int i10);

    public abstract void N(int i10);

    public abstract void O(View view);

    public abstract void P(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void R(Toolbar toolbar);

    public abstract void S(int i10);

    public abstract void T(CharSequence charSequence);

    public abstract void f(View view, ViewGroup.LayoutParams layoutParams);

    abstract boolean g();

    void i(final Context context) {
        f722a.execute(new Runnable() { // from class: androidx.appcompat.app.g
            @Override // java.lang.Runnable
            public final void run() {
                h.V(context);
            }
        });
    }

    public Context k(Context context) {
        j(context);
        return context;
    }

    public abstract View n(int i10);

    public abstract Context p();

    public abstract androidx.appcompat.app.b.InterfaceC0010b r();

    public abstract int s();

    public abstract MenuInflater u();

    public abstract androidx.appcompat.app.a x();

    public abstract void y();

    public abstract void z();

    public void Q(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public void j(Context context) {
    }
}
