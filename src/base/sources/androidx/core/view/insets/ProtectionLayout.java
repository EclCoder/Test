package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ProtectionLayout extends FrameLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f3346c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f3347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f3348b;

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(Context context, int i10, r0.a aVar) {
        throw null;
    }

    private void b() {
        if (this.f3347a.isEmpty()) {
            d();
            return;
        }
        d orInstallSystemBarStateMonitor = getOrInstallSystemBarStateMonitor();
        d();
        this.f3348b = new a(orInstallSystemBarStateMonitor, this.f3347a);
        int childCount = getChildCount();
        int i10 = this.f3348b.i();
        for (int i11 = 0; i11 < i10; i11++) {
            this.f3348b.h(i11);
            a(getContext(), i11 + childCount, null);
        }
    }

    private void c() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        int i10 = b0.c.R;
        Object tag = viewGroup.getTag(i10);
        if (tag instanceof d) {
            d dVar = (d) tag;
            if (dVar.l()) {
                return;
            }
            dVar.i();
            viewGroup.setTag(i10, null);
        }
    }

    private void d() {
        if (this.f3348b != null) {
            removeViews(getChildCount() - this.f3348b.i(), this.f3348b.i());
            if (this.f3348b.i() > 0) {
                this.f3348b.h(0);
                throw null;
            }
            this.f3348b.g();
            this.f3348b = null;
        }
    }

    private d getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        int i10 = b0.c.R;
        Object tag = viewGroup.getTag(i10);
        if (tag instanceof d) {
            return (d) tag;
        }
        d dVar = new d(viewGroup);
        viewGroup.setTag(i10, dVar);
        return dVar;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != f3346c) {
            a aVar = this.f3348b;
            int childCount = getChildCount() - (aVar != null ? aVar.i() : 0);
            if (i10 > childCount || i10 < 0) {
                i10 = childCount;
            }
        }
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        c();
    }

    public void setProtections(List<r0.a> list) {
        this.f3347a.clear();
        this.f3347a.addAll(list);
        if (isAttachedToWindow()) {
            b();
            requestApplyInsets();
        }
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f3347a = new ArrayList();
    }
}
