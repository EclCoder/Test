package com.facebook.share.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.internal.e;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class SendButton extends b {
    public SendButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, "fb_send_button_create", "fb_send_button_did_tap");
    }

    @Override // com.facebook.t
    protected int getDefaultRequestCode() {
        return e.c.Message.g();
    }

    @Override // com.facebook.t
    protected int getDefaultStyleResource() {
        return com.facebook.share.a.f16012a;
    }

    @Override // com.facebook.share.widget.b
    protected c getDialog() {
        a aVar;
        if (getFragment() != null) {
            aVar = new a(getFragment(), getRequestCode());
        } else {
            aVar = getNativeFragment() != null ? new a(getNativeFragment(), getRequestCode()) : new a(getActivity(), getRequestCode());
        }
        aVar.i(getCallbackManager());
        return aVar;
    }
}
