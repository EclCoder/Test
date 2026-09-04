package ph;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.hecorat.screenrecorder.free.R;
import kotlin.jvm.functions.Function1;
import tf.e6;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b extends androidx.recyclerview.widget.o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f50056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f50057d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e6 f50058b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Function1 f50059c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f50060d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e6 binding, Function1 onSelect) {
            super(binding.B());
            kotlin.jvm.internal.s.h(binding, "binding");
            kotlin.jvm.internal.s.h(onSelect, "onSelect");
            this.f50058b = binding;
            this.f50059c = onSelect;
            binding.a0(new View.OnClickListener() { // from class: ph.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.a.c(this.f50051a, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(a aVar, View view) {
            String str = aVar.f50060d;
            if (str != null) {
                aVar.f50059c.invoke(str);
            }
        }

        public final void d(String imgPath, boolean z10) {
            kotlin.jvm.internal.s.h(imgPath, "imgPath");
            this.f50060d = imgPath;
            int color = androidx.core.content.a.getColor(this.f50058b.B().getContext(), z10 ? R.color.white : R.color.transparent);
            View viewB = this.f50058b.B();
            kotlin.jvm.internal.s.f(viewB, "null cannot be cast to non-null type com.google.android.material.card.MaterialCardView");
            ((MaterialCardView) viewB).setStrokeColor(color);
            wp.a.a("Glide load path " + imgPath, new Object[0]);
            com.bumptech.glide.c.z(this.f50058b.B().getContext()).t(imgPath).A0(this.f50058b.A);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Function1 onSelect) {
        super(new c());
        kotlin.jvm.internal.s.h(onSelect, "onSelect");
        this.f50056c = onSelect;
        this.f50057d = -1;
    }

    public final void j(String path) {
        kotlin.jvm.internal.s.h(path, "path");
        int iIndexOf = f().indexOf(path);
        notifyItemChanged(this.f50057d);
        this.f50057d = iIndexOf;
        notifyItemChanged(iIndexOf);
    }

    public final String k() {
        if (this.f50057d != -1) {
            return (String) f().get(this.f50057d);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, int i10) {
        kotlin.jvm.internal.s.h(holder, "holder");
        String str = (String) g(i10);
        kotlin.jvm.internal.s.e(str);
        holder.d(str, this.f50057d == i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.s.h(parent, "parent");
        e6 e6VarY = e6.Y(LayoutInflater.from(parent.getContext()), parent, false);
        kotlin.jvm.internal.s.g(e6VarY, "inflate(...)");
        return new a(e6VarY, this.f50056c);
    }

    public final void n(String str) {
        this.f50057d = str == null ? -1 : f().indexOf(str);
    }
}
