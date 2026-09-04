package com.mbridge.msdk.config.dynamic.baseview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class ComponentButton extends Button implements com.mbridge.msdk.config.dynamic.baseview.inter.a, com.mbridge.msdk.config.dynamic.baseview.inter.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f29220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f29221b;
    public XMLView xmlView;

    public ComponentButton(Context context, AttributeSet attributeSet) {
        super(context);
    }

    private Map<String, Object> getDataMap() {
        HashMap map = new HashMap();
        map.put("selected", this.f29221b ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL);
        map.put("text", getText().toString());
        return map;
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.b
    public Map<String, Object> getOutData() {
        Object tag;
        if (TextUtils.isEmpty(this.f29220a) || (tag = getTag()) == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put(String.valueOf(tag), getDataMap());
        this.f29221b = false;
        return map;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            this.xmlView = com.mbridge.msdk.config.dynamic.utils.d.a(this);
        } catch (Exception e10) {
            q0.b("MBButton", "onAttachedToWindow异常: " + e10.getMessage());
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setOutDataScope(String str) {
        this.f29220a = str;
    }

    public void setViewClickListener() {
        setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.config.dynamic.baseview.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f29227a.a(view);
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
            if (!TextUtils.isEmpty(strValueOf) && strValueOf.equals("true")) {
                setViewClickListener();
            }
            if (map.get("saveContent") instanceof String) {
                setOutDataScope("saveContent");
            }
        } catch (Exception e10) {
            q0.b("MBButton", "setXmlData异常: " + e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void updateBindData(String str, Object obj) {
        try {
            if (obj instanceof String) {
                setText(String.valueOf(obj));
            }
        } catch (Exception e10) {
            q0.b("MBButton", "updateBindData异常: " + e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        XMLView xMLView = this.xmlView;
        if (xMLView != null) {
            xMLView.updateTouchView(view);
        }
        this.f29221b = true;
        Map<String, Object> dataMap = getDataMap();
        dataMap.put("property", getDataMap());
        com.mbridge.msdk.config.dynamic.utils.f.a(this.xmlView, view.getTag(), dataMap);
    }
}
