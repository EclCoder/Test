package com.bytedance.sdk.openadsdk.core.bug.hn.sk;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.adsdk.ugeno.gjv;
import com.bytedance.adsdk.ugeno.hn.qor;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj extends FrameLayout {
    private gjv gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final List<qor> f13669hn;
    private final RecyclerView hnj;
    private final C0212hnj qor;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class hn extends RecyclerView.g0 {
        private final ViewGroup hnj;

        public hn(View view) {
            super(view);
            this.hnj = (ViewGroup) view;
        }

        public void hnj(qor qorVar) {
            View viewDnm = qorVar.dnm();
            ViewParent parent = viewDnm.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(viewDnm);
            }
            this.hnj.removeAllViews();
            this.hnj.addView(viewDnm, new com.bytedance.adsdk.ugeno.yoga.hn.qor.hnj(qorVar.fvt(), qorVar.orp()));
        }
    }

    public hnj(Context context) {
        super(context);
        this.f13669hn = new CopyOnWriteArrayList();
        C0212hnj c0212hnj = new C0212hnj();
        this.qor = c0212hnj;
        RecyclerView recyclerView = new RecyclerView(context);
        this.hnj = recyclerView;
        addView(recyclerView);
        recyclerView.setAdapter(c0212hnj);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        gjv gjvVar = this.gjv;
        if (gjvVar != null) {
            gjvVar.dse();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gjv gjvVar = this.gjv;
        if (gjvVar != null) {
            gjvVar.aq();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        gjv gjvVar = this.gjv;
        if (gjvVar != null) {
            gjvVar.dkl();
        }
        super.onLayout(z10, i10, i11, i12, i13);
        gjv gjvVar2 = this.gjv;
        if (gjvVar2 != null) {
            gjvVar2.hnj(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        gjv gjvVar = this.gjv;
        if (gjvVar != null) {
            int[] iArrHnj = gjvVar.hnj(i10, i11);
            super.onMeasure(iArrHnj[0], iArrHnj[1]);
        } else {
            super.onMeasure(i10, i11);
        }
        gjv gjvVar2 = this.gjv;
        if (gjvVar2 != null) {
            gjvVar2.sk();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        gjv gjvVar = this.gjv;
        if (gjvVar != null) {
            gjvVar.hn(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    public void setOrientation(int i10) {
        if (i10 == 1) {
            this.hnj.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        } else {
            this.hnj.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        }
    }

    public void hnj(qor<View> qorVar) {
        if (qorVar == null) {
            return;
        }
        this.f13669hn.add(qorVar);
        C0212hnj c0212hnj = this.qor;
        if (c0212hnj != null) {
            c0212hnj.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.bug.hn.sk.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class C0212hnj extends RecyclerView.h {
        private C0212hnj() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return hnj.this.f13669hn.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
        public hn onCreateViewHolder(ViewGroup viewGroup, int i10) {
            com.bytedance.adsdk.ugeno.yoga.hn.qor qorVar = new com.bytedance.adsdk.ugeno.yoga.hn.qor(viewGroup.getContext());
            qor qorVar2 = (qor) hnj.this.f13669hn.get(i10);
            qorVar.setLayoutParams(new ViewGroup.LayoutParams(qorVar2.fvt(), qorVar2.orp()));
            return new hn(qorVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(hn hnVar, int i10) {
            hnVar.hnj((qor) hnj.this.f13669hn.get(i10));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemViewType(int i10) {
            return i10;
        }
    }

    public void hnj(gjv gjvVar) {
        this.gjv = gjvVar;
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.bug.hn.sk.hn hnVar) {
        ViewGroup.LayoutParams layoutParams = this.hnj.getLayoutParams();
        layoutParams.width = hnVar.fvt();
        layoutParams.height = hnVar.orp();
        this.hnj.setLayoutParams(layoutParams);
    }
}
