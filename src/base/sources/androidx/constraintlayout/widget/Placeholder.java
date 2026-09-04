package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.vungle.ads.internal.protos.Sdk$SDKError;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class Placeholder extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f2638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2639c;

    public Placeholder(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2637a = -1;
        this.f2638b = null;
        this.f2639c = 4;
        a(attributeSet);
    }

    private void a(AttributeSet attributeSet) {
        super.setVisibility(this.f2639c);
        this.f2637a = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, f.f2925k3);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == f.f2938l3) {
                    this.f2637a = typedArrayObtainStyledAttributes.getResourceId(index, this.f2637a);
                } else if (index == f.f2951m3) {
                    this.f2639c = typedArrayObtainStyledAttributes.getInt(index, this.f2639c);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f2638b == null) {
            return;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f2638b.getLayoutParams();
        bVar2.f2617v0.o1(0);
        x.e.b bVarC = bVar.f2617v0.C();
        x.e.b bVar3 = x.e.b.FIXED;
        if (bVarC != bVar3) {
            bVar.f2617v0.p1(bVar2.f2617v0.Y());
        }
        if (bVar.f2617v0.V() != bVar3) {
            bVar.f2617v0.Q0(bVar2.f2617v0.z());
        }
        bVar2.f2617v0.o1(8);
    }

    public void c(ConstraintLayout constraintLayout) {
        if (this.f2637a == -1 && !isInEditMode()) {
            setVisibility(this.f2639c);
        }
        View viewFindViewById = constraintLayout.findViewById(this.f2637a);
        this.f2638b = viewFindViewById;
        if (viewFindViewById != null) {
            ((ConstraintLayout.b) viewFindViewById.getLayoutParams()).f2593j0 = true;
            this.f2638b.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f2638b;
    }

    public int getEmptyVisibility() {
        return this.f2639c;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(Sdk$SDKError.b.STALE_CACHED_RESPONSE_VALUE, Sdk$SDKError.b.STALE_CACHED_RESPONSE_VALUE, Sdk$SDKError.b.STALE_CACHED_RESPONSE_VALUE);
            Paint paint = new Paint();
            paint.setARGB(255, Sdk$SDKError.b.AD_NOT_LOADED_VALUE, Sdk$SDKError.b.AD_NOT_LOADED_VALUE, Sdk$SDKError.b.AD_NOT_LOADED_VALUE);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((iHeight / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i10) {
        View viewFindViewById;
        if (this.f2637a == i10) {
            return;
        }
        View view = this.f2638b;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.f2638b.getLayoutParams()).f2593j0 = false;
            this.f2638b = null;
        }
        this.f2637a = i10;
        if (i10 == -1 || (viewFindViewById = ((View) getParent()).findViewById(i10)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i10) {
        this.f2639c = i10;
    }
}
