package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class VisibilityAwareImageButton extends ImageButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f20300a;

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f20300a = getVisibility();
    }

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (z10) {
            this.f20300a = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.f20300a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
