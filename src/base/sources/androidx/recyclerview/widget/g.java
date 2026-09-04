package androidx.recyclerview.widget;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class g extends RecyclerView.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f6887a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f6888c = new a(true, EnumC0079a.NO_STABLE_IDS);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f6889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EnumC0079a f6890b;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public enum EnumC0079a {
            NO_STABLE_IDS,
            ISOLATED_STABLE_IDS,
            SHARED_STABLE_IDS
        }

        a(boolean z10, EnumC0079a enumC0079a) {
            this.f6889a = z10;
            this.f6890b = enumC0079a;
        }
    }

    public g(RecyclerView.h... hVarArr) {
        this(a.f6888c, hVarArr);
    }

    public boolean f(RecyclerView.h hVar) {
        return this.f6887a.h(hVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int findRelativeAdapterPositionIn(RecyclerView.h hVar, RecyclerView.g0 g0Var, int i10) {
        return this.f6887a.p(hVar, g0Var, i10);
    }

    void g(RecyclerView.h.a aVar) {
        super.setStateRestorationPolicy(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f6887a.q();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i10) {
        return this.f6887a.n(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return this.f6887a.o(i10);
    }

    public boolean h(RecyclerView.h hVar) {
        return this.f6887a.E(hVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f6887a.v(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.g0 g0Var, int i10) {
        this.f6887a.w(g0Var, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.g0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return this.f6887a.x(viewGroup, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f6887a.y(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public boolean onFailedToRecycleView(RecyclerView.g0 g0Var) {
        return this.f6887a.z(g0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewAttachedToWindow(RecyclerView.g0 g0Var) {
        this.f6887a.A(g0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewDetachedFromWindow(RecyclerView.g0 g0Var) {
        this.f6887a.B(g0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewRecycled(RecyclerView.g0 g0Var) {
        this.f6887a.C(g0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void setHasStableIds(boolean z10) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void setStateRestorationPolicy(RecyclerView.h.a aVar) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }

    public g(a aVar, RecyclerView.h... hVarArr) {
        this(aVar, Arrays.asList(hVarArr));
    }

    public g(a aVar, List list) {
        this.f6887a = new h(this, aVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f((RecyclerView.h) it.next());
        }
        super.setHasStableIds(this.f6887a.s());
    }
}
