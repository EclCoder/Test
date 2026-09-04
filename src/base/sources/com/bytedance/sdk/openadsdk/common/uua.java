package com.bytedance.sdk.openadsdk.common;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class uua extends com.bytedance.sdk.openadsdk.core.dkl.qor implements com.bytedance.sdk.openadsdk.qor.ta.hn {
    private boolean dkl;
    private final com.bytedance.sdk.openadsdk.qor.ta dse;
    private Context gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private as f13319hn;
    private View hnj;
    private hnj qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private String f13320sk;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
        void hn(View view);

        void hnj(View view);

        void hnj(FilterWord filterWord);
    }

    public uua(Context context, as asVar) {
        this(context.getApplicationContext());
        this.f13319hn = asVar;
        this.gjv = context;
        gjv();
        sk();
    }

    private com.bytedance.sdk.openadsdk.qor.bug.hnj dkl() {
        return new com.bytedance.sdk.openadsdk.qor.bug.hnj() { // from class: com.bytedance.sdk.openadsdk.common.uua.2
            @Override // com.bytedance.sdk.openadsdk.qor.bug.hnj
            public void hn() {
                uua.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.qor.bug.hnj
            public void hnj() {
                uua.this.setVisibility(8);
            }

            @Override // com.bytedance.sdk.openadsdk.qor.bug.hnj
            public void qor() {
                uua.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.qor.bug.hnj
            public void hnj(int i10, FilterWord filterWord, String str) {
                uua.this.dse.qor(str);
                uua.this.setVisibility(0);
            }
        };
    }

    private void gjv() {
        this.dse.hnj(this.f13319hn.ldn());
        this.dse.hnj(this);
    }

    private void sk() {
        com.bytedance.sdk.openadsdk.qor.ta taVar;
        as asVar = this.f13319hn;
        if (asVar == null || (taVar = this.dse) == null) {
            return;
        }
        taVar.hnj(asVar.yl());
    }

    public void hn() {
        setVisibility(8);
        this.dkl = false;
        hnj hnjVar = this.qor;
        if (hnjVar != null) {
            hnjVar.hn(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.sdk.openadsdk.qor.ta taVar = this.dse;
        if (taVar != null) {
            taVar.hnj();
        }
    }

    public void qor() {
        Context context = this.gjv;
        if (context instanceof Activity) {
            boolean zIsFinishing = ((Activity) context).isFinishing();
            com.bytedance.sdk.openadsdk.qor.bug bugVar = new com.bytedance.sdk.openadsdk.qor.bug(this.gjv, this.dse);
            bugVar.hnj(dkl());
            bugVar.hnj(this.f13319hn);
            if (zIsFinishing || bugVar.isShowing()) {
                return;
            }
            bugVar.show();
        }
    }

    public void setCallback(hnj hnjVar) {
        this.qor = hnjVar;
    }

    public void setDislikeSource(String str) {
        this.f13320sk = str;
        this.dse.hn(str);
    }

    private void hnj(Context context, AttributeSet attributeSet) {
        setClickable(true);
        setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.uua.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (uua.this.dse != null) {
                    uua.this.dse.sk();
                } else {
                    uua.this.hn();
                }
            }
        });
        setBackgroundColor(Color.parseColor("#80000000"));
        this.hnj = new com.bytedance.sdk.openadsdk.qor.ojm(context, this.dse);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = sq.hn(getContext(), 20.0f);
        layoutParams.rightMargin = sq.hn(getContext(), 20.0f);
        this.hnj.setLayoutParams(layoutParams);
        this.hnj.setClickable(true);
        sk();
    }

    public uua(Context context) {
        this(context, (AttributeSet) null);
    }

    public uua(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public uua(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.dkl = false;
        this.dse = new com.bytedance.sdk.openadsdk.qor.ta();
        hnj(context, attributeSet);
    }

    public void hnj() {
        if (this.hnj.getParent() == null) {
            addView(this.hnj);
        }
        setVisibility(0);
        this.dkl = true;
        hnj hnjVar = this.qor;
        if (hnjVar != null) {
            hnjVar.hnj(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.qor.ta.hn
    public void hnj(int i10) {
        if (com.bytedance.sdk.openadsdk.qor.ta.f14599hn == i10) {
            FilterWord filterWordHn = this.dse.hn();
            if (filterWordHn == null || com.bytedance.sdk.openadsdk.qor.ta.hnj.equals(filterWordHn)) {
                return;
            }
            hnj hnjVar = this.qor;
            if (hnjVar != null) {
                try {
                    hnjVar.hnj(filterWordHn);
                } catch (Throwable unused) {
                }
            }
            hn();
            return;
        }
        if (com.bytedance.sdk.openadsdk.qor.ta.qor == i10) {
            hn();
        } else if (com.bytedance.sdk.openadsdk.qor.ta.f14600sk == i10) {
            qor();
        }
    }
}
