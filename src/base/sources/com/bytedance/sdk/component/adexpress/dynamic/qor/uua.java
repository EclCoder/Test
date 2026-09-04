package com.bytedance.sdk.component.adexpress.dynamic.qor;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dkl.eum;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class uua<E extends eum> implements dse<E> {
    protected com.bytedance.sdk.component.adexpress.dynamic.gjv.dse gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    protected Context f12658hn;
    protected eum hnj;
    protected com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    protected int f12659sk;

    public uua(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk skVar, com.bytedance.sdk.component.adexpress.dynamic.gjv.dse dseVar, int i10) {
        this.f12659sk = i10;
        this.f12658hn = context;
        this.qor = skVar;
        this.gjv = dseVar;
        gjv();
    }

    protected void gjv() {
        this.hnj = new eum(this.f12658hn, this.gjv.xad());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.f12658hn, 200.0f));
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.gjv.dse.hnj(this.f12658hn, 100 - this.f12659sk);
        this.hnj.setLayoutParams(layoutParams);
        try {
            this.hnj.setGuideText(this.gjv.eta());
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.qor.dse
    public void hn() {
        this.hnj.hn();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.qor.dse
    public void hnj() {
        this.hnj.hnj();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.qor.dse
    /* JADX INFO: renamed from: sk, reason: merged with bridge method [inline-methods] */
    public E qor() {
        return (E) this.hnj;
    }

    public uua(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.sk skVar, com.bytedance.sdk.component.adexpress.dynamic.gjv.dse dseVar) {
        this(context, skVar, dseVar, 0);
    }
}
