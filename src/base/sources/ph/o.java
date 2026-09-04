package ph;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import tf.u5;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class o extends RecyclerView.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final tl.a f50088a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final u5 f50089b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u5 binding) {
            super(binding.B());
            kotlin.jvm.internal.s.h(binding, "binding");
            this.f50089b = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(tl.a aVar, View view) {
            aVar.invoke();
        }

        public final void c(final tl.a onClick) {
            kotlin.jvm.internal.s.h(onClick, "onClick");
            this.f50089b.a0(new View.OnClickListener() { // from class: ph.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    o.a.d(onClick, view);
                }
            });
        }
    }

    public o(tl.a onClick) {
        kotlin.jvm.internal.s.h(onClick, "onClick");
        this.f50088a = onClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, int i10) {
        kotlin.jvm.internal.s.h(holder, "holder");
        holder.c(this.f50088a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.s.h(parent, "parent");
        u5 u5VarY = u5.Y(LayoutInflater.from(parent.getContext()), parent, false);
        kotlin.jvm.internal.s.g(u5VarY, "inflate(...)");
        return new a(u5VarY);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return 1;
    }
}
