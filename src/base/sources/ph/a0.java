package ph;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.functions.Function1;
import tf.v6;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a0 extends androidx.recyclerview.widget.o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f50052c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final v6 f50053b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Function1 f50054c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ng.b f50055d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v6 binding, Function1 onSelect) {
            super(binding.B());
            kotlin.jvm.internal.s.h(binding, "binding");
            kotlin.jvm.internal.s.h(onSelect, "onSelect");
            this.f50053b = binding;
            this.f50054c = onSelect;
            binding.a0(new View.OnClickListener() { // from class: ph.z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a0.a.c(this.f50106a, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(a aVar, View view) {
            ng.b bVar = aVar.f50055d;
            if (bVar != null) {
                aVar.f50054c.invoke(bVar);
            }
        }

        public final void d(ng.b item) {
            kotlin.jvm.internal.s.h(item, "item");
            this.f50055d = item;
            this.f50053b.C.setText(item.e());
            Context context = this.f50053b.B().getContext();
            if (item.g() > 0) {
                this.f50053b.A.setVisibility(0);
                this.f50053b.A.setText(String.valueOf(item.g()));
            } else {
                this.f50053b.A.setVisibility(4);
            }
            ((com.bumptech.glide.k) com.bumptech.glide.c.z(context).r(item.b()).e()).A0(this.f50053b.B);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Function1 onSelect) {
        super(new b0());
        kotlin.jvm.internal.s.h(onSelect, "onSelect");
        this.f50052c = onSelect;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, int i10) {
        kotlin.jvm.internal.s.h(holder, "holder");
        ng.b bVar = (ng.b) g(i10);
        kotlin.jvm.internal.s.e(bVar);
        holder.d(bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.s.h(parent, "parent");
        v6 v6VarY = v6.Y(LayoutInflater.from(parent.getContext()), parent, false);
        kotlin.jvm.internal.s.g(v6VarY, "inflate(...)");
        return new a(v6VarY, this.f50052c);
    }

    public final void l(ng.b selectedItem) {
        kotlin.jvm.internal.s.h(selectedItem, "selectedItem");
        int iG = 0;
        if (selectedItem.g() > 0) {
            List listF = f();
            kotlin.jvm.internal.s.g(listF, "getCurrentList(...)");
            int i10 = 0;
            for (Object obj : listF) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    gl.r.u();
                }
                ng.b bVar = (ng.b) obj;
                if (bVar.g() > selectedItem.g()) {
                    bVar.j(bVar.g() - 1);
                    notifyItemChanged(i10);
                }
                i10 = i11;
            }
            selectedItem.j(0);
        } else {
            for (ng.b bVar2 : f()) {
                if (bVar2.g() > iG) {
                    iG = bVar2.g();
                }
            }
            selectedItem.j(iG + 1);
        }
        notifyItemChanged(f().indexOf(selectedItem));
    }
}
