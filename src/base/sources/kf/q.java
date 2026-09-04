package kf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class q extends RecyclerView.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final tl.a f43344a;

    public q(tl.a onAllowClick) {
        kotlin.jvm.internal.s.h(onAllowClick, "onAllowClick");
        this.f43344a = onAllowClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, int i10) {
        kotlin.jvm.internal.s.h(holder, "holder");
        holder.d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.s.h(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.footer_read_permission, parent, false);
        kotlin.jvm.internal.s.e(viewInflate);
        return new a(viewInflate, this.f43344a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return 1;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final tl.a f43345b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final TextView f43346c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, tl.a onAllowClick) {
            super(view);
            kotlin.jvm.internal.s.h(view, "view");
            kotlin.jvm.internal.s.h(onAllowClick, "onAllowClick");
            this.f43345b = onAllowClick;
            View viewFindViewById = view.findViewById(R.id.permission_enable_btn);
            kotlin.jvm.internal.s.g(viewFindViewById, "findViewById(...)");
            TextView textView = (TextView) viewFindViewById;
            this.f43346c = textView;
            textView.setOnClickListener(new View.OnClickListener() { // from class: kf.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    q.a.c(this.f43308a, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(a aVar, View view) {
            aVar.f43345b.invoke();
        }

        public final void d() {
        }
    }
}
