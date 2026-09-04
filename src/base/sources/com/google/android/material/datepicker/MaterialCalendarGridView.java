package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.internal.c0;
import java.util.Calendar;
import n0.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Calendar f19871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f19872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i.o f19873c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends n0.a {
        a() {
        }

        @Override // n0.a
        public void g(View view, o0.p pVar) {
            super.g(view, pVar);
            pVar.w0(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(o oVar) {
        Drawable selector = getSelector();
        if (selector instanceof FocusRingDrawable) {
            return;
        }
        Drawable drawableP = FocusRingDrawable.P(getContext(), selector);
        if (drawableP instanceof FocusRingDrawable) {
            FocusRingDrawable focusRingDrawable = (FocusRingDrawable) drawableP;
            c cVar = oVar.f19998c;
            if (cVar != null) {
                focusRingDrawable.E(cVar.f19895a.b());
            }
            setDrawSelectorOnTop(true);
            setSelector(focusRingDrawable);
        }
    }

    private void c(int i10, Rect rect) {
        int iC;
        if (i10 == 33 || i10 == 1) {
            iC = getAdapter().c();
        } else {
            iC = (i10 == 130 || i10 == 2) ? getAdapter().b() : -1;
        }
        if (iC != -1) {
            setSelection(iC);
        } else {
            super.onFocusChanged(true, i10, rect);
        }
    }

    private boolean e(int i10, boolean z10) {
        i.o oVar;
        i.o oVar2;
        int iE = z10 ? getAdapter().e(i10) : getAdapter().f(i10);
        if (iE != -1) {
            setSelection(iE);
            return true;
        }
        if (!z10 && (oVar2 = this.f19873c) != null) {
            return oVar2.b();
        }
        if (!z10 || (oVar = this.f19873c) == null) {
            return true;
        }
        return oVar.a();
    }

    private boolean f(int i10, KeyEvent keyEvent) {
        int iF = keyEvent.isShiftPressed() ? getAdapter().f(i10) : getAdapter().e(i10);
        if (iF == -1) {
            return false;
        }
        setSelection(iF);
        return true;
    }

    private boolean i(int i10) {
        int iD = getAdapter().d(i10);
        if (iD == -1) {
            return false;
        }
        setSelection(iD);
        return true;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public o getAdapter() {
        return (o) super.getAdapter();
    }

    boolean g(int i10, int i11) {
        o adapter = getAdapter();
        if (i(i11)) {
            return true;
        }
        if (19 == i10) {
            int numColumns = getNumColumns();
            while (true) {
                i11 -= numColumns;
                if (i11 < adapter.g()) {
                    return false;
                }
                if (i(i11)) {
                    return true;
                }
                numColumns = getNumColumns();
            }
        } else {
            if (i10 != 20) {
                return false;
            }
            int numColumns2 = getNumColumns();
            while (true) {
                i11 += numColumns2;
                if (i11 > adapter.q()) {
                    return false;
                }
                if (i(i11)) {
                    return true;
                }
                numColumns2 = getNumColumns();
            }
        }
    }

    void h(i.o oVar) {
        this.f19873c = oVar;
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
        post(new Runnable() { // from class: com.google.android.material.datepicker.j
            @Override // java.lang.Runnable
            public final void run() {
                MaterialCalendarGridView materialCalendarGridView = this.f19949a;
                materialCalendarGridView.b(materialCalendarGridView.getAdapter());
            }
        });
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        o adapter = getAdapter();
        adapter.getClass();
        int iMax = Math.max(adapter.g(), getFirstVisiblePosition());
        int iMin = Math.min(adapter.q(), getLastVisiblePosition());
        adapter.getItem(iMax);
        adapter.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (z10) {
            c(i10, rect);
        } else {
            super.onFocusChanged(false, i10, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1) {
            return super.onKeyDown(i10, keyEvent);
        }
        boolean zM = c0.m(this);
        if (i10 == 21) {
            return e(selectedItemPosition, zM);
        }
        if (i10 == 22) {
            return e(selectedItemPosition, !zM);
        }
        if (i10 == 61) {
            return f(selectedItemPosition, keyEvent);
        }
        if (!super.onKeyDown(i10, keyEvent)) {
            return false;
        }
        o adapter = getAdapter();
        int selectedItemPosition2 = getSelectedItemPosition();
        if (selectedItemPosition2 == -1 || adapter.l(selectedItemPosition2)) {
            return true;
        }
        return g(i10, selectedItemPosition2);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i10, int i11) {
        if (!this.f19872b) {
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i10) {
        super.setSelection(Math.max(i10, getAdapter().b()));
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19871a = v.i();
        if (l.D(getContext())) {
            setNextFocusLeftId(sb.g.f51747a);
            setNextFocusRightId(sb.g.f51753d);
        }
        this.f19872b = l.F(getContext());
        q0.m0(this, new a());
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof o)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), o.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
