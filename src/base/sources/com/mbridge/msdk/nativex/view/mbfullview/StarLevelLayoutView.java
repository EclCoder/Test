package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.v0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class StarLevelLayoutView extends LinearLayout {
    public StarLevelLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setRating(int i10) {
        removeAllViews();
        if (i10 == 0) {
            i10 = 5;
        }
        for (int i11 = 0; i11 < 5; i11++) {
            View imageView = new ImageView(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            if (i11 < i10) {
                imageView.setBackgroundResource(i0.a(getContext(), "mbridge_demo_star_sel", "drawable"));
            } else {
                imageView.setBackgroundResource(i0.a(getContext(), "mbridge_demo_star_nor", "drawable"));
            }
            layoutParams.leftMargin = v0.a(getContext(), 7.0f);
            addView(imageView, layoutParams);
        }
    }

    public StarLevelLayoutView(Context context) {
        super(context);
    }

    public StarLevelLayoutView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
