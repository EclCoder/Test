package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.coremedia.iso.boxes.FreeSpaceBox;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mc.i;
import sb.g;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class RadialViewGroup extends ConstraintLayout {
    private int A;
    private i B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Runnable f21528z;

    public RadialViewGroup(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(sb.i.f51822u, this);
        setBackground(E());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.f52122p9, i10, 0);
        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(m.f52137q9, 0);
        this.f21528z = new Runnable() { // from class: com.google.android.material.timepicker.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f21535a.J();
            }
        };
        typedArrayObtainStyledAttributes.recycle();
    }

    private void D(List list, androidx.constraintlayout.widget.c cVar, int i10) {
        Iterator it = list.iterator();
        float size = 0.0f;
        while (it.hasNext()) {
            cVar.r(((View) it.next()).getId(), g.f51751c, i10, size);
            size += 360.0f / list.size();
        }
    }

    private Drawable E() {
        i iVar = new i();
        this.B = iVar;
        iVar.i0(new mc.m(0.5f));
        this.B.l0(ColorStateList.valueOf(-1));
        return this.B;
    }

    private static boolean I(View view) {
        return FreeSpaceBox.TYPE.equals(view.getTag());
    }

    private void K() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f21528z);
            handler.post(this.f21528z);
        }
    }

    int F(int i10) {
        return i10 == 2 ? Math.round(this.A * 0.66f) : this.A;
    }

    public int G() {
        return this.A;
    }

    public void H(int i10) {
        this.A = i10;
        J();
    }

    protected void J() {
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.o(this);
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != g.f51751c && !I(childAt)) {
                int i11 = (Integer) childAt.getTag(g.f51771m);
                if (i11 == null) {
                    i11 = 1;
                }
                if (!map.containsKey(i11)) {
                    map.put(i11, new ArrayList());
                }
                ((List) map.get(i11)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            D((List) entry.getValue(), cVar, F(((Integer) entry.getKey()).intValue()));
        }
        cVar.i(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        K();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        J();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        K();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.B.l0(ColorStateList.valueOf(i10));
    }
}
