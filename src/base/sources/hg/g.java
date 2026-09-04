package hg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.s;
import tf.s5;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class g extends RecyclerView.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final tl.a f40362a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s5 f40363b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s5 binding) {
            super(binding.B());
            s.h(binding, "binding");
            this.f40363b = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(tl.a aVar, View view) {
            aVar.invoke();
        }

        public final void c(final tl.a onClick) {
            s.h(onClick, "onClick");
            this.f40363b.a0(new View.OnClickListener() { // from class: hg.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    g.a.d(onClick, view);
                }
            });
        }
    }

    public g(tl.a onClick) {
        s.h(onClick, "onClick");
        this.f40362a = onClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, int i10) {
        s.h(holder, "holder");
        holder.c(this.f40362a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup parent, int i10) {
        s.h(parent, "parent");
        s5 s5VarY = s5.Y(LayoutInflater.from(parent.getContext()), parent, false);
        s.g(s5VarY, "inflate(...)");
        return new a(s5VarY);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return 1;
    }
}
