package androidx.recyclerview.widget;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class o extends RecyclerView.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final d f7037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d.b f7038b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements d.b {
        a() {
        }

        @Override // androidx.recyclerview.widget.d.b
        public void a(List list, List list2) {
            o.this.h(list, list2);
        }
    }

    protected o(j.f fVar) {
        a aVar = new a();
        this.f7038b = aVar;
        d dVar = new d(new b(this), new c.a(fVar).a());
        this.f7037a = dVar;
        dVar.a(aVar);
    }

    public List f() {
        return this.f7037a.b();
    }

    protected Object g(int i10) {
        return this.f7037a.b().get(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f7037a.b().size();
    }

    public void i(List list) {
        this.f7037a.e(list);
    }

    public void h(List list, List list2) {
    }
}
