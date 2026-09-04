package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.vungle.ads.internal.protos.Sdk$SDKError;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class TTAdDislikeToast extends com.bytedance.sdk.openadsdk.core.dkl.qor {
    private static String sDislikeSendTip;
    private static String sDislikeTip;
    private static String sSkipText;
    private final Handler mHandler;
    private TextView mTextView;

    public TTAdDislikeToast(Context context) {
        this(context, null);
    }

    public static String getDislikeSendTip() {
        if (sDislikeSendTip == null) {
            Context contextHnj = com.bytedance.sdk.openadsdk.core.oj.hnj();
            sDislikeSendTip = wu.hnj(contextHnj, "tt_feedback_thank_text") + "\n" + wu.hnj(contextHnj, "tt_feedback_experience_text");
        }
        return sDislikeSendTip;
    }

    public static String getDislikeTip() {
        if (sDislikeTip == null) {
            sDislikeTip = wu.hnj(com.bytedance.sdk.openadsdk.core.oj.hnj(), "tt_feedback_submit_text");
        }
        return sDislikeTip;
    }

    public static String getSkipText() {
        if (sSkipText == null) {
            sSkipText = wu.hnj(com.bytedance.sdk.openadsdk.core.oj.hnj(), "tt_reward_screen_skip_tx");
        }
        return sSkipText;
    }

    private void initToast(Context context) {
        TextView textView = new TextView(context);
        this.mTextView = textView;
        textView.setClickable(false);
        this.mTextView.setFocusable(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = sq.hn(getContext(), 75.0f);
        int iHn = sq.hn(com.bytedance.sdk.openadsdk.core.oj.hnj(), 16.0f);
        int iHn2 = sq.hn(com.bytedance.sdk.openadsdk.core.oj.hnj(), 12.0f);
        this.mTextView.setPadding(iHn, iHn2, iHn, iHn2);
        this.mTextView.setLayoutParams(layoutParams);
        this.mTextView.setTextColor(-1);
        this.mTextView.setTextSize(16.0f);
        this.mTextView.setGravity(8388611);
        Drawable drawableQor = wu.qor(getContext(), "tt_dislike_toast");
        int iHn3 = sq.hn(getContext(), 16.0f);
        drawableQor.setBounds(0, 0, iHn3, iHn3);
        this.mTextView.setCompoundDrawablePadding(iHn3 / 2);
        this.mTextView.setCompoundDrawables(drawableQor, null, null, null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.argb(Sdk$SDKError.b.INVALID_JSON_BID_PAYLOAD_VALUE, 37, 37, 37));
        gradientDrawable.setCornerRadius(sq.hn(com.bytedance.sdk.openadsdk.core.oj.hnj(), 12.0f));
        this.mTextView.setBackground(gradientDrawable);
        addView(this.mTextView);
    }

    public static void onResourceUpdated() {
        Context contextHnj = com.bytedance.sdk.openadsdk.core.oj.hnj();
        sSkipText = wu.hnj(contextHnj, "tt_reward_screen_skip_tx");
        sDislikeTip = wu.hnj(contextHnj, "tt_feedback_submit_text");
        sDislikeSendTip = wu.hnj(contextHnj, "tt_feedback_thank_text") + "\n" + wu.hnj(contextHnj, "tt_feedback_experience_text");
    }

    public void hide() {
        setVisibility(8);
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public void onDestroy() {
        setVisibility(8);
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public void show(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mHandler.removeCallbacksAndMessages(null);
        this.mHandler.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.1
            @Override // java.lang.Runnable
            public void run() {
                if (TTAdDislikeToast.this.mTextView != null) {
                    TTAdDislikeToast.this.mTextView.setText(String.valueOf(str));
                }
                TTAdDislikeToast.this.setVisibility(0);
            }
        });
        this.mHandler.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.2
            @Override // java.lang.Runnable
            public void run() {
                TTAdDislikeToast.this.setVisibility(8);
            }
        }, 2000L);
    }

    public TTAdDislikeToast(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTAdDislikeToast(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mHandler = new Handler(Looper.getMainLooper());
        setVisibility(8);
        setClickable(false);
        setFocusable(false);
        initToast(context);
    }
}
