package com.mbridge.msdk.config.dynamic.baseview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class ComponentHorizontalScrollView extends HorizontalScrollView implements com.mbridge.msdk.config.dynamic.baseview.inter.a {
    public XMLView xmlView;

    public ComponentHorizontalScrollView(Context context, AttributeSet attributeSet) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            this.xmlView = com.mbridge.msdk.config.dynamic.utils.d.a((View) this);
        } catch (Exception e10) {
            q0.b("MBHorizontalScrollView", "onAttachedToWindow异常: " + e10.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setViewClickListener() {
        setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.config.dynamic.baseview.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f29329a.a(view);
            }
        });
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            String strValueOf = String.valueOf(map.get("clickable"));
            if (TextUtils.isEmpty(strValueOf) || !strValueOf.equals("true")) {
                return;
            }
            setViewClickListener();
        } catch (Exception e10) {
            q0.b("MBHorizontalScrollView", "setXmlData异常: " + e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        XMLView xMLView = this.xmlView;
        if (xMLView != null) {
            xMLView.updateTouchView(view);
        }
        com.mbridge.msdk.config.dynamic.utils.f.a(this.xmlView, view.getTag(), null);
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void updateBindData(String str, Object obj) {
    }
}
