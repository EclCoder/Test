package com.mbridge.msdk.nativex.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class MBNativeRollView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RollingBCView f31816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f31817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private NativeListener.FilpListener f31818c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
    }

    public MBNativeRollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f31816a.dispatchTouchEvent(motionEvent);
    }

    public void setData(List<Frame> list, Context context, String str, a aVar) {
        this.f31816a.setData(list, context, str, aVar);
    }

    public void setFilpListening(NativeListener.FilpListener filpListener) {
        if (filpListener != null) {
            this.f31818c = filpListener;
            this.f31816a.setFilpListening(filpListener);
        }
    }

    public void setFrameWidth(int i10) {
        this.f31816a.setLayoutParams(new LinearLayout.LayoutParams(i10, -2));
    }

    public MBNativeRollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31817b = context;
        RollingBCView rollingBCView = new RollingBCView(context);
        this.f31816a = rollingBCView;
        addView(rollingBCView);
        this.f31816a.setLayoutParams(new LinearLayout.LayoutParams((int) (((double) v0.j(context)) * 0.9d), -2));
        setClipChildren(false);
    }

    public MBNativeRollView(Context context) {
        this(context, null);
    }
}
