package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.config.dynamic.baseview.ComponentImageView;
import com.mbridge.msdk.config.dynamic.utils.f;
import com.mbridge.msdk.foundation.tools.i0;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class SoundImageView extends ComponentImageView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29319c;

    public SoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29319c = true;
        setSoundStatus(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        boolean z10 = this.f29319c;
        setSoundStatus(!z10);
        HashMap map = new HashMap();
        map.put("soundStatus", !z10 ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "1");
        XMLView xMLView = this.xmlView;
        if (xMLView != null) {
            xMLView.updateTouchView(view);
        }
        f.a(this.xmlView, view.getTag(), map);
    }

    public boolean getStatus() {
        return this.f29319c;
    }

    public void setSoundStatus(boolean z10) {
        this.f29319c = z10;
        if (z10) {
            setImageResource(i0.a(getContext(), "mbridge_reward_sound_open", "drawable"));
        } else {
            setImageResource(i0.a(getContext(), "mbridge_reward_sound_close", "drawable"));
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentImageView
    public void setViewClickListener() {
        setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.config.dynamic.baseview.cusview.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f29328a.a(view);
            }
        });
    }
}
