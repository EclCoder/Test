package com.google.android.material.button;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import n0.q0;
import sb.l;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class MaterialSplitButton extends MaterialButtonGroup {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f19628v = l.B;

    public MaterialSplitButton(Context context, AttributeSet attributeSet, int i10) {
        super(pc.a.d(context, attributeSet, i10, f19628v), attributeSet, i10);
    }

    @Override // com.google.android.material.button.MaterialButtonGroup, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            throw new IllegalArgumentException("MaterialSplitButton can only hold MaterialButtons.");
        }
        if (getChildCount() > 2) {
            throw new IllegalArgumentException("MaterialSplitButton can only hold two MaterialButtons.");
        }
        final MaterialButton materialButton = (MaterialButton) view;
        super.addView(view, i10, layoutParams);
        if (indexOfChild(view) == 1) {
            materialButton.setCheckable(true);
            materialButton.setA11yClassName(Button.class.getName());
            q0.A0(materialButton, getResources().getString(materialButton.isChecked() ? sb.k.f51854z : sb.k.f51853y));
            materialButton.i(new MaterialButton.b() { // from class: com.google.android.material.button.k
                @Override // com.google.android.material.button.MaterialButton.b
                public final void a(MaterialButton materialButton2, boolean z10) {
                    q0.A0(materialButton, this.f19664a.getResources().getString(z10 ? sb.k.f51854z : sb.k.f51853y));
                }
            });
        }
    }
}
