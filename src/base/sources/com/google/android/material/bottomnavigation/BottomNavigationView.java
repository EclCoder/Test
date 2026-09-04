package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.o0;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.z;
import com.google.android.material.navigation.j;
import com.google.android.material.navigation.n;
import n0.k1;
import sb.l;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class BottomNavigationView extends n {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements c0.d {
        a() {
        }

        @Override // com.google.android.material.internal.c0.d
        public k1 a(View view, k1 k1Var, c0.e eVar) {
            eVar.f20370d += k1Var.k();
            boolean z10 = view.getLayoutDirection() == 1;
            int iL = k1Var.l();
            int iM = k1Var.m();
            eVar.f20367a += z10 ? iM : iL;
            int i10 = eVar.f20369c;
            if (!z10) {
                iL = iM;
            }
            eVar.f20369c = i10 + iL;
            eVar.a(view);
            return k1Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b extends n.b {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c extends n.c {
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, l.f51866j);
    }

    private void h() {
        c0.f(this, new a());
    }

    private int i(int i10) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i10) == 1073741824 || suggestedMinimumHeight <= 0) {
            return i10;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i10), suggestedMinimumHeight + getPaddingTop() + getPaddingBottom()), Integer.MIN_VALUE);
    }

    @Override // com.google.android.material.navigation.n
    protected j c(Context context) {
        return new com.google.android.material.bottomnavigation.b(context);
    }

    @Override // com.google.android.material.navigation.n
    public int getMaxItemCount() {
        return 6;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i(i11));
        if (View.MeasureSpec.getMode(i11) != 1073741824) {
            setMeasuredDimension(getMeasuredWidth(), Math.max(getMeasuredHeight(), getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom()));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        com.google.android.material.bottomnavigation.b bVar = (com.google.android.material.bottomnavigation.b) getMenuView();
        if (bVar.s() != z10) {
            bVar.setItemHorizontalTranslationEnabled(z10);
            getPresenter().h(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(b bVar) {
        setOnItemReselectedListener(bVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(c cVar) {
        setOnItemSelectedListener(cVar);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        o0 o0VarJ = z.j(getContext(), attributeSet, m.C0, i10, i11, new int[0]);
        setItemHorizontalTranslationEnabled(o0VarJ.a(m.E0, true));
        int i12 = m.D0;
        if (o0VarJ.s(i12)) {
            setMinimumHeight(o0VarJ.f(i12, 0));
        }
        o0VarJ.x();
        h();
    }
}
