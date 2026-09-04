package kf;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.hecorat.screenrecorder.free.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class i extends RecyclerView.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jg.b f43266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f43267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList f43268c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void e(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        View f43269b;

        b(View view) {
            super(view);
            this.f43269b = view;
        }
    }

    public i(jg.b bVar, a aVar, ArrayList arrayList) {
        this.f43268c = arrayList;
        this.f43266a = bVar;
        this.f43267b = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, final int i10) {
        View view = bVar.f43269b;
        view.findViewById(R.id.root_view).setOnClickListener(new View.OnClickListener() { // from class: kf.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f43263a.f43267b.e(i10);
            }
        });
        ng.c cVar = (ng.c) this.f43268c.get(i10);
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_thumb);
        ng.b bVar2 = (ng.b) cVar;
        if (!bVar2.i()) {
            ((com.bumptech.glide.k) com.bumptech.glide.c.B(this.f43266a).t(bVar2.f()).e()).A0(imageView);
            return;
        }
        ((com.bumptech.glide.k) com.bumptech.glide.c.B(this.f43266a).r(Uri.parse("file:///android_asset/" + bVar2.f())).k()).A0(imageView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f43268c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        View viewInflate = LayoutInflater.from(this.f43266a.getContext()).inflate(R.layout.image_item, viewGroup, false);
        viewInflate.getLayoutParams().height = nh.b.g(this.f43266a.getContext()) / this.f43266a.v();
        return new b(viewInflate);
    }

    public void i(ArrayList arrayList) {
        this.f43268c = arrayList;
        notifyDataSetChanged();
    }
}
