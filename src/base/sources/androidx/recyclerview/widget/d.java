package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Executor f6858h = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f6859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final androidx.recyclerview.widget.c f6860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Executor f6861c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f6863e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f6865g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f6862d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f6864f = Collections.EMPTY_LIST;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f6866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f6867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f6868c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Runnable f6869d;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class C0078a extends j.b {
            C0078a() {
            }

            @Override // androidx.recyclerview.widget.j.b
            public boolean a(int i10, int i11) {
                Object obj = a.this.f6866a.get(i10);
                Object obj2 = a.this.f6867b.get(i11);
                if (obj != null && obj2 != null) {
                    return d.this.f6860b.b().a(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            @Override // androidx.recyclerview.widget.j.b
            public boolean b(int i10, int i11) {
                Object obj = a.this.f6866a.get(i10);
                Object obj2 = a.this.f6867b.get(i11);
                if (obj == null || obj2 == null) {
                    return obj == null && obj2 == null;
                }
                return d.this.f6860b.b().b(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.j.b
            public Object c(int i10, int i11) {
                Object obj = a.this.f6866a.get(i10);
                Object obj2 = a.this.f6867b.get(i11);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                return d.this.f6860b.b().c(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.j.b
            public int d() {
                return a.this.f6867b.size();
            }

            @Override // androidx.recyclerview.widget.j.b
            public int e() {
                return a.this.f6866a.size();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ j.e f6872a;

            b(j.e eVar) {
                this.f6872a = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.f6865g == aVar.f6868c) {
                    dVar.c(aVar.f6867b, this.f6872a, aVar.f6869d);
                }
            }
        }

        a(List list, List list2, int i10, Runnable runnable) {
            this.f6866a = list;
            this.f6867b = list2;
            this.f6868c = i10;
            this.f6869d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f6861c.execute(new b(j.b(new C0078a())));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(List list, List list2);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Handler f6874a = new Handler(Looper.getMainLooper());

        c() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f6874a.post(runnable);
        }
    }

    public d(p pVar, androidx.recyclerview.widget.c cVar) {
        this.f6859a = pVar;
        this.f6860b = cVar;
        if (cVar.c() != null) {
            this.f6861c = cVar.c();
        } else {
            this.f6861c = f6858h;
        }
    }

    private void d(List list, Runnable runnable) {
        Iterator it = this.f6862d.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(list, this.f6864f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a(b bVar) {
        this.f6862d.add(bVar);
    }

    public List b() {
        return this.f6864f;
    }

    void c(List list, j.e eVar, Runnable runnable) {
        List list2 = this.f6864f;
        this.f6863e = list;
        this.f6864f = Collections.unmodifiableList(list);
        eVar.b(this.f6859a);
        d(list2, runnable);
    }

    public void e(List list) {
        f(list, null);
    }

    public void f(List list, Runnable runnable) {
        int i10 = this.f6865g + 1;
        this.f6865g = i10;
        List list2 = this.f6863e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List list3 = this.f6864f;
        if (list == null) {
            int size = list2.size();
            this.f6863e = null;
            this.f6864f = Collections.EMPTY_LIST;
            this.f6859a.b(0, size);
            d(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.f6860b.a().execute(new a(list2, list, i10, runnable));
            return;
        }
        this.f6863e = list;
        this.f6864f = Collections.unmodifiableList(list);
        this.f6859a.a(0, list.size());
        d(list3, runnable);
    }
}
