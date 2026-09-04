package bc;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Dialog f8817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f8820d;

    public a(Dialog dialog, Rect rect) {
        this.f8817a = dialog;
        this.f8818b = rect.left;
        this.f8819c = rect.top;
        this.f8820d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f8818b + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        int top = this.f8819c + viewFindViewById.getTop();
        if (new RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i10 = this.f8820d;
            motionEventObtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f8817a.onTouchEvent(motionEventObtain);
    }
}
