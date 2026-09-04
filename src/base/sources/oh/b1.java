package oh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tf.m6;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class b1 extends androidx.recyclerview.widget.o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f48604d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f48605e = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f48606c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends androidx.recyclerview.widget.j.f {
        a() {
        }

        @Override // androidx.recyclerview.widget.j.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(qh.j oldItem, qh.j newItem) {
            kotlin.jvm.internal.s.h(oldItem, "oldItem");
            kotlin.jvm.internal.s.h(newItem, "newItem");
            return kotlin.jvm.internal.s.c(oldItem.d(), newItem.d()) && oldItem.c() == newItem.c();
        }

        @Override // androidx.recyclerview.widget.j.f
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean b(qh.j oldItem, qh.j newItem) {
            kotlin.jvm.internal.s.h(oldItem, "oldItem");
            kotlin.jvm.internal.s.h(newItem, "newItem");
            return kotlin.jvm.internal.s.c(oldItem.getId(), newItem.getId());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class c extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final m6 f48607b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b1 f48608c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b1 b1Var, m6 binding) {
            super(binding.b());
            kotlin.jvm.internal.s.h(binding, "binding");
            this.f48608c = b1Var;
            this.f48607b = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(b1 b1Var, qh.j jVar, View view) {
            b1Var.f48606c.invoke(jVar);
        }

        private final String e(long j10) {
            long j11 = 1000;
            long j12 = j10 / j11;
            int i10 = (int) ((j10 % j11) / ((long) 100));
            long j13 = 60;
            kotlin.jvm.internal.o0 o0Var = kotlin.jvm.internal.o0.f43602a;
            String str = String.format("%02d:%02d.%d", Arrays.copyOf(new Object[]{Long.valueOf(j12 / j13), Long.valueOf(j12 % j13), Integer.valueOf(i10)}, 3));
            kotlin.jvm.internal.s.g(str, "format(...)");
            return str;
        }

        public final void c(final qh.j item) {
            kotlin.jvm.internal.s.h(item, "item");
            this.f48607b.f53373d.setText(e(item.c()));
            this.f48607b.f53371b.setText(bm.r.I(item.d(), "\n", " ", false, 4, null));
            ConstraintLayout constraintLayoutB = this.f48607b.b();
            final b1 b1Var = this.f48608c;
            constraintLayoutB.setOnClickListener(new View.OnClickListener() { // from class: oh.c1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b1.c.d(b1Var, item, view);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(Function1 onClick) {
        super(f48605e);
        kotlin.jvm.internal.s.h(onClick, "onClick");
        this.f48606c = onClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(c holder, int i10) {
        kotlin.jvm.internal.s.h(holder, "holder");
        Object objG = g(i10);
        kotlin.jvm.internal.s.g(objG, "getItem(...)");
        holder.c((qh.j) objG);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public c onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.s.h(parent, "parent");
        m6 m6VarC = m6.c(LayoutInflater.from(parent.getContext()), parent, false);
        kotlin.jvm.internal.s.g(m6VarC, "inflate(...)");
        return new c(this, m6VarC);
    }
}
