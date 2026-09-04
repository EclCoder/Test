package kf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.hecorat.screenrecorder.free.R;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class s extends RecyclerView.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f43353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f43354b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ImageView f43355b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private TextView f43356c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.item_share, parent, false));
            kotlin.jvm.internal.s.h(inflater, "inflater");
            kotlin.jvm.internal.s.h(parent, "parent");
            this.f43355b = (ImageView) this.itemView.findViewById(R.id.icon_iv);
            this.f43356c = (TextView) this.itemView.findViewById(R.id.name_tv);
        }

        public final void b(tg.c shareableApp) {
            kotlin.jvm.internal.s.h(shareableApp, "shareableApp");
            ImageView imageView = this.f43355b;
            if (imageView != null) {
                imageView.setImageDrawable(shareableApp.b());
            }
            TextView textView = this.f43356c;
            if (textView != null) {
                textView.setText(shareableApp.c());
            }
        }
    }

    public s(List list, o clickListener) {
        kotlin.jvm.internal.s.h(list, "list");
        kotlin.jvm.internal.s.h(clickListener, "clickListener");
        this.f43353a = list;
        this.f43354b = clickListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(s sVar, tg.c cVar, View view) {
        sVar.f43354b.r(cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, int i10) {
        kotlin.jvm.internal.s.h(holder, "holder");
        final tg.c cVar = (tg.c) this.f43353a.get(i10);
        holder.b(cVar);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: kf.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s.h(this.f43348a, cVar, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f43353a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.s.h(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        kotlin.jvm.internal.s.e(layoutInflaterFrom);
        return new a(layoutInflaterFrom, parent);
    }
}
