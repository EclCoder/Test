package kf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.hecorat.screenrecorder.free.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class z extends androidx.recyclerview.widget.o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f43390c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f43391d = new a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends androidx.recyclerview.widget.j.f {
        a() {
        }

        @Override // androidx.recyclerview.widget.j.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(a0 o10, a0 n10) {
            kotlin.jvm.internal.s.h(o10, "o");
            kotlin.jvm.internal.s.h(n10, "n");
            return kotlin.jvm.internal.s.c(o10.h(), n10.h()) && kotlin.jvm.internal.s.c(o10.d(), n10.d()) && kotlin.jvm.internal.s.c(o10.b(), n10.b()) && kotlin.jvm.internal.s.c(o10.e(), n10.e()) && kotlin.jvm.internal.s.c(o10.a(), n10.a()) && o10.j() == n10.j() && kotlin.jvm.internal.s.c(o10.i(), n10.i()) && kotlin.jvm.internal.s.c(o10.f(), n10.f()) && kotlin.jvm.internal.s.c(o10.c(), n10.c());
        }

        @Override // androidx.recyclerview.widget.j.f
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean b(a0 o10, a0 n10) {
            kotlin.jvm.internal.s.h(o10, "o");
            kotlin.jvm.internal.s.h(n10, "n");
            return kotlin.jvm.internal.s.c(o10.g(), n10.g());
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

    public z() {
        super(f43391d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(c0 holder, int i10) {
        kotlin.jvm.internal.s.h(holder, "holder");
        Object objG = g(i10);
        kotlin.jvm.internal.s.g(objG, "getItem(...)");
        holder.c((a0) objG);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public c0 onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.s.h(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_utility, parent, false);
        kotlin.jvm.internal.s.e(viewInflate);
        return new c0(viewInflate);
    }
}
