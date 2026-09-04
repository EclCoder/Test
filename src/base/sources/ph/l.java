package ph;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import tf.a7;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class l extends androidx.recyclerview.widget.o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f50080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function1 f50081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f50082e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a7 f50083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Function1 f50084c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Function1 f50085d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ng.d f50086e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a7 binding, Function1 onClickRemove, Function1 onClickSelect) {
            super(binding.B());
            kotlin.jvm.internal.s.h(binding, "binding");
            kotlin.jvm.internal.s.h(onClickRemove, "onClickRemove");
            kotlin.jvm.internal.s.h(onClickSelect, "onClickSelect");
            this.f50083b = binding;
            this.f50084c = onClickRemove;
            this.f50085d = onClickSelect;
            binding.a0(new View.OnClickListener() { // from class: ph.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    l.a.d(this.f50078a, view);
                }
            });
            binding.c0(new View.OnClickListener() { // from class: ph.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    l.a.e(this.f50079a, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(a aVar, View view) {
            ng.d dVar = aVar.f50086e;
            if (dVar != null) {
                aVar.f50084c.invoke(dVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(a aVar, View view) {
            ng.d dVar = aVar.f50086e;
            if (dVar != null) {
                aVar.f50085d.invoke(dVar);
            }
        }

        public final void f(ng.d item, boolean z10, boolean z11) {
            kotlin.jvm.internal.s.h(item, "item");
            this.f50086e = item;
            a7 a7Var = this.f50083b;
            a7Var.b0(item);
            a7Var.A.setBackgroundColor(z10 ? -65536 : 0);
            a7Var.B.setVisibility(z11 ? 0 : 8);
            i6.a aVarE = ((i6.f) new i6.f().l(item.z() * 1000)).e();
            kotlin.jvm.internal.s.g(aVarE, "centerCrop(...)");
            com.bumptech.glide.c.z(this.f50083b.C.getContext()).r(item.b()).b((i6.f) aVarE).A0(this.f50083b.C);
            a7Var.v();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Function1 onClickRemove, Function1 onClickSelect) {
        super(new m());
        kotlin.jvm.internal.s.h(onClickRemove, "onClickRemove");
        kotlin.jvm.internal.s.h(onClickSelect, "onClickSelect");
        this.f50080c = onClickRemove;
        this.f50081d = onClickSelect;
    }

    public final void j(int i10) {
        int i11 = this.f50082e;
        if (i10 == i11) {
            return;
        }
        notifyItemChanged(i11);
        this.f50082e = i10;
        notifyItemChanged(i10);
    }

    public final int k() {
        return this.f50082e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.g0 holder, int i10) {
        kotlin.jvm.internal.s.h(holder, "holder");
        ng.d dVar = (ng.d) g(i10);
        a aVar = (a) holder;
        kotlin.jvm.internal.s.e(dVar);
        aVar.f(dVar, this.f50082e == i10, f().size() > 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.g0 onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.s.h(parent, "parent");
        a7 a7VarY = a7.Y(LayoutInflater.from(parent.getContext()), parent, false);
        kotlin.jvm.internal.s.g(a7VarY, "inflate(...)");
        return new a(a7VarY, this.f50080c, this.f50081d);
    }
}
