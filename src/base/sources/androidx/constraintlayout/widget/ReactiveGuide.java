package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ReactiveGuide extends View implements g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f2641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f2643d;

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2640a = -1;
        this.f2641b = false;
        this.f2642c = 0;
        this.f2643d = true;
        super.setVisibility(8);
        a(attributeSet);
    }

    private void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.f2860f3);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == f.f2912j3) {
                    this.f2640a = typedArrayObtainStyledAttributes.getResourceId(index, this.f2640a);
                } else if (index == f.f2873g3) {
                    this.f2641b = typedArrayObtainStyledAttributes.getBoolean(index, this.f2641b);
                } else if (index == f.f2899i3) {
                    this.f2642c = typedArrayObtainStyledAttributes.getResourceId(index, this.f2642c);
                } else if (index == f.f2886h3) {
                    this.f2643d = typedArrayObtainStyledAttributes.getBoolean(index, this.f2643d);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f2640a != -1) {
            ConstraintLayout.getSharedValues().a(this.f2640a, this);
        }
    }

    public int getApplyToConstraintSetId() {
        return this.f2642c;
    }

    public int getAttributeId() {
        return this.f2640a;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setAnimateChange(boolean z10) {
        this.f2641b = z10;
    }

    public void setApplyToConstraintSetId(int i10) {
        this.f2642c = i10;
    }

    public void setAttributeId(int i10) {
        g sharedValues = ConstraintLayout.getSharedValues();
        int i11 = this.f2640a;
        if (i11 != -1) {
            sharedValues.b(i11, this);
        }
        this.f2640a = i10;
        if (i10 != -1) {
            sharedValues.a(i10, this);
        }
    }

    public void setGuidelineBegin(int i10) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f2574a = i10;
        setLayoutParams(bVar);
    }

    public void setGuidelineEnd(int i10) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f2576b = i10;
        setLayoutParams(bVar);
    }

    public void setGuidelinePercent(float f10) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f2578c = f10;
        setLayoutParams(bVar);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
    }
}
