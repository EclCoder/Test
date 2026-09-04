package androidx.recyclerview.widget;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0.c f7040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y.d f7041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView.h f7042c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final b f7043d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f7044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private RecyclerView.j f7045f = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends RecyclerView.j {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            q qVar = q.this;
            qVar.f7044e = qVar.f7042c.getItemCount();
            q qVar2 = q.this;
            qVar2.f7043d.e(qVar2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void b(int i10, int i11, Object obj) {
            q qVar = q.this;
            qVar.f7043d.a(qVar, i10, i11, obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i10, int i11) {
            q qVar = q.this;
            qVar.f7044e += i11;
            qVar.f7043d.b(qVar, i10, i11);
            q qVar2 = q.this;
            if (qVar2.f7044e <= 0 || qVar2.f7042c.getStateRestorationPolicy() != RecyclerView.h.a.PREVENT_WHEN_EMPTY) {
                return;
            }
            q qVar3 = q.this;
            qVar3.f7043d.d(qVar3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i10, int i11, int i12) {
            m0.g.b(i12 == 1, "moving more than 1 item is not supported in RecyclerView");
            q qVar = q.this;
            qVar.f7043d.c(qVar, i10, i11);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i10, int i11) {
            q qVar = q.this;
            qVar.f7044e -= i11;
            qVar.f7043d.f(qVar, i10, i11);
            q qVar2 = q.this;
            if (qVar2.f7044e >= 1 || qVar2.f7042c.getStateRestorationPolicy() != RecyclerView.h.a.PREVENT_WHEN_EMPTY) {
                return;
            }
            q qVar3 = q.this;
            qVar3.f7043d.d(qVar3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f() {
            q qVar = q.this;
            qVar.f7043d.d(qVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface b {
        void a(q qVar, int i10, int i11, Object obj);

        void b(q qVar, int i10, int i11);

        void c(q qVar, int i10, int i11);

        void d(q qVar);

        void e(q qVar);

        void f(q qVar, int i10, int i11);
    }

    q(RecyclerView.h hVar, b bVar, b0 b0Var, y.d dVar) {
        this.f7042c = hVar;
        this.f7043d = bVar;
        this.f7040a = b0Var.b(this);
        this.f7041b = dVar;
        this.f7044e = hVar.getItemCount();
        hVar.registerAdapterDataObserver(this.f7045f);
    }

    void a() {
        this.f7042c.unregisterAdapterDataObserver(this.f7045f);
        this.f7040a.d();
    }

    int b() {
        return this.f7044e;
    }

    public long c(int i10) {
        return this.f7041b.a(this.f7042c.getItemId(i10));
    }

    int d(int i10) {
        return this.f7040a.f(this.f7042c.getItemViewType(i10));
    }

    void e(RecyclerView.g0 g0Var, int i10) {
        this.f7042c.bindViewHolder(g0Var, i10);
    }

    RecyclerView.g0 f(ViewGroup viewGroup, int i10) {
        return this.f7042c.onCreateViewHolder(viewGroup, this.f7040a.e(i10));
    }
}
