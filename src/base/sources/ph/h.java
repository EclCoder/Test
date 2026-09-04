package ph;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.hecorat.screenrecorder.free.R;
import kotlin.jvm.functions.Function1;
import tf.k6;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class h extends androidx.recyclerview.widget.o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f50073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f50074d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final k6 f50075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Function1 f50076c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private qh.h f50077d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k6 binding, Function1 onSelect) {
            super(binding.B());
            kotlin.jvm.internal.s.h(binding, "binding");
            kotlin.jvm.internal.s.h(onSelect, "onSelect");
            this.f50075b = binding;
            this.f50076c = onSelect;
            binding.a0(new View.OnClickListener() { // from class: ph.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    h.a.c(this.f50072a, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(a aVar, View view) {
            qh.h hVar = aVar.f50077d;
            if (hVar != null) {
                aVar.f50076c.invoke(hVar);
            }
        }

        public final void d(qh.h ratio, boolean z10) {
            kotlin.jvm.internal.s.h(ratio, "ratio");
            this.f50077d = ratio;
            Context context = this.f50075b.B().getContext();
            int color = androidx.core.content.a.getColor(context, z10 ? R.color.sunset_orange : R.color.white_grey);
            this.f50075b.D.setText(ratio.i());
            this.f50075b.D.setTextColor(color);
            this.f50075b.B.setBackgroundColor(color);
            ViewGroup.LayoutParams layoutParams = this.f50075b.B.getLayoutParams();
            kotlin.jvm.internal.s.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ConstraintLayout.b) layoutParams).I = ratio.f(1.0f);
            Integer numH = ratio.h();
            if (numH != null) {
                this.f50075b.C.setImageDrawable(androidx.core.content.a.getDrawable(context, numH.intValue()));
                androidx.core.widget.e.c(this.f50075b.C, ColorStateList.valueOf(color));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Function1 onSelect) {
        super(new i());
        kotlin.jvm.internal.s.h(onSelect, "onSelect");
        this.f50073c = onSelect;
    }

    public final void j(qh.h ratio) {
        kotlin.jvm.internal.s.h(ratio, "ratio");
        int iIndexOf = f().indexOf(ratio);
        notifyItemChanged(this.f50074d);
        this.f50074d = iIndexOf;
        notifyItemChanged(iIndexOf);
    }

    public final int k() {
        return this.f50074d;
    }

    public final qh.h l() {
        Object obj = f().get(this.f50074d);
        kotlin.jvm.internal.s.g(obj, "get(...)");
        return (qh.h) obj;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, int i10) {
        kotlin.jvm.internal.s.h(holder, "holder");
        qh.h hVar = (qh.h) g(i10);
        kotlin.jvm.internal.s.e(hVar);
        holder.d(hVar, this.f50074d == i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.s.h(parent, "parent");
        k6 k6VarY = k6.Y(LayoutInflater.from(parent.getContext()), parent, false);
        kotlin.jvm.internal.s.g(k6VarY, "inflate(...)");
        return new a(k6VarY, this.f50073c);
    }

    public final void o(int i10) {
        this.f50074d = i10;
    }

    public final void p(qh.h ratio) {
        kotlin.jvm.internal.s.h(ratio, "ratio");
        this.f50074d = f().indexOf(ratio);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return i10;
    }
}
