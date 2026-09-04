package ph;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.hecorat.screenrecorder.free.R;
import kotlin.jvm.functions.Function1;
import tf.i6;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class e extends androidx.recyclerview.widget.o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f50062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f50063d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final i6 f50064b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Function1 f50065c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f50066d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i6 binding, Function1 onSelect) {
            super(binding.B());
            kotlin.jvm.internal.s.h(binding, "binding");
            kotlin.jvm.internal.s.h(onSelect, "onSelect");
            this.f50064b = binding;
            this.f50065c = onSelect;
            binding.a0(new View.OnClickListener() { // from class: ph.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e.a.c(this.f50061a, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(a aVar, View view) {
            Integer num = aVar.f50066d;
            if (num != null) {
                aVar.f50065c.invoke(Integer.valueOf(num.intValue()));
            }
        }

        public final void d(int i10, boolean z10) {
            this.f50066d = Integer.valueOf(i10);
            Context context = this.f50064b.B().getContext();
            this.f50064b.B.setBackgroundColor(i10);
            this.f50064b.A.setStrokeWidth(z10 ? context.getResources().getDimensionPixelSize(R.dimen.card_view_stroke_width) : 0);
            this.f50064b.A.setRadius(z10 ? context.getResources().getDimensionPixelSize(R.dimen.card_view_stroke_width) : 0.0f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Function1 onSelect) {
        super(new f());
        kotlin.jvm.internal.s.h(onSelect, "onSelect");
        this.f50062c = onSelect;
    }

    public final void j(int i10) {
        int iIndexOf = f().indexOf(Integer.valueOf(i10));
        notifyItemChanged(this.f50063d);
        this.f50063d = iIndexOf;
        notifyItemChanged(iIndexOf);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, int i10) {
        kotlin.jvm.internal.s.h(holder, "holder");
        Integer num = (Integer) g(i10);
        kotlin.jvm.internal.s.e(num);
        holder.d(num.intValue(), i10 == this.f50063d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.s.h(parent, "parent");
        i6 i6VarY = i6.Y(LayoutInflater.from(parent.getContext()), parent, false);
        kotlin.jvm.internal.s.g(i6VarY, "inflate(...)");
        return new a(i6VarY, this.f50062c);
    }
}
