package ph;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import tf.r6;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class s extends RecyclerView.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f50096a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final r6 f50097b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r6 binding) {
            super(binding.B());
            kotlin.jvm.internal.s.h(binding, "binding");
            this.f50097b = binding;
        }

        public final void b(List videoList, int i10) {
            kotlin.jvm.internal.s.h(videoList, "videoList");
            fl.q qVarT = sh.b.t(videoList, (i10 * 2000) + 1000);
            ng.d dVar = (ng.d) qVarT.h();
            i6.a aVarE = ((i6.f) new i6.f().l(((Number) qVarT.i()).longValue() * 1000)).e();
            kotlin.jvm.internal.s.g(aVarE, "centerCrop(...)");
            com.bumptech.glide.c.z(this.f50097b.B().getContext()).j().D0(dVar.b()).b((i6.f) aVarE).A0(this.f50097b.A);
        }
    }

    public s(List videoList) {
        kotlin.jvm.internal.s.h(videoList, "videoList");
        this.f50096a = videoList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        long jX = sh.b.x(this.f50096a);
        if (jX < 2000) {
            return 1;
        }
        return (int) ((jX + 1) / ((long) 2000));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.g0 holder, int i10) {
        kotlin.jvm.internal.s.h(holder, "holder");
        ((a) holder).b(this.f50096a, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.g0 onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.s.h(parent, "parent");
        r6 r6VarY = r6.Y(LayoutInflater.from(parent.getContext()), parent, false);
        kotlin.jvm.internal.s.g(r6VarY, "inflate(...)");
        return new a(r6VarY);
    }
}
