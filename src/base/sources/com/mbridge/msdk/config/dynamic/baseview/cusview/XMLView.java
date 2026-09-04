package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class XMLView extends ComponentRelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, View> f29320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.style.inter.a f29321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f29322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected com.mbridge.msdk.config.dynamic.baseview.touch.a f29323d;

    public XMLView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29320a = new HashMap();
        this.f29322c = "";
        this.f29323d = new com.mbridge.msdk.config.dynamic.baseview.touch.a();
        a();
    }

    private void a() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f29323d.c();
                this.f29323d.d(motionEvent);
            } else if (action == 1) {
                this.f29323d.f(motionEvent);
            } else if (action == 2) {
                this.f29323d.e(motionEvent);
            } else if (action == 3) {
                this.f29323d.c(motionEvent);
            }
        } catch (Exception e10) {
            q0.b("RenderView", "处理触摸事件异常: " + e10.getMessage());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public Map<String, View> getRenderMap() {
        return this.f29320a;
    }

    public String getSelfTag() {
        return this.f29322c;
    }

    public com.mbridge.msdk.config.dynamic.baseview.touch.a getTouchEventData() {
        return this.f29323d;
    }

    public com.mbridge.msdk.config.component.style.inter.a getXmlViewActionListener() {
        return this.f29321b;
    }

    public void setRenderMap(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f29322c = SameMD5.getMD5(str);
    }

    public void setXmlViewActionListener(com.mbridge.msdk.config.component.style.inter.a aVar) {
        this.f29321b = aVar;
    }

    public void updateTouchView(View view) {
        com.mbridge.msdk.config.dynamic.baseview.touch.a aVar = this.f29323d;
        if (aVar != null) {
            aVar.c(view);
        }
    }
}
