package kf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.UpgradeActivity;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class g extends RecyclerView.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f43254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f43255b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ImageView f43256b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private TextView f43257c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ImageView f43258d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ g f43259e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, View view) {
            super(view);
            kotlin.jvm.internal.s.h(view, "view");
            this.f43259e = gVar;
            View viewFindViewById = view.findViewById(R.id.benefit_iv);
            kotlin.jvm.internal.s.g(viewFindViewById, "findViewById(...)");
            this.f43256b = (ImageView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.benefit_tv);
            kotlin.jvm.internal.s.g(viewFindViewById2, "findViewById(...)");
            this.f43257c = (TextView) viewFindViewById2;
            this.f43258d = (ImageView) view.findViewById(R.id.is_free_iv);
        }

        public final ImageView b() {
            return this.f43256b;
        }

        public final TextView c() {
            return this.f43257c;
        }

        public final ImageView d() {
            return this.f43258d;
        }
    }

    public g(List benefitList, int i10) {
        kotlin.jvm.internal.s.h(benefitList, "benefitList");
        this.f43254a = benefitList;
        this.f43255b = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a holder, int i10) {
        ImageView imageViewD;
        kotlin.jvm.internal.s.h(holder, "holder");
        holder.b().setImageResource(((UpgradeActivity.a) this.f43254a.get(i10)).a());
        holder.c().setText(((UpgradeActivity.a) this.f43254a.get(i10)).b());
        if (this.f43255b != R.layout.list_item_benefit_immersive || (imageViewD = holder.d()) == null) {
            return;
        }
        imageViewD.setImageResource(((UpgradeActivity.a) this.f43254a.get(i10)).c() ? R.drawable.ic_check_white_24dp : R.drawable.ic_baseline_remove_24);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.s.h(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(this.f43255b, parent, false);
        kotlin.jvm.internal.s.g(viewInflate, "inflate(...)");
        return new a(this, viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f43254a.size();
    }
}
