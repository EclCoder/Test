package ph;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class y extends RecyclerView.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final tl.a f50105a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends RecyclerView.g0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View itemView) {
            super(itemView);
            kotlin.jvm.internal.s.h(itemView, "itemView");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(tl.a aVar, View view) {
            aVar.invoke();
        }

        public final void c(final tl.a onClick) {
            kotlin.jvm.internal.s.h(onClick, "onClick");
            ((Button) this.itemView.findViewById(R.id.volume_btn)).setOnClickListener(new View.OnClickListener() { // from class: ph.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    y.a.d(onClick, view);
                }
            });
        }
    }

    public y(tl.a onClick) {
        kotlin.jvm.internal.s.h(onClick, "onClick");
        this.f50105a = onClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, int i10) {
        kotlin.jvm.internal.s.h(holder, "holder");
        holder.c(this.f50105a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.s.h(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.header_scroll_seekbar, parent, false);
        viewInflate.setLayoutParams(new FrameLayout.LayoutParams(nh.b.g(parent.getContext()) / 2, -2));
        kotlin.jvm.internal.s.e(viewInflate);
        return new a(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return 1;
    }
}
