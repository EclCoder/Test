package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.vk.openvk.hnj.hnj.hnj.qor.a;
import com.bytedance.sdk.component.utils.wu;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class apu {
    private ViewGroup aq;
    private boolean dkl = false;
    private a dse;
    private com.bytedance.sdk.openadsdk.core.mjg.hn.hnj gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private TextView f14253hn;
    private View hnj;
    private Context qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private hn f14254sk;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hn {
        void dnm();

        boolean ta();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum hnj {
        PAUSE_VIDEO,
        RELEASE_VIDEO,
        START_VIDEO
    }

    private void gjv() {
        View view = this.hnj;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qor() {
        if (this.qor == null) {
            return;
        }
        gjv();
    }

    private void hn() {
        this.dse = null;
    }

    public void hnj(Context context, ViewGroup viewGroup) {
        if (context == null || viewGroup == null) {
            return;
        }
        this.aq = viewGroup;
        this.qor = com.bytedance.sdk.openadsdk.core.oj.hnj().getApplicationContext();
    }

    private void hnj(Context context, View view, boolean z10) {
        ViewGroup.LayoutParams layoutParamsHnj;
        if (context == null || view == null || this.hnj != null || (layoutParamsHnj = hnj(this.aq)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.fc.sk skVar = new com.bytedance.sdk.openadsdk.fc.sk(context);
        this.hnj = skVar;
        skVar.setLayoutParams(layoutParamsHnj);
        this.aq.addView(this.hnj);
        this.f14253hn = (TextView) this.hnj.findViewById(com.bytedance.sdk.openadsdk.utils.jip.f14695yl);
        View viewFindViewById = this.hnj.findViewById(com.bytedance.sdk.openadsdk.utils.jip.rx);
        if (z10) {
            viewFindViewById.setClickable(true);
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.apu.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    apu.this.qor();
                    if (apu.this.gjv != null) {
                        apu.this.gjv.hnj(hnj.START_VIDEO, (String) null);
                    }
                }
            });
        } else {
            viewFindViewById.setOnClickListener(null);
            viewFindViewById.setClickable(false);
        }
    }

    private ViewGroup.LayoutParams hnj(ViewGroup viewGroup) {
        if (viewGroup instanceof RelativeLayout) {
            return new RelativeLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof LinearLayout) {
            return new LinearLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof FrameLayout) {
            return new FrameLayout.LayoutParams(-1, -1);
        }
        return null;
    }

    public void hnj(com.bytedance.sdk.openadsdk.core.mjg.hn.hnj hnjVar, hn hnVar) {
        this.f14254sk = hnVar;
        this.gjv = hnjVar;
    }

    public boolean hnj(int i10, a aVar, boolean z10) {
        Context context = this.qor;
        if (context == null || aVar == null) {
            return true;
        }
        hnj(context, this.aq, z10);
        this.dse = aVar;
        if (i10 == 1 || i10 == 2) {
            return hnj(i10);
        }
        return true;
    }

    private boolean hnj(int i10) {
        hn hnVar;
        if (hnj() || this.dkl) {
            return true;
        }
        if (this.gjv != null && (hnVar = this.f14254sk) != null) {
            if (hnVar.ta()) {
                this.gjv.sk(null, null);
            }
            this.gjv.hnj(hnj.PAUSE_VIDEO, (String) null);
        }
        hnj(this.dse, true);
        return false;
    }

    public void hnj(boolean z10) {
        if (z10) {
            hn();
        }
        gjv();
    }

    public boolean hnj() {
        View view = this.hnj;
        return view != null && view.getVisibility() == 0;
    }

    private void hnj(a aVar, boolean z10) {
        View view;
        String str;
        View view2;
        if (aVar == null || (view = this.hnj) == null || this.qor == null || view.getVisibility() == 0) {
            return;
        }
        hn hnVar = this.f14254sk;
        if (hnVar != null) {
            hnVar.dnm();
        }
        double dCeil = Math.ceil((aVar.G() * 1.0d) / 1048576.0d);
        if (z10) {
            str = String.format(wu.hnj(this.qor, "tt_video_without_wifi_tips"), Float.valueOf(Double.valueOf(dCeil).floatValue()));
        } else {
            str = wu.hnj(this.qor, "tt_video_without_wifi_tips") + wu.hnj(this.qor, "tt_video_bytesize");
        }
        sq.hnj(this.hnj, 0);
        sq.hnj(this.f14253hn, str);
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: ");
        if (!sq.gjv(this.hnj) || (view2 = this.hnj) == null) {
            return;
        }
        view2.bringToFront();
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: bringToFront");
    }
}
