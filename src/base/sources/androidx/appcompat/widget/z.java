package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.bytedance.sdk.openadsdk.LXL.vHmGJpUTWNVV;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import n0.a1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class z extends ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f1761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f1767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1768h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f1769i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f1770j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private a1 f1771k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private androidx.core.widget.f f1772l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    f f1773m;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {
        static void a(View view, float f10, float f11) {
            view.drawableHotspotChanged(f10, f11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static Method f1774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Method f1775b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static Method f1776c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static boolean f1777d;

        static boolean a() {
            return f1777d;
        }

        static void b(z zVar, int i10, View view) {
            try {
                f1774a.invoke(zVar, Integer.valueOf(i10), view, Boolean.FALSE, -1, -1);
                f1775b.invoke(zVar, Integer.valueOf(i10));
                f1776c.invoke(zVar, Integer.valueOf(i10));
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            } catch (InvocationTargetException e11) {
                e11.printStackTrace();
            }
        }

        static {
            try {
                String str = vHmGJpUTWNVV.hdvvEmugo;
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod(str, cls, View.class, cls2, cls3, cls3);
                f1774a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f1775b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f1776c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f1777d = true;
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class c {
        static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        static void b(AbsListView absListView, boolean z10) {
            absListView.setSelectedChildViewEnabled(z10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class d extends j.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f1778b;

        d(Drawable drawable) {
            super(drawable);
            this.f1778b = true;
        }

        void b(boolean z10) {
            this.f1778b = z10;
        }

        @Override // j.a, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f1778b) {
                super.draw(canvas);
            }
        }

        @Override // j.a, android.graphics.drawable.Drawable
        public void setHotspot(float f10, float f11) {
            if (this.f1778b) {
                super.setHotspot(f10, f11);
            }
        }

        @Override // j.a, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f1778b) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        @Override // j.a, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f1778b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // j.a, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z10, boolean z11) {
            if (this.f1778b) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Field f1779a;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                e10.printStackTrace();
            }
            f1779a = declaredField;
        }

        static boolean a(AbsListView absListView) {
            Field field = f1779a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
                return false;
            }
        }

        static void b(AbsListView absListView, boolean z10) {
            Field field = f1779a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z10));
                } catch (IllegalAccessException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class f implements Runnable {
        f() {
        }

        public void a() {
            z zVar = z.this;
            zVar.f1773m = null;
            zVar.removeCallbacks(this);
        }

        public void b() {
            z.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            z zVar = z.this;
            zVar.f1773m = null;
            zVar.drawableStateChanged();
        }
    }

    z(Context context, boolean z10) {
        super(context, null, h.a.A);
        this.f1761a = new Rect();
        this.f1762b = 0;
        this.f1763c = 0;
        this.f1764d = 0;
        this.f1765e = 0;
        this.f1769i = z10;
        setCacheColorHint(0);
    }

    private void a() {
        this.f1770j = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1766f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        a1 a1Var = this.f1771k;
        if (a1Var != null) {
            a1Var.c();
            this.f1771k = null;
        }
    }

    private void b(View view, int i10) {
        performItemClick(view, i10, getItemIdAtPosition(i10));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (this.f1761a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f1761a);
        selector.draw(canvas);
    }

    private void f(int i10, View view) {
        Rect rect = this.f1761a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1762b;
        rect.top -= this.f1763c;
        rect.right += this.f1764d;
        rect.bottom += this.f1765e;
        boolean zK = k();
        if (view.isEnabled() != zK) {
            l(!zK);
            if (i10 != -1) {
                refreshDrawableState();
            }
        }
    }

    private void g(int i10, View view) {
        Drawable selector = getSelector();
        boolean z10 = (selector == null || i10 == -1) ? false : true;
        if (z10) {
            selector.setVisible(false, false);
        }
        f(i10, view);
        if (z10) {
            Rect rect = this.f1761a;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            f0.a.k(selector, fExactCenterX, fExactCenterY);
        }
    }

    private void h(int i10, View view, float f10, float f11) {
        g(i10, view);
        Drawable selector = getSelector();
        if (selector == null || i10 == -1) {
            return;
        }
        f0.a.k(selector, f10, f11);
    }

    private void i(View view, int i10, float f10, float f11) {
        View childAt;
        this.f1770j = true;
        a.a(this, f10, f11);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i11 = this.f1766f;
        if (i11 != -1 && (childAt = getChildAt(i11 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f1766f = i10;
        a.a(view, f10 - view.getLeft(), f11 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i10, view, f10, f11);
        j(false);
        refreshDrawableState();
    }

    private void j(boolean z10) {
        d dVar = this.f1767g;
        if (dVar != null) {
            dVar.b(z10);
        }
    }

    private boolean k() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this) : e.a(this);
    }

    private void l(boolean z10) {
        if (Build.VERSION.SDK_INT >= 33) {
            c.b(this, z10);
        } else {
            e.b(this, z10);
        }
    }

    private boolean m() {
        return this.f1770j;
    }

    private void n() {
        Drawable selector = getSelector();
        if (selector != null && m() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public int d(int i10, int i11, int i12, int i13, int i14) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        View view = null;
        while (i15 < count) {
            int itemViewType = adapter.getItemViewType(i15);
            if (itemViewType != i16) {
                view = null;
                i16 = itemViewType;
            }
            view = adapter.getView(i15, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i18 = layoutParams.height;
            view.measure(i10, i18 > 0 ? View.MeasureSpec.makeMeasureSpec(i18, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i15 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i13) {
                return (i14 < 0 || i15 <= i14 || i17 <= 0 || measuredHeight == i13) ? i13 : i17;
            }
            if (i14 >= 0 && i15 >= i14) {
                i17 = measuredHeight;
            }
            i15++;
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f1773m != null) {
            return;
        }
        super.drawableStateChanged();
        j(true);
        n();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0065  */
    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    public boolean e(MotionEvent motionEvent, int i10) {
        boolean z10;
        boolean z11;
        androidx.core.widget.f fVar;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            z10 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z10 = true;
                    z11 = false;
                } else {
                    z11 = false;
                    z10 = false;
                }
                if (z10 || z11) {
                    a();
                }
                if (z10) {
                    fVar = this.f1772l;
                    if (fVar != null) {
                        fVar.m(false);
                    }
                    return z10;
                }
                if (this.f1772l == null) {
                    this.f1772l = new androidx.core.widget.f(this);
                }
                this.f1772l.m(true);
                this.f1772l.onTouch(this, motionEvent);
                return z10;
            }
            z10 = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i10);
        if (iFindPointerIndex < 0) {
            z11 = false;
            z10 = false;
        } else {
            int x10 = (int) motionEvent.getX(iFindPointerIndex);
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x10, y10);
            if (iPointToPosition == -1) {
                z11 = true;
            } else {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                i(childAt, iPointToPosition, x10, y10);
                if (actionMasked == 1) {
                    b(childAt, iPointToPosition);
                }
                z10 = true;
                z11 = false;
            }
        }
        if (z10) {
            a();
        } else {
            a();
        }
        if (z10) {
            fVar = this.f1772l;
            if (fVar != null) {
                fVar.m(false);
            }
            return z10;
        }
        if (this.f1772l == null) {
            this.f1772l = new androidx.core.widget.f(this);
        }
        this.f1772l.m(true);
        this.f1772l.onTouch(this, motionEvent);
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f1769i || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f1769i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f1769i || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f1769i && this.f1768h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f1773m = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1773m == null) {
            f fVar = new f();
            this.f1773m = fVar;
            fVar.b();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i10 < 30 || !b.a()) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    b.b(this, iPointToPosition, childAt);
                }
            }
            n();
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1766f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f1773m;
        if (fVar != null) {
            fVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    void setListSelectionHidden(boolean z10) {
        this.f1768h = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f1767g = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1762b = rect.left;
        this.f1763c = rect.top;
        this.f1764d = rect.right;
        this.f1765e = rect.bottom;
    }
}
