package g5;

import android.content.Context;
import androidx.work.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f38928f = l.f("ConstraintTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final k5.a f38929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Context f38930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f38931c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f38932d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f38933e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f38934a;

        a(List list) {
            this.f38934a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f38934a.iterator();
            while (it.hasNext()) {
                ((e5.a) it.next()).a(d.this.f38933e);
            }
        }
    }

    d(Context context, k5.a aVar) {
        this.f38930b = context.getApplicationContext();
        this.f38929a = aVar;
    }

    public void a(e5.a aVar) {
        synchronized (this.f38931c) {
            try {
                if (this.f38932d.add(aVar)) {
                    if (this.f38932d.size() == 1) {
                        this.f38933e = b();
                        l.c().a(f38928f, String.format("%s: initial state = %s", getClass().getSimpleName(), this.f38933e), new Throwable[0]);
                        e();
                    }
                    aVar.a(this.f38933e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract Object b();

    public void c(e5.a aVar) {
        synchronized (this.f38931c) {
            try {
                if (this.f38932d.remove(aVar) && this.f38932d.isEmpty()) {
                    f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d(Object obj) {
        synchronized (this.f38931c) {
            try {
                Object obj2 = this.f38933e;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.f38933e = obj;
                    this.f38929a.a().execute(new a(new ArrayList(this.f38932d)));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void e();

    public abstract void f();
}
