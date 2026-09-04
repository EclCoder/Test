package com.bytedance.sdk.openadsdk.component.ojm;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.ta;
import com.bytedance.sdk.openadsdk.core.widget.uua;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class aq {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static Drawable f13363hn;
    private static boolean hnj;
    private TextView gjv;
    private uua qor;

    public static Drawable qor() {
        return f13363hn;
    }

    public void hn() {
        if (hnj) {
            return;
        }
        try {
            int iOjm = ta.hn().ojm();
            if (iOjm != 0) {
                f13363hn = oj.hnj().getResources().getDrawable(iOjm);
            }
            hnj = true;
        } catch (Throwable unused) {
            hnj = true;
        }
    }

    public void hnj(qor qorVar, as asVar, float f10, float f11, boolean z10) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        if (qorVar != null) {
            this.qor = qorVar.getHostAppIcon();
            this.gjv = qorVar.getHostAppName();
            View userInfo = qorVar.getUserInfo();
            if (qorVar instanceof gjv) {
                uua uuaVar = this.qor;
                if (uuaVar != null && (layoutParams2 = uuaVar.getLayoutParams()) != null) {
                    if (asVar.zf() == 1) {
                        int iHn = sq.hn(this.qor.getContext(), 40.0f);
                        layoutParams2.width = iHn;
                        layoutParams2.height = iHn;
                    } else {
                        int iHn2 = sq.hn(this.qor.getContext(), 30.0f);
                        layoutParams2.width = iHn2;
                        layoutParams2.height = iHn2;
                    }
                    this.qor.setLayoutParams(layoutParams2);
                }
                if (this.gjv != null) {
                    if (asVar.zf() == 1) {
                        this.gjv.setTextSize(30.0f);
                    } else {
                        this.gjv.setTextSize(24.0f);
                    }
                }
                if (userInfo != null && (layoutParams = userInfo.getLayoutParams()) != null) {
                    if (asVar.zf() == 1) {
                        layoutParams.height = sq.hn(userInfo.getContext(), 107.0f);
                    } else {
                        layoutParams.height = sq.hn(userInfo.getContext(), 60.0f);
                    }
                    userInfo.setLayoutParams(layoutParams);
                }
            }
            if (userInfo != null) {
                userInfo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.ojm.aq.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                    }
                });
            }
        }
    }

    public void hnj() {
        String strAq = ta.hn().aq();
        if (TextUtils.isEmpty(strAq)) {
            this.gjv.setVisibility(8);
        } else {
            this.gjv.setText(strAq);
        }
        hn();
        try {
            Drawable drawable = f13363hn;
            if (drawable == null) {
                this.qor.setVisibility(8);
                return;
            }
            this.qor.setImageDrawable(drawable);
            if (this.gjv.getVisibility() == 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.qor.getLayoutParams();
                marginLayoutParams.setMargins(0, 0, 0, 0);
                this.qor.setLayoutParams(marginLayoutParams);
            }
        } catch (Throwable unused) {
            this.qor.setVisibility(8);
        }
    }
}
