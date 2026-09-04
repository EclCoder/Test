package w4;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import n0.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b extends RecyclerView.g0 {
    private b(FrameLayout frameLayout) {
        super(frameLayout);
    }

    static b b(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(q0.m());
        frameLayout.setSaveEnabled(false);
        return new b(frameLayout);
    }

    FrameLayout c() {
        return (FrameLayout) this.itemView;
    }
}
