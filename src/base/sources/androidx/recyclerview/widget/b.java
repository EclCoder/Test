package androidx.recyclerview.widget;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RecyclerView.h f6840a;

    public b(RecyclerView.h hVar) {
        this.f6840a = hVar;
    }

    @Override // androidx.recyclerview.widget.p
    public void a(int i10, int i11) {
        this.f6840a.notifyItemRangeInserted(i10, i11);
    }

    @Override // androidx.recyclerview.widget.p
    public void b(int i10, int i11) {
        this.f6840a.notifyItemRangeRemoved(i10, i11);
    }

    @Override // androidx.recyclerview.widget.p
    public void c(int i10, int i11, Object obj) {
        this.f6840a.notifyItemRangeChanged(i10, i11, obj);
    }

    @Override // androidx.recyclerview.widget.p
    public void d(int i10, int i11) {
        this.f6840a.notifyItemMoved(i10, i11);
    }
}
