package e5;

import android.content.Context;
import androidx.work.l;
import f5.e;
import f5.f;
import f5.g;
import f5.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class d implements f5.c.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f37153d = l.f("WorkConstraintsTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f37154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f5.c[] f37155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f37156c;

    public d(Context context, k5.a aVar, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f37154a = cVar;
        this.f37155b = new f5.c[]{new f5.a(applicationContext, aVar), new f5.b(applicationContext, aVar), new h(applicationContext, aVar), new f5.d(applicationContext, aVar), new g(applicationContext, aVar), new f(applicationContext, aVar), new e(applicationContext, aVar)};
        this.f37156c = new Object();
    }

    @Override // f5.c.a
    public void a(List list) {
        synchronized (this.f37156c) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (c(str)) {
                        l.c().a(f37153d, String.format("Constraints met for %s", str), new Throwable[0]);
                        arrayList.add(str);
                    }
                }
                c cVar = this.f37154a;
                if (cVar != null) {
                    cVar.f(arrayList);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // f5.c.a
    public void b(List list) {
        synchronized (this.f37156c) {
            try {
                c cVar = this.f37154a;
                if (cVar != null) {
                    cVar.b(list);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean c(String str) {
        synchronized (this.f37156c) {
            try {
                for (f5.c cVar : this.f37155b) {
                    if (cVar.d(str)) {
                        l.c().a(f37153d, String.format("Work %s constrained by %s", str, cVar.getClass().getSimpleName()), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d(Iterable iterable) {
        synchronized (this.f37156c) {
            try {
                for (f5.c cVar : this.f37155b) {
                    cVar.g(null);
                }
                for (f5.c cVar2 : this.f37155b) {
                    cVar2.e(iterable);
                }
                for (f5.c cVar3 : this.f37155b) {
                    cVar3.g(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e() {
        synchronized (this.f37156c) {
            try {
                for (f5.c cVar : this.f37155b) {
                    cVar.f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
