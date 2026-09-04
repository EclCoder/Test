package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.widget.f;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class MotionEffect extends MotionHelper {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f2041n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f2042o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f2043p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f2044q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f2045r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f2046s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f2047t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f2048u;

    public MotionEffect(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2041n = 0.1f;
        this.f2042o = 49;
        this.f2043p = 50;
        this.f2044q = 0;
        this.f2045r = 0;
        this.f2046s = true;
        this.f2047t = -1;
        this.f2048u = -1;
        F(context, attributeSet);
    }

    private void F(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f2853e9);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == f.f2905i9) {
                    int i11 = typedArrayObtainStyledAttributes.getInt(index, this.f2042o);
                    this.f2042o = i11;
                    this.f2042o = Math.max(Math.min(i11, 99), 0);
                } else if (index == f.f2879g9) {
                    int i12 = typedArrayObtainStyledAttributes.getInt(index, this.f2043p);
                    this.f2043p = i12;
                    this.f2043p = Math.max(Math.min(i12, 99), 0);
                } else if (index == f.f2931k9) {
                    this.f2044q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2044q);
                } else if (index == f.f2944l9) {
                    this.f2045r = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f2045r);
                } else if (index == f.f2866f9) {
                    this.f2041n = typedArrayObtainStyledAttributes.getFloat(index, this.f2041n);
                } else if (index == f.f2892h9) {
                    this.f2048u = typedArrayObtainStyledAttributes.getInt(index, this.f2048u);
                } else if (index == f.f2918j9) {
                    this.f2046s = typedArrayObtainStyledAttributes.getBoolean(index, this.f2046s);
                } else if (index == f.f2957m9) {
                    this.f2047t = typedArrayObtainStyledAttributes.getResourceId(index, this.f2047t);
                }
            }
            int i13 = this.f2042o;
            int i14 = this.f2043p;
            if (i13 == i14) {
                if (i13 > 0) {
                    this.f2042o = i13 - 1;
                } else {
                    this.f2043p = i14 + 1;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x015c  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:94:0x01da  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e3  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0180, code lost:
    
        if (r14 == 0.0f) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0196, code lost:
    
        if (r14 == 0.0f) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a7, code lost:
    
        if (r15 == 0.0f) goto L59;
     */
    @Override // androidx.constraintlayout.motion.widget.MotionHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D(androidx.constraintlayout.motion.widget.MotionLayout r23, java.util.HashMap r24) {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.MotionEffect.D(androidx.constraintlayout.motion.widget.MotionLayout, java.util.HashMap):void");
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper
    public boolean x() {
        return true;
    }
}
