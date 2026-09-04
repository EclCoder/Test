package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import wc.XtO.NpmRNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class MBridgeTopFullView extends BaseView {
    public static final String INTERFACE_RESULT = MBridgeTopFullView.class.getName() + "WithResault";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected ImageView f31868j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected TextView f31869k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected TextView f31870l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected StarLevelLayoutView f31871m;

    public TextView getMBridgeFullViewDisplayDscription() {
        return this.f31870l;
    }

    public ImageView getMBridgeFullViewDisplayIcon() {
        return this.f31868j;
    }

    public TextView getMBridgeFullViewDisplayTitle() {
        return this.f31869k;
    }

    public StarLevelLayoutView getStarLevelLayoutView() {
        return this.f31871m;
    }

    public void updateLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        this.f31856a.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(10);
        this.f31857b.setLayoutParams(layoutParams2);
    }

    public MBridgeTopFullView(Context context) {
        super(context);
        View viewInflate = LayoutInflater.from(getContext()).inflate(i0.a(getContext(), "mbridge_nativex_fullscreen_top", TtmlNode.TAG_LAYOUT), this.f31864i);
        if (viewInflate != null) {
            this.f31868j = (ImageView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_tv_display_icon", "id"));
            this.f31869k = (TextView) viewInflate.findViewById(i0.a(getContext(), NpmRNZ.VrhE, "id"));
            this.f31870l = (TextView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_tv_display_description", "id"));
            this.f31871m = (StarLevelLayoutView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_tv_feeds_star", "id"));
            this.f31870l.setTextColor(-7829368);
            viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            updateLayoutParams();
        }
    }
}
