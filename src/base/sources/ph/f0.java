package ph;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.functions.Function1;
import nh.l0;
import tf.x6;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class f0 extends androidx.recyclerview.widget.o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f50068c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final x6 f50069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Function1 f50070c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ng.d f50071d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x6 binding, Function1 onSelect) {
            super(binding.B());
            kotlin.jvm.internal.s.h(binding, "binding");
            kotlin.jvm.internal.s.h(onSelect, "onSelect");
            this.f50069b = binding;
            this.f50070c = onSelect;
            binding.a0(new View.OnClickListener() { // from class: ph.e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f0.a.c(this.f50067a, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(a aVar, View view) {
            ng.d dVar = aVar.f50071d;
            if (dVar != null) {
                aVar.f50070c.invoke(dVar);
            }
        }

        public final void d(ng.d item) {
            kotlin.jvm.internal.s.h(item, "item");
            this.f50071d = item;
            Context context = this.f50069b.B().getContext();
            this.f50069b.B.setText(l0.c(item.j()));
            this.f50069b.C.setText(item.s());
            if (item.v() > 0) {
                this.f50069b.A.setVisibility(0);
                this.f50069b.A.setText(String.valueOf(item.v()));
            } else {
                this.f50069b.A.setVisibility(4);
            }
            ((com.bumptech.glide.k) com.bumptech.glide.c.z(context).r(item.b()).e()).A0(this.f50069b.D);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Function1 onSelect) {
        super(new g0());
        kotlin.jvm.internal.s.h(onSelect, "onSelect");
        this.f50068c = onSelect;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, int i10) {
        kotlin.jvm.internal.s.h(holder, "holder");
        ng.d dVar = (ng.d) g(i10);
        kotlin.jvm.internal.s.e(dVar);
        holder.d(dVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.s.h(parent, "parent");
        x6 x6VarY = x6.Y(LayoutInflater.from(parent.getContext()), parent, false);
        kotlin.jvm.internal.s.g(x6VarY, "inflate(...)");
        return new a(x6VarY, this.f50068c);
    }

    public final void l(ng.d selectedItem) {
        kotlin.jvm.internal.s.h(selectedItem, "selectedItem");
        int iV = 0;
        if (selectedItem.v() > 0) {
            List listF = f();
            kotlin.jvm.internal.s.g(listF, "getCurrentList(...)");
            int i10 = 0;
            for (Object obj : listF) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    gl.r.u();
                }
                ng.d dVar = (ng.d) obj;
                if (dVar.v() > selectedItem.v()) {
                    dVar.H(dVar.v() - 1);
                    notifyItemChanged(i10);
                }
                i10 = i11;
            }
            selectedItem.H(0);
        } else {
            for (ng.d dVar2 : f()) {
                if (dVar2.v() > iV) {
                    iV = dVar2.v();
                }
            }
            selectedItem.H(iV + 1);
        }
        notifyItemChanged(f().indexOf(selectedItem));
    }
}
