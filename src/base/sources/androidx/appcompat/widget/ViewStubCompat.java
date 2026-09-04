package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference f1502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private LayoutInflater f1503d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f1500a == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f1503d;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f1500a, viewGroup, false);
        int i10 = this.f1501b;
        if (i10 != -1) {
            viewInflate.setId(i10);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f1502c = new WeakReference(viewInflate);
        return viewInflate;
    }

    public int getInflatedId() {
        return this.f1501b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1503d;
    }

    public int getLayoutResource() {
        return this.f1500a;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i10) {
        this.f1501b = i10;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1503d = layoutInflater;
    }

    public void setLayoutResource(int i10) {
        this.f1500a = i10;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        WeakReference weakReference = this.f1502c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i10);
            return;
        }
        super.setVisibility(i10);
        if (i10 == 0 || i10 == 4) {
            a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1500a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.j.f40024e4, i10, 0);
        this.f1501b = typedArrayObtainStyledAttributes.getResourceId(h.j.f40042h4, -1);
        this.f1500a = typedArrayObtainStyledAttributes.getResourceId(h.j.f40036g4, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(h.j.f40030f4, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public void setOnInflateListener(a aVar) {
    }
}
