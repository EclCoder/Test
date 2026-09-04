package nf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.installations.ktx.gUsI.dmHT;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tf.g6;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class c0 extends androidx.recyclerview.widget.o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f47565d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f47566e = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f47567c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    public static final class a extends androidx.recyclerview.widget.j.f {
        a() {
        }

        @Override // androidx.recyclerview.widget.j.f
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean b(e0 oldItem, e0 newItem) {
            kotlin.jvm.internal.s.h(oldItem, "oldItem");
            kotlin.jvm.internal.s.h(newItem, "newItem");
            return kotlin.jvm.internal.s.c(oldItem.a().a(), newItem.a().a());
        }

        @Override // androidx.recyclerview.widget.j.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(e0 e0Var, e0 newItem) {
            kotlin.jvm.internal.s.h(e0Var, dmHT.ThZGAsmaIYOmJ);
            kotlin.jvm.internal.s.h(newItem, "newItem");
            return kotlin.jvm.internal.s.c(e0Var, newItem);
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
        private final g6 f47568b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c0 f47569c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(c0 c0Var, g6 binding) {
            super(binding.b());
            kotlin.jvm.internal.s.h(binding, "binding");
            this.f47569c = c0Var;
            this.f47568b = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(c0 c0Var, e0 e0Var, View view) {
            c0Var.f47567c.invoke(e0Var);
        }

        public final void c(final e0 row) {
            kotlin.jvm.internal.s.h(row, "row");
            this.f47568b.f53341g.setText(row.a().b());
            this.f47568b.f53340f.setVisibility(8);
            this.f47568b.f53337c.setVisibility(8);
            this.f47568b.f53339e.setVisibility(8);
            this.f47568b.f53336b.setVisibility(8);
            this.f47568b.f53338d.setVisibility(8);
            this.f47568b.f53342h.setVisibility(8);
            ConstraintLayout constraintLayoutB = this.f47568b.b();
            final c0 c0Var = this.f47569c;
            constraintLayoutB.setOnClickListener(new View.OnClickListener() { // from class: nf.d0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c0.c.d(c0Var, row, view);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Function1 onClick) {
        super(f47566e);
        kotlin.jvm.internal.s.h(onClick, "onClick");
        this.f47567c = onClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(c holder, int i10) {
        kotlin.jvm.internal.s.h(holder, "holder");
        Object objG = g(i10);
        kotlin.jvm.internal.s.g(objG, "getItem(...)");
        holder.c((e0) objG);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public c onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.s.h(parent, "parent");
        g6 g6VarC = g6.c(LayoutInflater.from(parent.getContext()), parent, false);
        kotlin.jvm.internal.s.g(g6VarC, "inflate(...)");
        return new c(this, g6VarC);
    }
}
