package com.bytedance.sdk.openadsdk.core.ojm;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.sq;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class as extends GestureDetector {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.qor.dkl f14040hn;
    private final hnj hnj;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class hnj extends GestureDetector.SimpleOnGestureListener {
        boolean hnj = false;

        hnj() {
        }

        boolean hn() {
            return this.hnj;
        }

        void hnj() {
            this.hnj = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            this.hnj = true;
            return super.onSingleTapUp(motionEvent);
        }
    }

    public as(Context context) {
        this(context, new hnj());
    }

    public boolean hn() {
        return this.hnj.hn();
    }

    void hnj() {
        this.hnj.hnj();
    }

    @Override // android.view.GestureDetector
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f14040hn.hnj(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public as(Context context, hnj hnjVar) {
        super(context, hnjVar);
        this.hnj = hnjVar;
        this.f14040hn = new com.bytedance.sdk.openadsdk.core.qor.dkl();
        setIsLongpressEnabled(false);
    }

    public com.bytedance.sdk.openadsdk.core.model.bug hnj(Context context, View view) {
        if (this.f14040hn == null) {
            return new com.bytedance.sdk.openadsdk.core.model.bug.hnj().hnj();
        }
        return new com.bytedance.sdk.openadsdk.core.model.bug.hnj().dkl(this.f14040hn.hnj).sk(this.f14040hn.f14154hn).gjv(this.f14040hn.qor).qor(this.f14040hn.gjv).hn(this.f14040hn.f14156sk).hnj(this.f14040hn.dkl).hnj(sq.hnj(view)).hn(sq.qor(view)).gjv(this.f14040hn.dse).sk(this.f14040hn.aq).dkl(this.f14040hn.ojm).hnj(this.f14040hn.bug).hn(com.bytedance.sdk.openadsdk.core.ta.hn().hnj() ? 1 : 2).hnj("vessel").hnj(sq.aq(context)).qor(sq.ta(context)).hn(sq.ojm(context)).hnj();
    }
}
