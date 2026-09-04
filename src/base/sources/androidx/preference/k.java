package androidx.preference;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class k extends u {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final RecyclerView f6415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final n0.a f6416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final n0.a f6417h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends n0.a {
        a() {
        }

        @Override // n0.a
        public void g(View view, o0.p pVar) {
            Preference preferenceI;
            k.this.f6416g.g(view, pVar);
            int iM0 = k.this.f6415f.m0(view);
            RecyclerView.h adapter = k.this.f6415f.getAdapter();
            if ((adapter instanceof h) && (preferenceI = ((h) adapter).i(iM0)) != null) {
                preferenceI.X(pVar);
            }
        }

        @Override // n0.a
        public boolean j(View view, int i10, Bundle bundle) {
            return k.this.f6416g.j(view, i10, bundle);
        }
    }

    public k(RecyclerView recyclerView) {
        super(recyclerView);
        this.f6416g = super.n();
        this.f6417h = new a();
        this.f6415f = recyclerView;
    }

    @Override // androidx.recyclerview.widget.u
    public n0.a n() {
        return this.f6417h;
    }
}
