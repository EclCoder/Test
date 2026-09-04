package ph;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.hecorat.screenrecorder.free.R;
import kotlin.jvm.functions.Function1;
import tf.t6;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class u extends androidx.recyclerview.widget.o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f50099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f50100d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t6 f50101b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Function1 f50102c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private qh.d f50103d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t6 binding, Function1 onSelect) {
            super(binding.B());
            kotlin.jvm.internal.s.h(binding, "binding");
            kotlin.jvm.internal.s.h(onSelect, "onSelect");
            this.f50101b = binding;
            this.f50102c = onSelect;
            binding.a0(new View.OnClickListener() { // from class: ph.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    u.a.c(this.f50098a, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(a aVar, View view) {
            qh.d dVar = aVar.f50103d;
            if (dVar != null) {
                aVar.f50102c.invoke(dVar);
            }
        }

        public final void d(qh.d item, boolean z10) {
            kotlin.jvm.internal.s.h(item, "item");
            this.f50103d = item;
            Context context = this.f50101b.B().getContext();
            this.f50101b.D.setText(item.b());
            this.f50101b.B.setText(item.a());
            this.f50101b.A.setStrokeColor(z10 ? androidx.core.content.a.getColor(context, R.color.sunset_orange) : androidx.core.content.a.getColor(context, R.color.transparent));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Function1 onSelect) {
        super(new v());
        kotlin.jvm.internal.s.h(onSelect, "onSelect");
        this.f50099c = onSelect;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, int i10) {
        kotlin.jvm.internal.s.h(holder, "holder");
        qh.d dVar = (qh.d) g(i10);
        kotlin.jvm.internal.s.e(dVar);
        holder.d(dVar, this.f50100d == i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.s.h(parent, "parent");
        t6 t6VarY = t6.Y(LayoutInflater.from(parent.getContext()), parent, false);
        kotlin.jvm.internal.s.g(t6VarY, "inflate(...)");
        return new a(t6VarY, this.f50099c);
    }

    public final void l(int i10) {
        this.f50100d = i10;
    }

    public final void m(qh.d item) {
        kotlin.jvm.internal.s.h(item, "item");
        notifyItemChanged(this.f50100d);
        int iIndexOf = f().indexOf(item);
        this.f50100d = iIndexOf;
        notifyItemChanged(iIndexOf);
    }
}
