package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import re.xQrM.UoyZyZEcGYBpIg;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class BaseView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected RelativeLayout f31856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected RelativeLayout f31857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected RelativeLayout f31858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected ImageView f31859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected TextView f31860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected ProgressBar f31861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected FrameLayout f31862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected LinearLayout f31863h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected RelativeLayout f31864i;
    public a style;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public enum a {
        FULL_TOP_VIEW,
        FULL_MIDDLE_VIEW
    }

    public RelativeLayout getMBridgeFullClose() {
        return this.f31858c;
    }

    public ImageView getMBridgeFullIvClose() {
        return this.f31859d;
    }

    public ProgressBar getMBridgeFullPb() {
        return this.f31861f;
    }

    public RelativeLayout getMBridgeFullPlayContainer() {
        return this.f31856a;
    }

    public RelativeLayout getMBridgeFullPlayerParent() {
        return this.f31857b;
    }

    public TextView getMBridgeFullTvInstall() {
        return this.f31860e;
    }

    public a getStytle() {
        return this.style;
    }

    public FrameLayout getmAnimationContent() {
        return this.f31862g;
    }

    public LinearLayout getmAnimationPlayer() {
        return this.f31863h;
    }

    public void setStytle(a aVar) {
        this.style = aVar;
    }

    public BaseView(Context context) {
        super(context);
        View viewInflate = LayoutInflater.from(getContext()).inflate(i0.a(getContext(), "mbridge_nativex_fullbasescreen", TtmlNode.TAG_LAYOUT), this);
        this.f31864i = (RelativeLayout) viewInflate;
        if (viewInflate != null) {
            this.f31856a = (RelativeLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_rl_playcontainer", "id"));
            this.f31857b = (RelativeLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_player_parent", "id"));
            this.f31858c = (RelativeLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_rl_close", "id"));
            this.f31859d = (ImageView) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_iv_close", "id"));
            this.f31860e = (TextView) viewInflate.findViewById(i0.a(getContext(), UoyZyZEcGYBpIg.YGkoTaZeVs, "id"));
            this.f31861f = (ProgressBar) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_pb_loading", "id"));
            this.f31862g = (FrameLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_animation_content", "id"));
            this.f31863h = (LinearLayout) viewInflate.findViewById(i0.a(getContext(), "mbridge_full_animation_player", "id"));
            viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
    }
}
