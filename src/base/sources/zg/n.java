package zg;

import android.content.Context;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class n extends o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f58874g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a(int i10, int i11, int i12, int i13);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class b extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Rect f58875a;

        public b(Context context) {
            super(context);
            this.f58875a = new Rect();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            getViewTreeObserver().addOnGlobalLayoutListener(this);
            super.onAttachedToWindow();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            getViewTreeObserver().removeOnGlobalLayoutListener(this);
            super.onDetachedFromWindow();
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            getWindowVisibleDisplayFrame(this.f58875a);
            a aVar = n.this.f58874g;
            Rect rect = this.f58875a;
            aVar.a(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    public n(Context context) {
        super(context);
        this.f58879c = new b(context);
    }

    @Override // zg.o
    protected int j() {
        return 1;
    }

    @Override // zg.o
    protected int l() {
        return 1;
    }

    public void q(a aVar) {
        this.f58874g = aVar;
    }
}
