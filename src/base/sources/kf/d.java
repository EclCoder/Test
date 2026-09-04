package kf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import tf.c6;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class d extends androidx.recyclerview.widget.o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f43236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function1 f43237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Function1 f43238e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c6 f43239b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Function1 f43240c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Function1 f43241d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Function1 f43242e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ng.a f43243f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c6 binding, Function1 onAddClick, Function1 onPlayClick, Function1 onPauseClick) {
            super(binding.B());
            kotlin.jvm.internal.s.h(binding, "binding");
            kotlin.jvm.internal.s.h(onAddClick, "onAddClick");
            kotlin.jvm.internal.s.h(onPlayClick, "onPlayClick");
            kotlin.jvm.internal.s.h(onPauseClick, "onPauseClick");
            this.f43239b = binding;
            this.f43240c = onAddClick;
            this.f43241d = onPlayClick;
            this.f43242e = onPauseClick;
            binding.a0(new View.OnClickListener() { // from class: kf.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.a.e(this.f43196a, view);
                }
            });
            binding.c0(new View.OnClickListener() { // from class: kf.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.a.f(this.f43226a, view);
                }
            });
            binding.b0(new View.OnClickListener() { // from class: kf.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.a.g(this.f43229a, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(a aVar, View view) {
            ng.a aVar2 = aVar.f43243f;
            if (aVar2 != null) {
                aVar.f43240c.invoke(aVar2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(a aVar, View view) {
            ng.a aVar2 = aVar.f43243f;
            if (aVar2 != null) {
                aVar.f43241d.invoke(aVar2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(a aVar, View view) {
            ng.a aVar2 = aVar.f43243f;
            if (aVar2 != null) {
                aVar.f43242e.invoke(aVar2);
            }
        }

        public final void h(ng.a audioItem) {
            kotlin.jvm.internal.s.h(audioItem, "audioItem");
            this.f43243f = audioItem;
            this.f43239b.D.setText(audioItem.e());
            this.f43239b.B.setText(nh.l0.c(audioItem.c()));
            this.f43239b.F.setVisibility(audioItem.g() ? 8 : 0);
            this.f43239b.G.setVisibility(audioItem.g() ? 0 : 8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Function1 onAddClick, Function1 onPlayClick, Function1 onPauseClick) {
        super(new e());
        kotlin.jvm.internal.s.h(onAddClick, "onAddClick");
        kotlin.jvm.internal.s.h(onPlayClick, "onPlayClick");
        kotlin.jvm.internal.s.h(onPauseClick, "onPauseClick");
        this.f43236c = onAddClick;
        this.f43237d = onPlayClick;
        this.f43238e = onPauseClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, int i10) {
        kotlin.jvm.internal.s.h(holder, "holder");
        ng.a aVar = (ng.a) g(i10);
        kotlin.jvm.internal.s.e(aVar);
        holder.h(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.s.h(parent, "parent");
        c6 c6VarY = c6.Y(LayoutInflater.from(parent.getContext()), parent, false);
        kotlin.jvm.internal.s.g(c6VarY, "inflate(...)");
        return new a(c6VarY, this.f43236c, this.f43237d, this.f43238e);
    }

    public final void l(ng.a item) {
        kotlin.jvm.internal.s.h(item, "item");
        int iIndexOf = f().indexOf(item);
        item.i(true);
        notifyItemChanged(iIndexOf);
    }

    public final void m(ng.a item) {
        kotlin.jvm.internal.s.h(item, "item");
        int iIndexOf = f().indexOf(item);
        item.i(false);
        notifyItemChanged(iIndexOf);
    }
}
