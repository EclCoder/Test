package e;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f36996a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Context f36997b;

    public final void a(b listener) {
        s.h(listener, "listener");
        Context context = this.f36997b;
        if (context != null) {
            listener.a(context);
        }
        this.f36996a.add(listener);
    }

    public final void b() {
        this.f36997b = null;
    }

    public final void c(Context context) {
        s.h(context, "context");
        this.f36997b = context;
        Iterator it = this.f36996a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(context);
        }
    }

    public final Context d() {
        return this.f36997b;
    }

    public final void e(b listener) {
        s.h(listener, "listener");
        this.f36996a.remove(listener);
    }
}
