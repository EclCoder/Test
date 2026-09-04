package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class k extends i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f7411b = 3.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7412c = 80;

    /* JADX WARN: Code duplicated, block: B:6:0x0010  */
    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    private int h(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = this.f7412c;
        if (i18 == 8388611) {
            if (view.getLayoutDirection() == 1) {
                i18 = 5;
            } else {
                i18 = 3;
            }
        } else if (i18 == 8388613) {
            if (view.getLayoutDirection() == 1) {
                i18 = 3;
            } else {
                i18 = 5;
            }
        }
        if (i18 == 3) {
            return (i16 - i10) + Math.abs(i13 - i11);
        }
        if (i18 == 5) {
            return (i10 - i14) + Math.abs(i13 - i11);
        }
        if (i18 == 48) {
            return (i17 - i11) + Math.abs(i12 - i10);
        }
        if (i18 != 80) {
            return 0;
        }
        return (i11 - i15) + Math.abs(i12 - i10);
    }

    private int i(ViewGroup viewGroup) {
        int i10 = this.f7412c;
        return (i10 == 3 || i10 == 5 || i10 == 8388611 || i10 == 8388613) ? viewGroup.getWidth() : viewGroup.getHeight();
    }

    @Override // androidx.transition.u
    public long c(ViewGroup viewGroup, m mVar, x xVar, x xVar2) {
        int i10;
        int i11;
        int iCenterY;
        int i12;
        x xVar3 = xVar;
        if (xVar3 == null && xVar2 == null) {
            return 0L;
        }
        Rect rectV = mVar.v();
        if (xVar2 == null || e(xVar3) == 0) {
            i10 = -1;
        } else {
            xVar3 = xVar2;
            i10 = 1;
        }
        int iF = f(xVar3);
        int iG = g(xVar3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int iRound = iArr[0] + Math.round(viewGroup.getTranslationX());
        int iRound2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = viewGroup.getWidth() + iRound;
        int height = viewGroup.getHeight() + iRound2;
        if (rectV != null) {
            int iCenterX = rectV.centerX();
            i12 = iRound2;
            iCenterY = rectV.centerY();
            i11 = iCenterX;
        } else {
            i11 = (iRound + width) / 2;
            iCenterY = (iRound2 + height) / 2;
            i12 = iRound2;
        }
        float fH = h(viewGroup, iF, iG, i11, iCenterY, iRound, i12, width, height) / i(viewGroup);
        long jU = mVar.u();
        if (jU < 0) {
            jU = 300;
        }
        return Math.round(((jU * ((long) i10)) / this.f7411b) * fH);
    }

    public void j(int i10) {
        this.f7412c = i10;
    }
}
