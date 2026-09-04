package ph;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.hecorat.screenrecorder.free.R;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import tf.p6;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class q extends androidx.recyclerview.widget.o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f50091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f50092d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p6 f50093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Function1 f50094c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private og.a f50095d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p6 binding, Function1 onSelect) {
            super(binding.B());
            kotlin.jvm.internal.s.h(binding, "binding");
            kotlin.jvm.internal.s.h(onSelect, "onSelect");
            this.f50093b = binding;
            this.f50094c = onSelect;
            binding.a0(new View.OnClickListener() { // from class: ph.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    q.a.c(this.f50090a, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(a aVar, View view) {
            og.a aVar2 = aVar.f50095d;
            if (aVar2 != null) {
                aVar.f50094c.invoke(aVar2);
            }
        }

        public final void d(og.a fontItem, boolean z10) {
            kotlin.jvm.internal.s.h(fontItem, "fontItem");
            this.f50095d = fontItem;
            this.f50093b.B.setTypeface(Typeface.createFromFile(fontItem.b()));
            this.f50093b.A.setStrokeColor(androidx.core.content.a.getColor(this.f50093b.B().getContext(), z10 ? R.color.sunset_orange : R.color.transparent));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Function1 onSelect) {
        super(new r());
        kotlin.jvm.internal.s.h(onSelect, "onSelect");
        this.f50091c = onSelect;
    }

    public final void j(og.a item) {
        kotlin.jvm.internal.s.h(item, "item");
        Iterator it = f().iterator();
        int i10 = -1;
        int i11 = 0;
        while (it.hasNext()) {
            int i12 = i11 + 1;
            if (kotlin.jvm.internal.s.c(((og.a) it.next()).b(), item.b())) {
                i10 = i11;
            }
            i11 = i12;
        }
        notifyItemChanged(this.f50092d);
        this.f50092d = i10;
        notifyItemChanged(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, int i10) {
        kotlin.jvm.internal.s.h(holder, "holder");
        og.a aVar = (og.a) g(i10);
        kotlin.jvm.internal.s.e(aVar);
        holder.d(aVar, this.f50092d == i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.s.h(parent, "parent");
        p6 p6VarY = p6.Y(LayoutInflater.from(parent.getContext()), parent, false);
        kotlin.jvm.internal.s.g(p6VarY, "inflate(...)");
        return new a(p6VarY, this.f50091c);
    }
}
