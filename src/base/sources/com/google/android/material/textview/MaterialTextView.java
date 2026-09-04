package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import jc.b;
import pc.a;
import sb.c;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private void s(Resources.Theme theme, int i10) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i10, m.f51985g7);
        int iW = w(getContext(), typedArrayObtainStyledAttributes, m.f52030j7, m.f52060l7);
        typedArrayObtainStyledAttributes.recycle();
        if (iW >= 0) {
            setLineHeight(iW);
        }
    }

    private static boolean t(Context context) {
        return b.c(context, c.f51639v0, true);
    }

    private static int u(Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, m.f52075m7, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(m.f52090n7, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private void v(AttributeSet attributeSet, int i10, int i11) {
        int iU;
        Context context = getContext();
        if (t(context)) {
            Resources.Theme theme = context.getTheme();
            if (x(context, theme, attributeSet, i10, i11) || (iU = u(theme, attributeSet, i10, i11)) == -1) {
                return;
            }
            s(theme, iU);
        }
    }

    private static int w(Context context, TypedArray typedArray, int... iArr) {
        int iD = -1;
        for (int i10 = 0; i10 < iArr.length && iD < 0; i10++) {
            iD = jc.c.d(context, typedArray, iArr[i10], -1);
        }
        return iD;
    }

    private static boolean x(Context context, Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, m.f52075m7, i10, i11);
        int iW = w(context, typedArrayObtainStyledAttributes, m.f52105o7, m.f52120p7);
        typedArrayObtainStyledAttributes.recycle();
        return iW != -1;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (t(context)) {
            s(context.getTheme(), i10);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i10) {
        super(a.d(context, attributeSet, i10, 0), attributeSet, i10);
        v(attributeSet, i10, 0);
    }
}
