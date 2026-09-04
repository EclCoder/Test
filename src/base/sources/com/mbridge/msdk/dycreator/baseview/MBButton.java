package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.utils.a;
import com.mbridge.msdk.dycreator.utils.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.l;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class MBButton extends Button implements InterBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, String> f29580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Boolean> f29581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f29582c;

    public MBButton(Context context) {
        super(context);
        this.f29582c = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f29580a;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f29580a.get("mbridgeAction");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f29580a;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f29580a.get("mbridgeData");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f29580a;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f29580a.get("mbridgeEffect");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f29580a;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f29580a.get("mbridgeReport");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f29580a;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f29580a.get("mbridgeStrategy");
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f29581b;
        if (map != null && map.containsKey("mbridgeAttached") && this.f29581b.get("mbridgeAttached").booleanValue()) {
            new l.b("mbridgeAttached").a().b(this.f29582c);
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f29581b;
        if (map != null && map.containsKey("mbridgeDetached") && this.f29581b.get("mbridgeDetached").booleanValue()) {
            new l.b("mbridgeDetached").a().b(this.f29582c);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f29581b = c.a(str);
        if (campaignEx != null) {
            this.f29582c = campaignEx.getCampaignUnitId();
        }
    }

    public MBButton(Context context, AttributeSet attributeSet) {
        super(context);
        this.f29582c = "";
        this.f29580a = c.a(context, attributeSet);
        a.a(this, attributeSet);
        c.a(this.f29580a, this);
    }

    public MBButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f29582c = "";
    }
}
