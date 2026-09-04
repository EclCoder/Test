package com.mbridge.msdk.video.module;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.tools.i0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class MBridgeVastEndCardView extends MBridgeBaseView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ViewGroup f34548m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View f34549n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View f34550o;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeVastEndCardView.this.notifyListener.a(104, "");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends com.mbridge.msdk.widget.a {
        b() {
        }

        @Override // com.mbridge.msdk.widget.a
        protected void a(View view) {
            MBridgeVastEndCardView mBridgeVastEndCardView = MBridgeVastEndCardView.this;
            mBridgeVastEndCardView.notifyListener.a(108, mBridgeVastEndCardView.c());
        }
    }

    public MBridgeVastEndCardView(Context context) {
        super(context);
    }

    private boolean e() {
        this.f34548m = (ViewGroup) findViewById(findID("mbridge_rl_content"));
        this.f34549n = findViewById(findID("mbridge_iv_vastclose"));
        View viewFindViewById = findViewById(findID("mbridge_iv_vastok"));
        this.f34550o = viewFindViewById;
        return isNotNULL(this.f34548m, this.f34549n, viewFindViewById);
    }

    private void f() {
        if (this.f34436e) {
            setMatchParent();
            setBackgroundResource(findColor("mbridge_reward_endcard_vast_bg"));
            setClickable(true);
            ((RelativeLayout.LayoutParams) this.f34548m.getLayoutParams()).addRule(13, -1);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    protected void d() {
        super.d();
        if (this.f34436e) {
            this.f34549n.setOnClickListener(new a());
            this.f34550o.setOnClickListener(new b());
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        int iFindLayout = findLayout("mbridge_reward_endcard_vast");
        if (i0.a(iFindLayout)) {
            this.f34434c.inflate(iFindLayout, this);
            this.f34436e = e();
            d();
            f();
        }
    }

    public void notifyShowListener() {
        this.notifyListener.a(111, "");
    }

    public MBridgeVastEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
    }
}
