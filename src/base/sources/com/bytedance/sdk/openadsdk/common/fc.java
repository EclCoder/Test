package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class fc extends View {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private View f13292hn;
    private final hnj hnj;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
        View hnj(Context context);
    }

    public fc(Context context, hnj hnjVar) {
        super(context);
        this.hnj = hnjVar;
        hnj();
    }

    private View hn() {
        hnj hnjVar;
        if (this.f13292hn == null && (hnjVar = this.hnj) != null) {
            this.f13292hn = hnjVar.hnj(getContext());
            hnj(this.f13292hn, (ViewGroup) getParent());
        }
        return this.f13292hn;
    }

    private void hnj() {
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        View view = this.f13292hn;
        if (view != null) {
            view.setVisibility(i10);
            return;
        }
        super.setVisibility(i10);
        if (i10 == 0 || i10 == 4) {
            hn();
        }
    }

    private void hnj(View view, ViewGroup viewGroup) {
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }
}
