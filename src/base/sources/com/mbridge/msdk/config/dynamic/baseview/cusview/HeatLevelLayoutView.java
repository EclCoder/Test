package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class HeatLevelLayoutView extends ComponentLinearLayout {
    public HeatLevelLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setHeatCount(int i10) {
        try {
            removeAllViews();
            double dA = com.mbridge.msdk.dycreator.utils.c.a(i10, 10000.0d, 2);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, com.mbridge.msdk.dycreator.utils.c.a(getContext(), 30.0f));
            layoutParams.setMargins(15, 0, 0, 0);
            TextView textView = new TextView(getContext());
            textView.setTypeface(Typeface.defaultFromStyle(1));
            textView.setGravity(17);
            textView.setTextColor(Color.parseColor("#FF000000"));
            textView.setTextSize(10.0f);
            Drawable drawable = getResources().getDrawable(i0.a(getContext(), "mbridge_reward_user", "drawable"));
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            }
            textView.setCompoundDrawables(null, null, drawable, null);
            textView.setText(dA + getResources().getString(getResources().getIdentifier("mbridge_reward_heat_count_unit", "string", com.mbridge.msdk.foundation.controller.c.n().i())));
            addView(textView, layoutParams);
        } catch (Exception e10) {
            q0.b("HeatLevelLayoutView", e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        super.setXmlData(map);
        String strValueOf = String.valueOf(map.get(DataSchemeDataSource.SCHEME_DATA));
        try {
            if (strValueOf.equals("null") || TextUtils.isEmpty(strValueOf)) {
                return;
            }
            setHeatCount(Integer.parseInt(strValueOf));
        } catch (Throwable th2) {
            q0.b("HeatLevelLayoutView", th2.getMessage(), th2);
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void updateBindData(String str, Object obj) {
        if (obj == null) {
            return;
        }
        try {
            String strValueOf = String.valueOf(obj);
            if (obj.equals("null")) {
                return;
            }
            setHeatCount(Integer.parseInt(strValueOf));
        } catch (Throwable th2) {
            q0.b("HeatLevelLayoutView", th2.getMessage(), th2);
        }
    }
}
