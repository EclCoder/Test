package f6;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f0;
import com.bumptech.glide.load.resource.bitmap.z;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class o implements Handler.Callback {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final b f38266f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile com.bumptech.glide.l f38267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f38268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.collection.a f38269c = new androidx.collection.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f38270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m f38271e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements b {
        a() {
        }

        @Override // f6.o.b
        public com.bumptech.glide.l a(com.bumptech.glide.c cVar, j jVar, p pVar, Context context) {
            return new com.bumptech.glide.l(cVar, jVar, pVar, context);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        com.bumptech.glide.l a(com.bumptech.glide.c cVar, j jVar, p pVar, Context context);
    }

    public o(b bVar) {
        bVar = bVar == null ? f38266f : bVar;
        this.f38268b = bVar;
        this.f38271e = new m(bVar);
        this.f38270d = b();
    }

    private static void a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static i b() {
        return (z.f11581f && z.f11580e) ? new h() : new f();
    }

    private static Activity c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private static void d(Collection collection, Map map) {
        if (collection == null) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                d(fragment.getChildFragmentManager().z0(), map);
            }
        }
    }

    private Fragment e(View view, androidx.fragment.app.s sVar) {
        this.f38269c.clear();
        d(sVar.getSupportFragmentManager().z0(), this.f38269c);
        View viewFindViewById = sVar.findViewById(R.id.content);
        Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = (Fragment) this.f38269c.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f38269c.clear();
        return fragment;
    }

    private com.bumptech.glide.l j(Context context) {
        if (this.f38267a == null) {
            synchronized (this) {
                try {
                    if (this.f38267a == null) {
                        this.f38267a = this.f38268b.a(com.bumptech.glide.c.e(context.getApplicationContext()), new f6.a(), new g(), context.getApplicationContext());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f38267a;
    }

    private static boolean k(Context context) {
        Activity activityC = c(context);
        return activityC == null || !activityC.isFinishing();
    }

    public com.bumptech.glide.l f(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (m6.l.r() && !(context instanceof Application)) {
            if (context instanceof androidx.fragment.app.s) {
                return i((androidx.fragment.app.s) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return f(contextWrapper.getBaseContext());
                }
            }
        }
        return j(context);
    }

    public com.bumptech.glide.l g(View view) {
        if (m6.l.q()) {
            return f(view.getContext().getApplicationContext());
        }
        m6.k.e(view);
        m6.k.f(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityC = c(view.getContext());
        if (activityC == null) {
            return f(view.getContext().getApplicationContext());
        }
        if (!(activityC instanceof androidx.fragment.app.s)) {
            return f(view.getContext().getApplicationContext());
        }
        androidx.fragment.app.s sVar = (androidx.fragment.app.s) activityC;
        Fragment fragmentE = e(view, sVar);
        return fragmentE != null ? h(fragmentE) : i(sVar);
    }

    public com.bumptech.glide.l h(Fragment fragment) {
        m6.k.f(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (m6.l.q()) {
            return f(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.f38270d.a(fragment.getActivity());
        }
        f0 childFragmentManager = fragment.getChildFragmentManager();
        Context context = fragment.getContext();
        return this.f38271e.b(context, com.bumptech.glide.c.e(context.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        return false;
    }

    public com.bumptech.glide.l i(androidx.fragment.app.s sVar) {
        if (m6.l.q()) {
            return f(sVar.getApplicationContext());
        }
        a(sVar);
        this.f38270d.a(sVar);
        boolean zK = k(sVar);
        return this.f38271e.b(sVar, com.bumptech.glide.c.e(sVar.getApplicationContext()), sVar.getLifecycle(), sVar.getSupportFragmentManager(), zK);
    }
}
